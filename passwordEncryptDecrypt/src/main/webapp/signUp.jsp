<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Register</title>
</head>

<body>

<h3>Register</h3>

<!-- Messages -->
<p>${registerDone}</p>
<p>${registerFail}</p>

<form action="register" method="post">

    Age:
    <input type="number" name="age" required>
    <br><br>

    Name:
    <input type="text" name="name" required>
    <br><br>

    Place:
    <input type="text" name="place" required>
    <br><br>

    Email:
    <input type="email" name="email" required>
    <br><br>

    Contact Number:
    <input type="tel" name="number" required>
    <br><br>

    Password:
    <input type="password" name="password" required>
    <br><br>

    <button type="submit">SignUp</button>

</form>

</body>
</html>