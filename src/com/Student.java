package com;

public class Student 
{
	private int Id;
	private String Name;
	private int age;
	
	public Student() 
	{
		//Nothing
	}
	public Student(int Id,String Name ,int age) {
		this.Id=Id;
		this.Name=Name;
		this.age=age;
	}
	
	public int getId() 
	{
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;	
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() 
	{
		return Name+" "+Id+" "+age ;	
	}
	
	
	
	
}
