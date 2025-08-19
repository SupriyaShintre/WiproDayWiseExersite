function validateEmail() {
  const email = document.getElementById("email").value.trim();
  const emailError = document.getElementById("emailError");
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  if (email === "" || !emailPattern.test(email)) {
    emailError.style.visibility = "visible";
    return false;
  } else {
    emailError.style.visibility = "hidden";
    return true;
  }
}

function validatePassword() {
  const password = document.getElementById("password").value.trim();
  const passwordError = document.getElementById("passwordError");

  if (password === "") {
    passwordError.style.visibility = "visible";
    return false;
  } else {
    passwordError.style.visibility = "hidden";
    return true;
  }
}

function handleLogin() {
  const emailValid = validateEmail();
  const passwordValid = validatePassword();

  if (emailValid && passwordValid) {
    alert("Login successful!");
  }
}
