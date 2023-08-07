package test;

public class test17 {
	private static final int ZERO = 0;
    private static final int ONE = 3;
    private static final int TWO = 3;
    private static final int THREE = 5;
    private static final int FOUR = 4;
    private static final int FIVE = 4;
    private static final int SIX = 3;
    private static final int SEVEN = 5;
    private static final int EIGHT = 5;
    private static final int NINE = 4;
 
    private static final int[] A = { ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE };
 
    private static final int TEN = 3;
    private static final int ELEVEN = 6;
    private static final int TWELVE = 6;
    private static final int THIRTEEN = 8;
    private static final int FOURTEEN = 8;
    private static final int FIFTEEN = 7;
    private static final int SIXTEEN = 7;
    private static final int SEVENTEEN = 9;
    private static final int EIGHTEEN = 8;
    private static final int NINETEEN = 8;
 
    private static final int[] B = { TEN, ELEVEN, TWELVE, THIRTEEN, FOURTEEN, FIFTEEN, SIXTEEN, SEVENTEEN, EIGHTEEN,
            NINETEEN };
 
    private static final int TWENTY = 6;
    private static final int THIRTY = 6;
    private static final int FORTY = 5;
    private static final int FIFTY = 5;
    private static final int SIXTY = 5;
    private static final int SEVENTY = 7;
    private static final int EIGHTY = 6;
    private static final int NINETY = 6;
 
    private static final int[] C = { ZERO, ZERO, TWENTY, THIRTY, FORTY, FIFTY, SIXTY, SEVENTY, EIGHTY, NINETY };
 
    private static final int HUNDRED = 7;
 
    private static final int ONE_THOUSAND = 11;
 
    private static final int AND = 3;
 
    public static void main(String[] args) {
        int strCount = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i < 10) {
                strCount += A[i];
            } else if (i >= 10 && i < 20) {
                strCount += B[i % 10];
            } else if (i >= 20 && i < 100) {
                strCount += (C[i / 10] + A[i % 10]);
            } else if (i >= 100 && i < 1000) {
                if (i % 100 == 0) {
                    strCount += (A[i / 100] + HUNDRED);
                } else {
                    if (((i / 10) % 10) == 0) {
                        strCount += (A[(i / 100)] + HUNDRED + AND + A[(i % 100)]);
                    } else if (((i / 10) % 10) == 1) {
                        strCount += (A[(i / 100)] + HUNDRED + AND + B[((i % 100) - 10)]);
                    } else {
                        strCount += (A[(i / 100)] + HUNDRED + AND + C[((i / 10) % 10)] + A[(i % 10)]);
                    }
                }
            } else {
                strCount += ONE_THOUSAND;
            }
        }
        System.out.println("1 ~ 1000 까지의 합  : " + strCount);
    }
	

}
