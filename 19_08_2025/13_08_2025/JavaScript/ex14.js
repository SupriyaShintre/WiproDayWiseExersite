const cities = ["Delhi", "Mumbai", "Chennai", "Kolkata", "Bangalore", "Pune"];

function loadCities() {
    const sortedCities = cities.slice().sort();

    const dropdown = document.getElementById("cityDropdown");

    dropdown.innerHTML = "";

    sortedCities.forEach(city => {
        let option = document.createElement("option");
        option.value = city;
        option.textContent = city;
        dropdown.appendChild(option);
    });
}
