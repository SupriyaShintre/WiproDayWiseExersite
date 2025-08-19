const persons = [
  { name: "Alice", age: 17, city: "Mumbai" },
  { name: "Bob", age: 22, city: "Pune" },
  { name: "Charlie", age: 18, city: "Delhi" },
  { name: "David", age: 16, city: "Chennai" },
  { name: "Eva", age: 25, city: "Bangalore" }
];

for (let i = 0; i < persons.length; i++) {
  if (persons[i].age >= 18) {
    persons[i].status = "Adult";
  } else {
    persons[i].status = "Minor";
  }
}

console.log(persons);
