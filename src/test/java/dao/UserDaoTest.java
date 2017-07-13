package dao;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

import beans.User;

public class UserDaoTest {

	private UserDao userDao = new UserDao();
	
	@Test
	public void testGetConnectionn() {
		Connection conn = userDao.getConnectionn();
		
		Assert.assertNotNull(conn);
		//fail("Not yet implemented");
	}
	@Test
	public void findname() {
		String Username = "wzl";
		User username = new User();
		username.setUsername(Username);
		
		
		boolean  conn = userDao.checkname(username);
		
		Assert.assertTrue(conn);
		//fail("Not yet implemented");
	}


}

