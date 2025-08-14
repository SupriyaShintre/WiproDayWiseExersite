
class Calculator {

    add(a: number, b: number): number {
        return a + b;
    }

    subtract(a: number, b: number): number {
        return a - b;
    }
}

const calc = new Calculator();

console.log("Addition of 10 and 5:", calc.add(10, 5));
console.log("Subtraction of 10 and 5:", calc.subtract(10, 5));
