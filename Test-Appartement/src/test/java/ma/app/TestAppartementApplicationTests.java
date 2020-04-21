package ma.app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ma.app.entities.Appartement;
import ma.app.entities.User;
import ma.app.services.AppartementService;
import ma.app.services.UserService;

@SpringBootTest
class TestAppartementApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private AppartementService appartementService;
//	
//	public void initDb() {
//		{
//			User newUser = new User("testUser@mail.com","testUser","0640311475", "123456");
//			userService.createUser(newUser);
//		}
//		{
//			User newUser = new User("testAdminr@mail.com","testAdmin","0640311475", "123456");
//			userService.createUser(newUser);
//		}
//		Appartement userAppartement = new Appartement("BelleAppartement","wwwww", "wwwww", "wwww", "wwww", 10, 10, 10, 10, 10, false, "wwww");
//		User user = userService.findOne("testUser@mail.com");
//		appartementService.addAppartement(userAppartement, user);
//	}
//	@Test
//	public void testUser() {
//		User user = userService.findOne("testUser@mail.com");
//		assertNotNull(user);
//		User admin =userService.findOne("testAdminr@mail.com");
//		assertEquals(admin.getEmail(),"testAdminr@mail.com");
//	}
//	
//	@Test
//	public void testAppartement() {
//		User user = userService.findOne("testUser@mail.com");
//		List<Appartement> appartements=appartementService.findUserAppartement(user);
//		assertNotNull(appartements);
//		
//	}

}
