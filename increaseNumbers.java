package cis.vmi.edu;

import java.util.Scanner;

/*
 * Author:Joshua Licona
 * Purpose: put numbers in increasing order
 */

public class increaseNumbers {

	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter one integer:: ");
		int var1=scanner.nextInt();
		
		System.out.println("Enter second integer:: ");
		int var2=scanner.nextInt();
		
		System.out.println("Enter third integer:: ");
		int var3=scanner.nextInt();
		
		if(var1>var2&&var1>3&&var2>3) {
			System.out.println("The order is:: "+var3+" "+var2+" "+var1);
		}
		else if(var1>var2&&var1>3&&var3>var2) {
			System.out.println("The order is:: "+var2+" "+var3+" "+var1);
		}
		else if(var2>var1&&var2>var3&&var1>var3) {
			System.out.println("The order is:: "+var3+" "+var1+" "+var2);
		}
		else if(var2>var1&&var2>var3&&var3>var1) {
			System.out.println("The order is:: "+var1+" "+var3+" "+var2);		
		}
		else if(var3>var1&&var3>var2&&var1>var2) {
			System.out.println("The order is:: "+var2+" "+var1+" "+var3);
		}
		else if(var3>var1&&var3>var2&&var2>var1) {
			System.out.println("The order is:: "+var1+" "+var2+" "+var3);
		}
	}
}
