const persons = [
  { name: "Alice", age: 17, city: "Mumbai" },
  { name: "Bob", age: 22, city: "Pune" },
  { name: "Charlie", age: 18, city: "Delhi" },
  { name: "David", age: 16, city: "Chennai" },
  { name: "Eva", age: 25, city: "Bangalore" }
];

// Use map to add status property
const updatedPersons = persons.map(person => {
  return {
    name: person.name,
    age: person.age,
    city: person.city,
    status: person.age >= 18 ? "Adult" : "Minor"
  };
});

console.log(updatedPersons);
