package test;

public class test6 {
	public static void main(String[] args) {
		long x = 0, y = 0;
        for (int i = 1; i < 101; i++) {
               x += (i * i);
               y += i;
        }
        y *= y;
        System.out.println(y-x);
		
	}
}
