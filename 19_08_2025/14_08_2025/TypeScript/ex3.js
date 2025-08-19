var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.subtract = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
var calc = new Calculator();
console.log("Addition of 10 and 5:", calc.add(10, 5));
console.log("Subtraction of 10 and 5:", calc.subtract(10, 5));
