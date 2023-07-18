package test;

public class test3 {
	public static void main(String[] args) {

		long number = 600851475143L;
	        long largestPrime = 0;
	        for (long i = 2; i <= number; i++) {
	            if (number % i == 0) {
	                largestPrime = i;
	               
	                while (number % i == 0) {
	                    number /= i;
	                }
	            }
	        }
	        System.out.println("가장 큰 소인수:"+largestPrime);
		}

}
