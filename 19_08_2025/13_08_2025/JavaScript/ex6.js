const names = ["Alice", "Bob", "Charlie", "David", "Eva", "Frank"];

// Filter names with length <= 5 and convert them to uppercase
const shortNamesUpper = names
  .filter(name => name.length <= 5)
  .map(name => name.toUpperCase());

console.log(shortNamesUpper);
