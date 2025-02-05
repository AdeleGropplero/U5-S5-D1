package com.epicode.projects;

import com.epicode.projects.Esercizio.configurations.ConfigurationBean;
import com.epicode.projects.Esercizio.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProjectsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectsApplication.class, args);
		//configMenu(); non più necessario perchè passaro nella classe runner che appunto runna il "metodo"


	}

/*	public static void configMenu(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationBean.class);
		Menu menu = (Menu) ctx.getBean("menu");
		menu.stampaMenu();
		ctx.close();
	}*/

}
