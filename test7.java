package test;

public class test7 {
	 public static void main(String[] args) {



		  int A = 2;



		  int j = 2;

		  int count = 1;

		  int sqrt = 0;

		  while (count < 10002) {



		   sqrt = (int) Math.sqrt(A);

		   if (j <= sqrt) {

		    if (A % j != 0) {

		     j = j + 1;

		    } else if (A % j == 0) {

		     j = 2;

		     A++;

		    }

		   } else if (j > sqrt) {

		    System.out.println(A + "는" + count + "번째 소수입니다.");

		    count++;

		    A++;

		    j = 2;

		   }

		  }

		 }

}
