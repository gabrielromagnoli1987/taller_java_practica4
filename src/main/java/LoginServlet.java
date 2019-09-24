import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		List<User> users = (List<User>) getServletContext().getAttribute("users");
		try {
			User user = users.stream()
					.filter(u -> u.getName().equals(name))
					.findFirst()
					.orElseThrow(UserNotFoundException::new);
			if (user.getPassword().equals(password)){
				HttpSession session = req.getSession();
				session.setAttribute("username", user.getName());
				resp.sendRedirect("showMessages.jsp");
			} else {
				resp.sendRedirect("error.jsp");
			}
		} catch (UserNotFoundException e) {
			resp.sendRedirect("error.jsp");
		}
	}

}
