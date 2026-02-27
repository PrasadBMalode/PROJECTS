<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - X-Workz</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            /* Set the background image */
            background-image: url("https://picsum.photos/seed/xworkz/1920/1080.jpg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;

            /* Ensure the background covers the full viewport height */
            min-height: 100vh;

            /* Flexbox to vertically center content if we add more body content later */
            display: flex;
            flex-direction: column;
        }

        /* Optional: Add a dark overlay to the whole page to make text pop,
           or keep it clean as per the original request.
           Here I keep it clean but ensure the navbar has a background. */
    </style>
</head>

<body>

    <!-- ===================== Navigation Bar ===================== -->
    
    <nav class="navbar navbar-light bg-white bg-opacity-75 shadow-sm fixed-top w-100">
        <div class="container d-flex justify-content-between align-items-center py-2">

            <!-- Left: Logo / Title -->
            <a class="navbar-brand fw-bold text-primary mb-0 h1" href="#">
                X-Workz
            </a>

            <!-- Right: Auth Buttons -->
            <!-- 'd-flex' makes the container a flexbox, 'gap-2' adds space between buttons -->
            <div class="d-flex gap-2 align-items-center">

                <!-- Sign Up Form -->
                <!-- 'd-inline' ensures the form doesn't force a new line -->
                <form action="signUp" method="get" class="d-inline">
                    <button type="submit" class="btn btn-primary rounded-pill px-4">
                        Sign Up
                    </button>
                </form>

                <!-- Sign In Form -->
                <form action="signIn" method="get" class="d-inline">
                    <button type="submit" class="btn btn-outline-primary rounded-pill px-4">
                        Sign In
                    </button>
                </form>

            </div>
        </div>
    </nav>


    <!-- ===================== Main Hero Content ===================== -->
    <!-- Adding a centered section to demonstrate the professional layout -->
    <main class="flex-grow-1 d-flex align-items-center justify-content-center text-center text-white">
        <div class="container">
            <div class="p-5 bg-dark bg-opacity-50 rounded-4 shadow-lg backdrop-blur-sm">
                <h1 class="display-3 fw-bold mb-3">Welcome to X-Workz</h1>
                <!-- <p class="lead mb-4">Building the future with professional standards and clean code.</p> -->
                <!-- <a href="#" class="btn btn-light btn-lg fw-bold text-primary shadow">Get Started</a> -->
            </div>
        </div>
    </main>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>