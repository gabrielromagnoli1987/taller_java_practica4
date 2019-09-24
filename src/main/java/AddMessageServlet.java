import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Message;

@WebServlet("/addMessage")
public class AddMessageServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		String username = (String) session.getAttribute("username");
		String text = req.getParameter("message").trim();
		Message message = new Message(text, username, LocalDateTime.now());
		List<Message> messages = (List<Message>) getServletContext().getAttribute("messages");
		messages.add(message);
		getServletContext().setAttribute("messages", messages);
		resp.sendRedirect("showMessages.jsp");
	}

}
