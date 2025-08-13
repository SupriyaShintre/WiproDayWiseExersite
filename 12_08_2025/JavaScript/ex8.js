const employees = [
  { name: "John", role: "Manager", empId: 101, salary: 75000 },
  { name: "Alice", role: "Developer", empId: 102, salary: 60000 },
  { name: "Bob", role: "QA", empId: 103, salary: 55000 },
  { name: "Carol", role: "Manager", empId: 104, salary: 80000 },
  { name: "David", role: "Developer", empId: 105, salary: 62000 },
];

// Filter managers and sum their salaries
const totalManagerSalary = employees
  .filter(emp => emp.role === "Manager")
  .reduce((total, emp) => total + emp.salary, 0);

console.log("Total salary drawn by all Managers: " + totalManagerSalary);
