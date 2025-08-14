// ex12app.js
import User from './ex12user.js';  // note the './' if in same folder

const user1 = new User('Supriya');
document.getElementById('output').textContent = user1.getName();
