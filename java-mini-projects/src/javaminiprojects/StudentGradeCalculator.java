package javaminiprojects;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=Sc.nextLine();
		System.out.print("\nEnter Java Marks: ");
		int javamarks=Sc.nextInt();
		System.out.print("\nEnter Frontend Marks: ");
		int fmarks=Sc.nextInt();
		System.out.print("\nEnter Backend Marks: ");
		int bmarks=Sc.nextInt();
		int total=javamarks+fmarks+bmarks;
		int avg=total/3;
		System.out.println("\nStudent Name: "+name);
		System.out.println("Total Marks: "+total);
		System.out.println("Average Marks: "+avg);
		if(avg>90)
		{
			System.out.println("Grade A");
		}
		else if(avg>80)
		{
			System.out.println("Grade B");
		}
		else if(avg>70)
		{
			System.out.println("Grade C");
		}
		else if(avg>60)
		{
			System.out.println("Grade D");
		}
		else 
		{
			System.out.println("Failed");
		}
			
	}

}
