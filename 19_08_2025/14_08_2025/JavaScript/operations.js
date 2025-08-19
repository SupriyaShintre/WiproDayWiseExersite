// operations.js

// Multiply two numbers
export function multiply(a, b) {
  return a * b;
}

// Divide two numbers, handle division by zero
export function divide(a, b) {
  if (b === 0) {
    return "Error: Division by zero!";
  }
  return a / b;
}
