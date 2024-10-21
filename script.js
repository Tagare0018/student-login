document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting

    const studentId = document.getElementById('studentId').value;
    const password = document.getElementById('password').value;

    // Simple validation
    if (studentId === "student123" && password === "password") {
        document.getElementById('message').textContent = "Login successful!";
        document.getElementById('message').style.color = "green";
    } else {
        document.getElementById('message').textContent = "Invalid Student ID or Password.";
    }
});
