<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Number Guessing Game</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body class="main">
    <h1>Number Guessing Game</h1>
    <p>Guess a number between <span th:text="${min}"></span> and <span th:text="${max}"></span>.</p>
    <form action="/guess" method="post">
        <input type="number" name="guess" required>
        <button type="submit">Guess</button>
    </form>
    <p th:text="${message}"></p>
</body>
</html>