document.addEventListener('DOMContentLoaded', function () {
    alert('Hello, JavaScript is connected!');
});

// Handle "Start" button click (form submit)
document.getElementById('start-btn').addEventListener('click', function(event) {
    const form = document.getElementById('ticket-form');

    // Prevent default form submission to handle it via JavaScript
    event.preventDefault();

    // Check if the form is valid
    if (form.checkValidity()) {
        // If the form is valid, redirect to page2.html
        window.location.href = 'page2.html';
    } else {
        // If the form is invalid, prevent submission and show HTML5 validation messages
        event.preventDefault();
    }
});

// Handle "View Reservation" button click
document.getElementById('view-btn').addEventListener('click', function(event) {
    // Redirect to page3.html without any form validation
    window.location.href = 'page3.html';
});
