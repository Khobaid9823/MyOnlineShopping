package com.niit.MyOnlineBackend;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.MyOnlineBackend.DAO.CategoryDAO;
import com.niit.MyOnlineBackend.DAO.ProductDAO;
import com.niit.MyOnlineBackend.DAOIMPL.Abc;
import com.niit.MyOnlineBackend.model.Category;

public class SampleTest 
{
	private static AnnotationConfigApplicationContext context;
	static Abc AbcBean;
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyOnlineBackend");
		context.refresh();
		
		AbcBean = (Abc)context.getBean("AbcBean");
	}
	
	@Test
	public void mytest()
	{
		int result = AbcBean.add(23, 56);
		System.out.println(result);
	}
	
	

}
