package MavenPracticeTest;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test(groups = "ST")
	public void contactTest() {
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("Hi maven");
	}
	

}
