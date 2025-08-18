
function sumNumbers(...numbers) {
  return numbers.reduce((total, num) => total + num, 0);
}

// Example usage
console.log(sumNumbers(1, 2, 3));         // Output: 6
console.log(sumNumbers(10, 20, 30, 40));  // Output: 100
console.log(sumNumbers(5));               // Output: 5
console.log(sumNumbers());                // Output: 0
