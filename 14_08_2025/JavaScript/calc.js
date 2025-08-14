// calc.js
import { multiply, divide } from './operations.js';  // Import functions

// Test multiply
console.log("Multiply 5 * 3 =", multiply(5, 3));  // Output: 15

// Test divide
console.log("Divide 10 / 2 =", divide(10, 2));    // Output: 5
console.log("Divide 10 / 0 =", divide(10, 0));    // Output: Error: Division by zero!
