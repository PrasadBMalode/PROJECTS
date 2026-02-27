<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In Page</title>
    <!-- Bootstrap 5 CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            /* Preserved your original background styles */
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            min-height: 100vh;
            margin: 0;
        }
    </style>
</head>

<body class="d-flex justify-content-center align-items-center">


    <div class="p-4 text-center border border-2 border-dark rounded-3"
         style="background-color: rgb(176,196,222); width: 100%; max-width: 400px;">

        <form action="getSignIn" method="get">


            <div class="mb-3 text-start">
                <label for="email" class="form-label fw-bold">Email : </label>
                <input type="email" class="form-control" placeholder="Enter your email" name="email" id="email">
            </div>

            <div class="mb-3 text-start">
                <label for="password" class="form-label fw-bold">Password : </label>
                <input type="text" class="form-control" placeholder="Enter your password" name="password" id="password">
            </div>


            <button type="submit" class="btn btn-dark w-100 mt-2">SignIn</button>

        </form>
    </div>

    <!-- Bootstrap JS Bundle (optional, but good for full Bootstrap support) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>