import { ChangeDetectorRef, Component } from '@angular/core';
import { Router } from '@angular/router';
import { FoodService } from '../../Services/food-service';
import { Food } from '../../Interface/food';
import { CartService } from '../../Services/cart-service';
import { Order } from '../../Interface/order';
import { OrderService } from '../../Services/order-service';
import { CurrencyPipe } from '@angular/common';   

@Component({
  selector: 'app-food-list',
  imports: [CurrencyPipe],
  templateUrl: './food-list.html',
  styleUrl: './food-list.css'
})
export class FoodList {
  foods: Food[] = [];
  total = 0;
  cartCount = 0;

  constructor(
    private router: Router,
    private foodService: FoodService,
    private cdr: ChangeDetectorRef,
    private cart: CartService,
    private orderService: OrderService
  ){}

  ngOnInit(){
    this.foodService.getFoods().subscribe({
      next: (data) => {
        this.foods = data;
        this.recompute();
        this.cdr.detectChanges();
      },
      error: (err) => {
        console.error(err);
        alert("Error while fetching food data");
      }
    });
  }

  priceOf(id:number){ return this.foods.find(f => f.id === id)?.price ?? 0; }

  recompute(){
    this.total = this.cart.total(id => this.priceOf(id));
    this.cartCount = this.cart.cart.reduce((n,i)=> n + i.quantity, 0);
  }

  add(foodId:number){
    this.cart.add(foodId, 1);
    this.recompute();
  }

  addAndGoToPay(foodId:number){
    this.add(foodId);
    this.proceedToPay();
  }

  proceedToPay(){
    if (this.cart.cart.length === 0) return;

    const order: Order = { items: this.cart.cart.map(i => ({ foodId: i.foodId, quantity: i.quantity })) };

    // Create order first (backend calculates orderValue, sets orderId)
    this.orderService.save(order).subscribe({
      next: (created) => {
        // Navigate with params the Payment component already expects
        const orderId = created.orderId ?? '';
        const orderPrice = created.orderValue ?? this.total;
        this.cart.clear();
        this.router.navigate(['/payment', orderId, orderPrice]);
      },
      error: (err) => {
        console.error(err);
        alert('Failed to create order');
      }
    });
  }

  logout(){
    localStorage.removeItem('tokenValue');
    this.router.navigate(['/login']);
  }

  toCart(){
    this.router.navigate(['/orders']); // keep if you still want a dedicated cart page
  }
}
