package test;

public class test2 {
	public static void main(String[] args) {
	int a=1, b=2, c=0, sum=2;
	for(; ;) {
		c= a+b;
		a=b;
		b=c;
		if(c>=4000000) {
			break;
		}
		if(c%2==0) {
			sum=sum+c;
		}
	}
	System.out.println(sum);

}
}


