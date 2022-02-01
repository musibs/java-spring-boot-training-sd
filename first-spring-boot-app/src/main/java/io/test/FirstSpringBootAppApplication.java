package io.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Comment Tracker
 *
 *  UserComment
 *   - Store new comments
 *   - View all comments
 *   - View specific comment by id
 *   - Update comment
 *   - Delete comment
 */
@SpringBootApplication
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootAppApplication.class, args);
	}

}
