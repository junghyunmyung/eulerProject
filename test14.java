package test;

public class test14 {

	public static void main(String[] args) {
		
		long currentNum = 0;
		long max = 0;
		long result = 0;
		long count = 0;
		long calNum = 0;
		
		while(currentNum <= 1000000) {
			
			calNum = ++currentNum;
			
			while(true) {
				if((calNum%2) == 0) calNum/=2;
				else calNum =3 * calNum +1;
				count++;
				
				if(calNum ==1)
					break;
			}
			
			if(max < count) {
				max = count ;
				result = currentNum;
			}
			count = 0;
		}
		System.out.println(result);
		
	}
}
