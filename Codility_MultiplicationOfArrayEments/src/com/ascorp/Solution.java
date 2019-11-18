package com.ascorp;

class GFG {
	static int A[] = { 1, 2, 3, 4, 5, 0 };

	// Method to calculate the
	// product of the array
	static int multiply() {
		int pro = 1;
		for (int i = 0; i < A.length; i++)
			pro = pro * A[i];
		if (pro>0)
		return 1;
		else if (pro<0)
		return -1;
		else if (pro==0)
		return 0;
		return pro;
	}

	/*
	 * int threevalue() { int multiply = multiply(); if(multiply=) return 0;
	 * 
	 * }
	 */
	// Driver Code
	public static void main(String[] args) {
		// Method call to calculate product
		int multiply = multiply();
		System.out.println(multiply());
	}
	
}