package com.main.balancetree;

import com.service.balancetree.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
	
		BalancingBrackets balancingBrackets = new BalancingBrackets();

		String expr = "([[{}]])";
				Boolean result;
		 result = balancingBrackets.checkingBracketsBalanced(expr);
		 
		 if(result)
			 System.out.println("The string has balanced brackets");
		 else
			 System.out.println("The String has not balanced brackets");
	}

}
