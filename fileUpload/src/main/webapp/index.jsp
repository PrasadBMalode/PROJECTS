<%@ page isELIgnored="false" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Upload Form</title>
</head>
<body>

    <h2>Upload Form</h2>

    <form action="upload" method="post" enctype="multipart/form-data">
        
        
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>

        
        <label for="fileName">Upload File:</label><br>
        <input type="file" id="fileName" name="fileName" required><br><br>

        
        <button type="submit">Submit</button>

    </form>

    <a href="image">Get image</a>


</body>
</html>