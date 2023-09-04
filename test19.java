package test;

public class test19 {

public static void main(String[] args) {
		
		int dd = 2;
		int num = 0;
		
		for ( int i = 1901; i < 2001; i++ ) {
			int[] mm = {31,28,31,30,31,30,31,31,30,31,30,31};
			if ( i % 4 == 0 ) {
				mm[1]++; 
			}
			for ( int j = 0; j < 12; j++ ) {
				dd += mm[j] % 7;
				if ( dd > 6 ) {
					dd -= 7;
				}
				if ( dd == 0 ) {
					num++;
					System.out.println(num + " : " + i + "년 " + (j+1) + "월");
				}
			}
		}
		System.out.println(num + "번");
	}
}

