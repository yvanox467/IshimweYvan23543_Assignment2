<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Admission</title>
</head>
<body>
	<h2>Student Admission Form</h2>
    <form action="submit" method="post" enctype="multipart/form-data">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <!--<label for="password">Password:</label>
         <input type="password" id="password" name="password" required><br><br>-->
        
		<label for="name">First Name:</label>
        <input type="text" id="name" name="name" required><br><br>

		<label for="lname">Last Name:</label>
        <input type="text" id="lname" name="lname" required><br><br>

		<label for="faculty">Faculty:</label>
        <input type="text" id="faculty" name="faculty" required><br><br>

        <label for="profilePicture">Profile Picture (JPG/PNG only):</label>
        <input type="file" id="profilePicture" name="profilePicture" accept=".jpg, .png" required><br><br>

        <label for="certificates">Certificates (PDF only):</label>
        <input type="file" id="certificates" name="certificates" accept=".pdf" ><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>