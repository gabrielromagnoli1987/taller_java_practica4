import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.Message;
import model.User;

@WebListener
public class AppInitializer implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		User user = new User("user", "pass");
		User user2 = new User("user2", "pass2");
		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(user2);
		sce.getServletContext().setAttribute("users", users);
		List<Message> messages = new ArrayList<>();
		sce.getServletContext().setAttribute("messages", messages);
	}
}
