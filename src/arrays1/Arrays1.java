
package arrays1;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

        
        int [] aryNums;
        
        aryNums = new int[6];
        
        aryNums[0] = 10;
        aryNums[1] = 14;
        aryNums[2] = 36;
        aryNums[3] = 27;
        aryNums[4] = 43;
        aryNums[5] = 18;
        
        System.out.println( aryNums[5] );
        
        Arrays.sort(aryNums);
        
        int i; 
        
        for (i=0; i< aryNums.length; i++) {
            System.out.println("num:" + aryNums[i]);
            }

//        int [] lottery_numbers = new int[49];
//        
//        for (i=0; i < lottery_numbers.length; i++) {
//            lottery_numbers[i] = i + 1;
//            System.out.println( lottery_numbers[i] );
//        
//    }
   } 
}
