const date = new Date("2030-08-13");

const days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

const dayIndex = date.getDay();

const dayName = days[dayIndex];

console.log("13th August 2030 will be a " + dayName);
