<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Successful</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa; /* Light gray background for contrast */
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }

        main {
            flex: 1; /* Pushes footer down */
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 20px;
        }

        .success-card {
            border: none;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.05);
            max-width: 500px;
            width: 100%;
            text-align: center;
            padding: 40px 30px;
        }

        .success-icon {
            font-size: 4rem;
            color: #198754; /* Bootstrap Success Color */
            margin-bottom: 1rem;
            animation: popIn 0.5s ease-out;
        }

        @keyframes popIn {
            0% { transform: scale(0); opacity: 0; }
            80% { transform: scale(1.1); }
            100% { transform: scale(1); opacity: 1; }
        }

        .nav-brand-custom {
            font-weight: 700;
            letter-spacing: -0.5px;
        }
    </style>
</head>
<body>

    <!-- Bootstrap 5 Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow-sm">
        <div class="container">
            <a class="navbar-brand nav-brand-custom" href="#">
                <i class="bi bi-box-seam-fill me-2"></i>X-WorkZ
            </a>

            <!-- Mobile Toggler -->
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <!-- Link to index.jsp as requested -->
                        <a class="nav-link active" aria-current="page" href="index.jsp">
                            <i class="bi bi-house-door-fill me-1"></i> Home
                        </a>
                    </li>
                    <!-- Placeholder links for visual completeness -->
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Main Content Area -->
    <main>
        <div class="card success-card">
            <div class="card-body">
                <!-- Animated Success Icon -->
                <div class="success-icon">
                    <i class="bi bi-check-circle-fill"></i>
                </div>

                <h1 class="card-title h2 mb-3">Registration Successful!</h1>

                <p class="card-text text-muted lead mb-4">
                    Hi, You Registered Successfully...!
                </p>

                <div class="d-grid gap-2 col-10 mx-auto">
                    <a href="index.jsp" class="btn btn-primary btn-lg rounded-pill">
                        Go to Home
                    </a>
                </div>
            </div>
        </div>
    </main>

    <!-- Simple Footer -->
    <!-- <footer class="text-center py-3 text-muted border-top bg-white">
        <div class="container">
            <small>&copy; 2023 MyApp. All rights reserved.</small>
        </div>
    </footer> -->

    <!-- Bootstrap 5 JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>