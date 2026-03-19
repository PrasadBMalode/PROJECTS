<%@ page isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>
<h4>${registerDone}</h4>
<h4>${registerFail}</h4>
<form action="register" method="post">

    <input type="number" name="id" placeholder="ID" readonly><br>
    <input type="number" name="age" placeholder="Age"><br>
    <input type="text" name="name" placeholder="Name"><br>
    <input type="text" name="place" placeholder="Place"><br>
    <input type="text" name="email" placeholder="Email"><br>
    <input type="number" name="number" placeholder="Contact number"><br>
    <input type="text" name="password" placeholder="Password"><br>
    <input type="submit" placeholder="Submit">
</form>
</body>
</html>
