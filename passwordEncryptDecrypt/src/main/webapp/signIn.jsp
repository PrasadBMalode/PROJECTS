<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Sign In</title>
</head>

<body>

<h3>Sign In</h3>

<!-- Messages -->
<p>${signInSuccess}</p>
<p>${signInFail}</p>

<form action="signIn" method="post">

    Email:
    <input type="email" name="email" required>
    <br><br>

    Password:
    <input type="password" name="password" required>
    <br><br>

    <button type="submit">Login</button>

</form>

<br>

<form action="signUp" method="post">
    <button type="submit">Register</button>
</form>

</body>
</html>