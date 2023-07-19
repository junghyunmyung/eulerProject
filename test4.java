package test;

import java.util.ArrayList;
import java.util.Collections;

public class test4 {


    public static void main(String[] args) {
        
        int intVal = 0;
        String strVal = null;
        ArrayList<String> arrList = new ArrayList<String>();
        
        for(int i = 999; i > 0; i--) {
            for(int j = 999; j > 0; j--) {
                intVal = i*j;
                strVal = Integer.toString(intVal);
                
                if(strVal.length() %2 == 0) {
                    if(strVal.length() == 6) {
                        if(strVal.charAt(0) != strVal.charAt(5)) continue;
                        if(strVal.charAt(1) != strVal.charAt(4)) continue;
                        if(strVal.charAt(2) != strVal.charAt(3)) continue;
                        arrList.add(strVal);
                    }
                }
                
            }
        }
        System.out.println(Collections.max(arrList));
    }
}
