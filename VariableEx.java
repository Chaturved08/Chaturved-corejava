package com.corejava.basics;

public class VariableEx {
	
	
	 static String company = "Natwest"; //global variable
	 long idcard = 2577543;                 // non-static

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String name = "Vihaan"; //local variable 
		int age = 25;
		char gender = 'M';
		
		System.out.println("name is:"+name+"\nage is:"+age+"\ngender is:"+gender);
		System.out.println(VariableEx.company);
		
		VariableEx var = new VariableEx();
		System.out.println(var.idcard);
		
	}

}
