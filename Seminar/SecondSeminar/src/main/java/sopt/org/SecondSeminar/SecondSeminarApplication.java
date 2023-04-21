package sopt.org.SecondSeminar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sopt.org.SecondSeminar.domain.Article.Article;
import sopt.org.SecondSeminar.domain.User.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
@SpringBootApplication
public class SecondSeminarApplication {

	public static ArrayList<User> userList;
	public static ArrayList<Article> articleList;

	public static void main(String[] args) {

		SpringApplication.run(SecondSeminarApplication.class, args);

		userList = new ArrayList<>();
		articleList = new ArrayList<>();
	}
}
