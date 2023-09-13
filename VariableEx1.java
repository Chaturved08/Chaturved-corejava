package com.corejava.basics;

public class VariableEx1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		int num1 = 12;
		int num2 = 13;
		int num3 = 11;
		
		
		// Calculate sum, average, subtraction, and multiplication
         int sum = num1 + num2 + num3;
         int average = sum / 3;
         int subtraction = num1 - num2 - num3;
         int multiplication = num1 * num2 * num3;
         
         System.out.println("sum is:"+sum+"\n average is :"+average+"\n subtraction is:"+subtraction+"\n multiplication is:"+multiplication);
	}

}