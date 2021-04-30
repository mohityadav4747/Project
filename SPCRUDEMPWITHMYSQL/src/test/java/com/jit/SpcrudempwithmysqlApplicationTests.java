package com.jit;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jit.dao.EmployeeDao;



@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class SpcrudempwithmysqlApplicationTests {


	@Autowired
	private EntityManager em;

	   @SuppressWarnings("done")
	   @Test
	   public void employeeIdIsProvide_fetchAll() {
	      Mockito.when(EmployeeDao.class).thenReturn(EmployeeDao.class);
	      Class<EmployeeDao> testName = EmployeeDao.class;
	      Assert.assertEquals("Mock Product Name", testName);
	   }

}
