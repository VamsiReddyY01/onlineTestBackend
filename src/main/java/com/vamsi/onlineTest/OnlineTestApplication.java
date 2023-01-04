package com.vamsi.onlineTest;

import com.vamsi.onlineTest.controller.onlineTestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OnlineTestApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(OnlineTestApplication.class, args);
		onlineTestController controller= (onlineTestController) context.getBean("onlineTestController");
		controller.createQuestions();
	}

}
