package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
public class SbCrudAppMysqlApplication { 
//implements CommandLineRunner{

	//@Autowired
	//private ApplicationContext context;
	//@Autowired
	//private BeanFactory factory;
	public static void main(String[] args) {
		SpringApplication.run(SbCrudAppMysqlApplication.class, args);
	}

	//@Override
	//public void run(String... args) throws Exception {
		//System.out.println(context.getDisplayName());
		//System.out.println(context.getId());
		//System.out.println(factory.getClass());

	//}

}
