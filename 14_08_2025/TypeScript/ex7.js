var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var numberBox = new Box(100);
console.log("Number value:", numberBox.getValue());
var stringBox = new Box("Hello Generics");
console.log("String value:", stringBox.getValue());
var booleanBox = new Box(true);
console.log("Boolean value:", booleanBox.getValue());
