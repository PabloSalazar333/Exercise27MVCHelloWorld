package com.exercise27mvchelloworld.model;

public class usuarioModel 
{
	private int id;
	private String name;
	private short age;

	public usuarioModel()
	{
	}
	public usuarioModel(int id)
	{
		this.id=id;
		this.name="";
		this.age=0;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public short getAge()
	{
		return age;
	}
	public void setAge(short age)
	{
		this.age=age;
	}
}
