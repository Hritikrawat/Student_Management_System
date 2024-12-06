package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility 
{	
	
	private static final Scanner sc = new Scanner(System.in);

	
	//Adding student to the list 
	public static  Student addStudent() 
	{
		Student stu = new Student();
		System.out.println("Enter Id: ");
		stu.setId(sc.nextInt());
		System.out.println("Enter Name: ");
		stu.setName(sc.next());
		System.out.println("Enter Age: ");
		stu.setAge(sc.nextInt());
		
		return stu;
	}
	
	//Displaying every student in the list 
	public static void displayAll(List<Student> student) 
	{
		if(student.isEmpty())
			System.out.println("List is Empty");
			
		else {
			Iterator e = student.iterator();
			while(e.hasNext())
			{
				Student a = (Student)e.next();
				System.out.println("\u001B[31m"+"["+a.getName()+" "+a.getAge()+" "+a.getId()+"]"+"\u001B[0m");
			}
		}
	}
	
	
	//DISPLAYING STUDENT BASED ON THEIR ID
	public static void displayById(List<Student> st)
	{
	
		if(st.isEmpty())
				System.out.println("List is Empty");
		else 
		{
			System.out.println("Enter the ID : ");
			int Id = sc.nextInt();
			
			Iterator e = st.iterator();
			while(e.hasNext())
				{
					Student s = (Student)e.next();
					if(Id == s.getId()) 
					{
						System.out.println("\u001B[31m"+"["+s.getName()+" "+s.getAge()+"]"+"\u001B[0m");
						break;
					}		
				}
		}
	}
		//Deleting student acc. to ID.
		
	public static void delete(List<Student> st, int Id) 
	{
		boolean isDeleted = false;
		
		if(st.isEmpty())
			System.out.println("List is Empty");
		else 
		{
			Iterator e = st.iterator();
			while(e.hasNext())
			{
				Student s = (Student)e.next();
				if(Id == s.getId())
					{
						e.remove();
						System.out.println("\u001B[32m"+" Student deleted SUcessfully "+"\u001B[0m");
						isDeleted = true;
						break;
					}
			}
			if(!isDeleted) 
				System.out.println("\\u001B[31m Student deleted SUcessfully \\u001B[0m");
				
				
			
			
		}
		
	}
}
