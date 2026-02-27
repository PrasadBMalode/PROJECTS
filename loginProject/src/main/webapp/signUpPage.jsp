<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign Up Page</title>

    <!-- Bootstrap 5 CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
        }

        /* Keeping your original error styles and adding Bootstrap text-danger class */
        .error {
            color: red;
            font-size: 13px;
            margin-bottom: 8px;
            font-weight: bold;
        }
    </style>
</head>

<!-- Added Bootstrap utility classes: vh-100 (full height), d-flex (flexbox),
     align-items-center & justify-content-center (vertical/horizontal centering) -->
<body class="d-flex align-items-center justify-content-center vh-100">

    <!--
       The .form-container is replaced with a Bootstrap .card component.
       'max-width: 400px' preserves your original size on desktop,
       while 'width: 100%' allows it to shrink on mobile devices.
       'background-color' preserves your original styling choice.
    -->
    <div class="card shadow p-4" style="width: 100%; max-width: 400px; background-color: rgb(176,196,222);">

        <form action="getSignUp" method="get" onsubmit="return validateForm()">

            <!-- Form Group: Username -->
            <div class="mb-3">
                <label for="userName" class="form-label">Username : </label>
                <input type="text" placeholder="Enter your username"
                       class="form-control"
                       name="userName" id="userName"
                       oninput="validateUserName()">
                <div class="error" id="userNameError"></div>
            </div>

            <!-- Form Group: Phone Number -->
            <div class="mb-3">
                <label for="number" class="form-label">Phone Number : </label>
                <input type="number" placeholder="Enter your phoneNumber"
                       class="form-control"
                       name="number" id="number"
                       oninput="validateNumber()">
                <div class="error" id="numberError"></div>
            </div>

            <!-- Form Group: Email -->
            <div class="mb-3">
                <label for="email" class="form-label">Email : </label>
                <input type="email" placeholder="Enter your email"
                       class="form-control"
                       name="email" id="email"
                       oninput="validateEmail()">
                <div class="error" id="emailError"></div>
            </div>

            <!-- Form Group: Password -->
            <div class="mb-3">
                <label for="password" class="form-label">Password : </label>
                <input type="password" placeholder="Enter your password"
                       class="form-control"
                       name="password" id="password"
                       oninput="validatePassword(); validateConfirmPassword();">
                <div class="error" id="passwordError"></div>
            </div>

            <!-- Form Group: Confirm Password -->
            <div class="mb-3">
                <label for="confirmPassword" class="form-label">Confirm Password : </label>
                <input type="password" placeholder="Confirm your Password"
                       class="form-control"
                       name="confirmPassword" id="confirmPassword"
                       oninput="validateConfirmPassword()">
                <div class="error" id="confirmPasswordError"></div>
            </div>

            <div class="d-grid mt-3">
                <button type="submit" class="btn btn-primary">SignUp</button>
            </div>

        </form>

    </div>

<!-- Original Script Logic Unchanged -->
<script>

function validateUserName() {
    let userName = document.getElementById("userName").value.trim();
    let error = document.getElementById("userNameError");

    error.innerHTML = "";

    if (userName.length <= 3 || userName.length >= 15 || !/^[A-Za-z]+$/.test(userName)) {
        error.innerHTML = "Username must be between 4 and 14 characters, Numbers are not allowed.";
        return false;
    }
    return true;
}

function validateNumber() {
    let number = document.getElementById("number").value.trim();
    let error = document.getElementById("numberError");

    error.innerHTML = "";

    if (number.length !== 10 || isNaN(number)) {
        error.innerHTML = "Mobile number must be exactly 10 digits.";
        return false;
    }
    return true;
}

function validateEmail() {
    let email = document.getElementById("email").value.trim();
    let error = document.getElementById("emailError");

    error.innerHTML = "";

    if (!email.includes("@gmail.com") || email.length <= 13 || email.length >= 25) {
        error.innerHTML = "Email must be a valid Gmail between 14 and 24 characters.";
        return false;
    }
    return true;
}

function validatePassword() {
    let password = document.getElementById("password").value;
    let error = document.getElementById("passwordError");

    error.innerHTML = "";

    if (password.length !== 8) {
        error.innerHTML = "Password must be exactly 8 characters.";
        return false;
    }

    if (password.charAt(0) !== password.charAt(0).toUpperCase()) {
        error.innerHTML = "First letter must be uppercase.";
        return false;
    }

    let specialChars = password.replace(/[a-zA-Z0-9]/g, '');
    if (specialChars.length < 2) {
        error.innerHTML = "Password must contain at least 2 special characters.";
        return false;
    }

    return true;
}

function validateConfirmPassword() {
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;
    let error = document.getElementById("confirmPasswordError");

    error.innerHTML = "";

    if (password !== confirmPassword) {
        error.innerHTML = "Passwords do not match.";
        return false;
    }

    return true;
}

function validateForm() {
    return validateUserName() &&
           validateNumber() &&
           validateEmail() &&
           validatePassword() &&
           validateConfirmPassword();
}

</script>

</body>
</html>