package org.malajava.Test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.malajava.entity.classinfo;
import org.malajava.service.IClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ClassTest {

	@Autowired
	private IClassInfoService iClassInfoService;

	@Test
	public void loadByIdTest() {
		classinfo c = iClassInfoService.loadById(1);
		System.out.println(c);

		System.out.println("123");
	}

	@Test
	public void loadAllTest() {
		List<classinfo> list = iClassInfoService.loadAll();
		for (classinfo c : list) {
			System.out.println(c.getClassid() + ":" + c.getClassname());
		}
	}
}
