package org.student;
import java.util.Scanner;
public class StudentReportCard {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Student Name:");
			String name = sc.next();
			System.out.println(" Enter the Student ID:");
            int id = sc.nextInt();
            System.out.println(" Enter the English Mark:");
            int em = sc.nextInt();
            System.out.println(" Enter the Tamil Mark:");
            int tm = sc.nextInt();
            System.out.println(" Enter the Maths Mark:");
            int mm = sc.nextInt();
            System.out.println(" Enter the Science Mark:");
            int sm = sc.nextInt();
            System.out.println(" Enter the SocialScience Mark:");
            int ssm = sc.nextInt();
            int ttm = em+tm+mm+sm+ssm;
            int avg = ttm/5;
            System.out.println(" \nStudent Report:");
            System.out.println("\nStudent Name: "+name);
            System.out.println("Student ID: "+id );
            System.out.println(" English Mark: "+em);
            System.out.println(" Tamil Mark: "+tm);
            System.out.println(" Maths Mark: "+mm);
            System.out.println(" Science Mark: "+sm);
            System.out.println(" SocialScience Mark: "+ssm);
            System.out.println(" Total Marks: "+ttm);
            System.out.println(" Average marks: "+avg);
	} 

}
