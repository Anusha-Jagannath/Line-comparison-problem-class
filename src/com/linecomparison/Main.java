package com.linecomparison;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		int p1, q1, p2, q2;
		
		System.out.println("welcome to Line comparison compuation problem");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of x1");
		x1 = s1.nextInt();
		System.out.println("Enter value of y1");
		y1 = s1.nextInt();
		System.out.println("Enter value of x2");
		x2 = s1.nextInt();
		System.out.println("Enter value of y2");
		y2 = s1.nextInt();

		System.out.println("Enter value of p1");
		p1 = s1.nextInt();
		System.out.println("Enter value of q1");
		q1 = s1.nextInt();
		System.out.println("Enter value of p2");
		p2 = s1.nextInt();
		System.out.println("Enter value of q2");
		q2 = s1.nextInt();

		LineComparison line = new LineComparison(x1, y1, x2, y2, p1, q1, p2, q2);
		line.compareTo();

	}

}
