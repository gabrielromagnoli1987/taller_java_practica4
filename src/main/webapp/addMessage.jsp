<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Message</title>
</head>
<body>
    <h1>Add Message</h1>
    <div>
        <%
            if (session != null && session.getAttribute("username") != null) { %>
                <a href="showMessages.jsp">Show Messages</a><br>
                <a href="logout.jsp">Logout</a>
        <% } %>
    </div>
    <h2>Add message form</h2>
    <form action="/addMessage" method="post">
        <label for="message">Message</label><br>
        <input type="text" id="message" name="message" required><br>
        <input type="submit" value="Add Message">
    </form>
</body>
</html>
