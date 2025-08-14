class Box<T> {
  private value: T;  

  constructor(value: T) {
    this.value = value;
  }

  getValue(): T {
    return this.value;
  }
}


let numberBox = new Box<number>(100);
console.log("Number value:", numberBox.getValue());

let stringBox = new Box<string>("Hello Generics");
console.log("String value:", stringBox.getValue());

let booleanBox = new Box<boolean>(true);
console.log("Boolean value:", booleanBox.getValue());
