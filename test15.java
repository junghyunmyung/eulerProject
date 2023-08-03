package test;

public class test15 {

	public  static void main(String[] args) {
		double result = 1;
		for(int i = 21; i<=40; i++) {
			result *=i;
		}
		
		for(int i=1; i<=20; i++) {
			result /=i;
		}
		System.out.println((long)result);
	}
}
