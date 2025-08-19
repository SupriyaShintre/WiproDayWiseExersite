let numbers = [10, 20, 30, 40, 50];

let sumArray = (arr) => {
    return arr.reduce((total, num) => total + num, 0);
};

console.log("Sum of array:", sumArray(numbers));
