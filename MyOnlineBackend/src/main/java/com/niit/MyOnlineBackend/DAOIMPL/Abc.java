package com.niit.MyOnlineBackend.DAOIMPL;

import org.springframework.stereotype.Repository;

@Repository("AbcBean")
public class Abc 
{
	public int add(int a , int b)
	{
		return (a+b);
	}
}
