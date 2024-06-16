package sab.dcdemo.org;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sab.dcdemo.org.model.Post;
import sab.dcdemo.org.repository.PostRepository;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	//@Bean
//	CommandLineRunner commandLineRunner(PostRepository repository) {
//		//return args -> repository.save(new Post( ,"Hello World!","My first blog post!"));
//	}

}
