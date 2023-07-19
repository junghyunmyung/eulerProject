package test;

public class test5 {

	  public static void main(String[] args) {
	        int num=20;
	        int count = 0;
	        boolean result = false;     //num은 나눠지는 값, i는 나누는 값, count는 나누어 떨어지는 횟수
	        while(result != true) {
	            for(int i = 1; i <=20 ; i++) {  //i를 1~20까지 나눔
	                if(num % i == 0)
	                    count++;    //나누어 떨어질때마다 count 추가
	            }
	            if(count != 20) {//1~20중 하나라도 안 나누어 떨어질때
	                num++;  //다음 숫자
	                count = 0;  //count 초기화
	            }
	            else if(count == 20)//1~20 어떤 수로도 나누어 떨어질 때
	                result = true;  //result true로  while문 종료

	        }
	        System.out.println(num);
	    }
}
