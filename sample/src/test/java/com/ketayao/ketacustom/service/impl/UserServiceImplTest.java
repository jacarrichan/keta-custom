package com.ketayao.ketacustom.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.ketayao.ketacustom.entity.main.User;
import com.ketayao.ketacustom.service.UserService;

@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"classpath:applicationContext-shiro.xml" })
@ActiveProfiles("production")
public class UserServiceImplTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	UserService userService;

	@Test
	public void testSaveOrUpdate() {
		User user = new User();
		user.setUsername("admin");
		user.setRealname("管理员");
		user.setPlainPassword("123456");
		userService.saveOrUpdate(user);
	}

}
