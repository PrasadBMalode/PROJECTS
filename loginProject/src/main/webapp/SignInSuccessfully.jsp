<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!-- Added viewport meta tag for responsiveness -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Success</title>

    <!-- Bootstrap 5 CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <!-- Bootstrap Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <!-- Navbar Brand -->
            <a class="navbar-brand fw-bold" href="index.jsp">X-WorkZ</a>

            <!-- Navbar Toggler for Mobile -->
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- Navbar Links (Right Aligned) -->
            <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <!-- Replaced the floating button with this semantic nav link -->
                        <a class="nav-link active text-white fw-bold" href="index.jsp">Home</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>


    <div class="container text-center mt-5 pt-4">
        <h1 class="display-5 fw-bold">Hi, You Logged In Successfully</h1>


        <img
            src="https://img.freepik.com/free-vector/login-concept-illustration_114360-739.jpg"
            alt="Login successful"
            class="img-fluid rounded shadow-sm mt-4"
            style="max-width: 400px;"
        >
    </div>

    <!-- Bootstrap 5 JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>