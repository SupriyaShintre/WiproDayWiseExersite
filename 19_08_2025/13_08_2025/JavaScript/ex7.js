const persons = [
  { name: "Alice", age: 17, city: "Mumbai" },
  { name: "Bob", age: 22, city: "Pune" },
  { name: "Charlie", age: 18, city: "Delhi" },
  { name: "David", age: 16, city: "Chennai" },
  { name: "Eva", age: 25, city: "Bangalore" }
];

// Filter people eligible to vote (age >= 18)
const eligibleVoters = persons.filter(person => person.age >= 18);

console.log(eligibleVoters);
