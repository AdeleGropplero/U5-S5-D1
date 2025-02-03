package com.epicode.projects;

import com.epicode.projects.Esercizio.ConfigurationBean;
import com.epicode.projects.Esercizio.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProjectsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectsApplication.class, args);
		configMenu();


	}

	public static void configMenu(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationBean.class);
		Menu menu = (Menu) ctx.getBean("menu");
		System.out.println(menu);
		ctx.close();
	}

}
