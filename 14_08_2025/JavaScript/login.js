// Get elements
const userIdInput = document.getElementById('userId');
const passwordInput = document.getElementById('password');
const loginBtn = document.getElementById('loginBtn');
const logoutBtn = document.getElementById('logoutBtn');
const status = document.getElementById('status');

// Check if user is already logged in
if(localStorage.getItem('userId')) {
  status.textContent = `Logged in as: ${localStorage.getItem('userId')}`;
}

// Login button click
loginBtn.addEventListener('click', () => {
  const userId = userIdInput.value.trim();
  const password = passwordInput.value.trim();

  if(userId && password) {  // basic check
    localStorage.setItem('userId', userId);  // store in localStorage
    status.textContent = `Logged in as: ${userId}`;
    alert('Login successful!');
  } else {
    alert('Please enter User ID and Password.');
  }
});

// Logout button click
logoutBtn.addEventListener('click', () => {
  localStorage.removeItem('userId');  // remove from localStorage
  status.textContent = 'Logged out';
  alert('Logout successful!');
});
