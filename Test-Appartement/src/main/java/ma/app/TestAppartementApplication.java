package ma.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.app.entities.User;
import ma.app.services.UserService;

@SpringBootApplication
public class TestAppartementApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TestAppartementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User newAdmin = new User("admin@gmail.com","000000","Admin","123456");
		userService.createAdmin(newAdmin);
	}

}
