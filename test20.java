package test;

import java.math.BigDecimal;

public class test20 {
	
public static void main(String[] args) {
		
		String s = factorial(100).toString();
		String temp;
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			temp = s.substring(i, i + 1);
			
			sum += Integer.parseInt(temp);
		}
		System.out.println(sum);

	}
	
	public static BigDecimal factorial(int n) {
		if(n < 2) return BigDecimal.ONE;
		else return factorial(n - 1).multiply(new BigDecimal(n));
	}

}
