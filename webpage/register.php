<?php

error_reporting(E_ALL);
ini_set('display_errors', 1);


// Database connection parameters
$hostname = "localhost";
$username = "root";
$password = "Laxman1436@";
$dbname = "sbms29";

// Connect to the database
$conn = mysqli_connect($hostname, $username, $password, $dbname);

// Check if the connection was successful
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

// Check if the form was submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Get form data
    $fullname = $_POST["fullname"];
    $email = $_POST["email"];
    $username = $_POST["username"];
    $password = $_POST["password"];

    // Create and execute the SQL query to insert data into the table
    $sql = "INSERT INTO user_registration (fullname, email, username, password) VALUES ('$fullname', '$email', '$username', '$password')";

    if (mysqli_query($conn, $sql)) {
        echo "Registration successful!";
    } else {
        echo "Error: " . $sql . "<br>" . mysqli_error($conn);
    }
}

// Close the database connection
mysqli_close($conn);
?>
