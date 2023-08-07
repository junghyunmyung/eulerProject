package test;

import java.math.BigInteger;

public class test16 {
	 public static void main(String[] args) {

		  BigInteger bi = new BigInteger("1");

		  int sum = 0;

		  for(int i=1;i<1001;i++){

		   bi = bi.multiply(BigInteger.valueOf(2));

		  }

		  String str = String.valueOf(bi);

		  

		  String str2[] = str.split("");

		  

		  for(int i = 0; i<str.length(); i++){

		   sum += Integer.parseInt(str2[i]);

		  }

		  System.out.println(sum);

		 }

}
