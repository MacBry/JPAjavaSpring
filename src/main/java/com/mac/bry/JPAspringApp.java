package com.mac.bry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mac.bry.config.JpaConfig;
import com.mac.bry.dao.BookDAO;
import com.mac.bry.dao.BookDAOimpl;
import com.mac.bry.model.Book;

@Configuration
@ComponentScan()
public class JPAspringApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JPAspringApp.class);
		BookDAO bookDAO = context.getBean(BookDAO.class);
		
		Book book = new Book("15151515", "King", "TO");
		bookDAO.addBook(book);
		
		Book getBook = bookDAO.getBook(1L);
		System.out.println(getBook);
		context.close();

	}

}
