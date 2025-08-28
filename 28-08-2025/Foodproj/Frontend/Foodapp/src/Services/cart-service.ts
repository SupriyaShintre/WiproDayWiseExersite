import { Injectable } from '@angular/core';
import { OrderItem } from '../Interface/order-item';

@Injectable({ providedIn: 'root' })
export class CartService {
  cart: OrderItem[] = [];

  add(foodId: number, qty: number = 1) {
    const existing = this.cart.find(i => i.foodId === foodId);
    if (existing) existing.quantity += qty;
    else this.cart.push({ foodId, quantity: qty });
  }

  remove(foodId: number) {
    this.cart = this.cart.filter(i => i.foodId !== foodId);
  }

  clear() {
    this.cart = [];
  }

  total(getPrice: (id:number)=>number) {
    return this.cart.reduce((sum, item) => sum + (getPrice(item.foodId!) || 0) * item.quantity, 0);
  }
}
