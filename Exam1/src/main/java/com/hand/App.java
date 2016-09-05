package com.hand;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dao.impl.FilmTemplate;
import com.hand.entity.Film;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("Context Start");
		FilmTemplate filmTemplate = 
				(FilmTemplate)context.getBean("filmTemplate"); 
		Film film=new Film();
		Scanner sc= new Scanner(System.in) ;	
		System.out.println("请输入电影名称(title)" );
		String s1 = sc.nextLine();
		film.setTitle(s1);
		System.out.println("请输入电影描述(description)" );
		String s2 = sc.nextLine();
		film.setDescription(s2);
		System.out.println("请输入语言(langguage_id)" );
		int s3 = sc.nextInt();
		film.setLanguage_id(s3);
		System.out.println("Before Insert Film Data");
		filmTemplate.create(s1,s2,s3);
		System.out.println("After Insert Film Data");
		System.out.println("Context Stop");
	}
}
