package test;

public class test10 {
	public static void main(String[] args) {

		  int A = 2;

		  long sum = 0L;

		  int j = 2;

		  int sqrt = 0;

		  while (A < 2000001) {



		   sqrt = (int) Math.sqrt(A);

		   if (j <= sqrt) {

		    if (A % j != 0) {

		     j = j + 1;

		    } else if (A % j == 0) {

		     j = 2;

		     A++;

		    }

		   } else if (j > sqrt) {

		    sum += A;

		    A++;

		    j = 2;

		   }

		  }

		  System.out.println(sum);

		 }
}
