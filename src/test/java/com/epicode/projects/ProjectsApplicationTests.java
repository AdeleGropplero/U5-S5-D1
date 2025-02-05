package com.epicode.projects;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProjectsApplicationTests {
	@Autowired
	ProjectsApplication app;

	@Test
	void contextLoads() {
		//assert true;

		//Verifico che l'app è avviata
		assertThat(app).isNotNull(); //Il test passa perché non è null. Se avessi fatto isNull() il test falliva.
		//assertNotNull(app);
	}

	@Test
	void myTest(){
		assert true;

	}

}
