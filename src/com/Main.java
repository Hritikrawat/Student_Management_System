package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		List<Student> student = new ArrayList<>();
		System.out.println("\u001B[32m"+ "============== Student Management System ==============  "+"\u001B[0m");
		while(true){
			
			System.out.println(
					 "1.Add\n"
					+"2.Update Student\n"
					+"3.Display All Students\n"
					+"4.Display Student by Id\n"
					+"5.Delete Student by Id\n"
					+"6.Exit"
		);
			
			System.out.println("Enter an Operation");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1: 
				//Add
				Student st=StudentUtility.addStudent();
				student.add(st);
				System.out.println("\u001B[32m"+ "Student added succesfully "+"\u001B[0m");
				break;
			case 2:
				//Update
				break;
			case 3:
				//Display
				StudentUtility.displayAll(student);
				break;
			case 4:
				//Display by Id
				
				StudentUtility.displayById(student);
				break;
			case 5:
				//Delete Student by Id
				System.out.println("Enter Id :");
				int id = sc.nextInt();
				StudentUtility.delete(student, id);
				
				break;
			case 6 :
				System.out.println("Exiting..");
				System.exit(0);
				break;
			default :
				System.out.println("Choose a Valid operation number");
				break;
			
			} 
		}
	}
}
