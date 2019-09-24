<%@ page import="java.util.List" %>
<%@ page import="model.Message" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show Messages</title>
</head>
<body>
    <h1>Messages</h1>
    <div>
        <%
            if (session != null && session.getAttribute("username") != null) { %>
                <a href="logout.jsp">Logout</a><br>
                <a href="addMessage.jsp">Add Message</a>
        <% } else { %>
        	<a href="login.jsp">Login</a>
        <% } %>
    </div>
    <h2>List of messages</h2>
    <div>
        <%
            List<Message> messages = (List<Message>) application.getAttribute("messages");
            for (Message message : messages) {
        %>
            	<%= message %><br>
        <%
            }
        %>
    </div>
</body>
</html>
