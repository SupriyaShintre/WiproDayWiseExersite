const questions = [
    { q: "What is the capital of India?", options: ["Delhi", "Mumbai", "Kolkata", "Chennai"], a: "Delhi" },
    { q: "Which language is used for web apps?", options: ["Python", "JavaScript", "C++", "Java"], a: "JavaScript" },
    { q: "What does HTML stand for?", options: ["Hyper Text Markup Language", "Home Tool Markup Language", "Hyperlinks Text Mark Language", "High Text Markup Language"], a: "Hyper Text Markup Language" }
];

let i = 0, score = 0;

function loadQuestion() {
    document.getElementById("feedback").textContent = "";

    const currentQ = questions[i]; // more descriptive
    document.getElementById("question").textContent = currentQ.q;

    const opts = document.getElementById("options");
    opts.innerHTML = "";

    currentQ.options.forEach(option => {
        const li = document.createElement("li");
        li.textContent = option;
        li.onclick = () => {
            document.getElementById("feedback").textContent = (option === currentQ.a ? "Correct!" : "Wrong!");
            if(option === currentQ.a) score++;
            document.getElementById("score").textContent = score;
        }
        opts.appendChild(li);
    });
}

document.getElementById("nextBtn").onclick = () => {
    i++;
    if(i < questions.length) loadQuestion(); // correct function name
    else {
        document.getElementById("question").textContent = "Quiz Finished!";
        document.getElementById("options").innerHTML = "";
        document.getElementById("feedback").textContent = `Your final score is ${score}/${questions.length}`;
        document.getElementById("nextBtn").style.display = "none";
    }
}


loadQuestion();
