package com.hsbc.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class LambdaDemo {
	
	LambdaDemo ld = new LambdaDemo();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(101, "Pranav", 51000, LocalDate.of(1998, 9, 3)));
		empList.add(new Emp(102, "Abhi", 52000, LocalDate.of(1998, 9, 2)));
		empList.add( new Emp(103, "Pratik", 53000, LocalDate.of(1999, 9, 5)));
		empList.add(new Emp(104, "Saee", 54000, LocalDate.of(1995, 9, 6)));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Print");
		System.out.println("2.Sort Emp based on choice");
		System.out.println("3.Exit");
		System.out.println("Enter the Valid Choice :");
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			
			for(Emp e: empList) {
				System.out.println(e);
			}
			
			
			break;
		case 2:
			System.out.println("1.Id "+"/t"+"2.Name"+"/t"+"3.Salary/t"+"4.DOB");
			int choice1 = sc.nextInt();
			switch(choice1) {
			case 1:
				
				Collections.sort(empList, (e1 , e2) -> e1.getEmpID()-e2.getEmpID());
				for(Emp e: empList) {
					System.out.println(e);
				}
				//System.out.println("test");
				break;
			case 2:
				Collections.sort(empList, (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
				for(Emp e: empList) {
					System.out.println(e);
				}
				break;
			case 3:
				Collections.sort(empList, (e1, e2) -> (int)e1.getEmpSalary() - (int)e2.getEmpSalary());
				for(Emp e: empList) {
					System.out.println(e);
				}
				break;
			case 4 :
				Collections.sort(empList, (e1, e2) ->e1.getEmpDOB().compareTo(e2.getEmpDOB()));
				for(Emp e: empList) {
					System.out.println(e);
				}
				break;
			default:
				System.out.println("Enter valid choice !");
				break;
			}
			
			break;
		case 3:
			System.exit(0);
			
		default:
				System.out.println("Enter valid choice !");
		}
		
		sc.close();

	}
	
	

}
