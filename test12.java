package test;

import java.util.ArrayList;

public class test12 {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			sum = 0;
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			n++;
			
			int sqrt = (int)Math.sqrt(sum);
			list = new ArrayList<Integer>();
			
			for(int i=1;i<=sqrt;i++) {
				if(sum%i==0) {
					list.add(i);
					if(sum/i!=i) {
						list.add(sum/i);
					}
				}
			}
			
			
			if(list.size()>=500) {
				break;
			}
		}
		System.out.println(sum);

	}
}
