public class TwoSum {

    public static void main(String[] args){
        //    Input: nums = [1,4,10,-3], target = 14
//    Output: [1,2] or [2,1] # 4 + 10 = 14


//    Input: nums = [9,5,1,23], target = 10
//    Output: [0,2] or [2,0] # 9 + 1 = 10

//    Input: nums = [1,-2,5,10], target = -1
//    Output: [0,1] or [1,0] # 1 + -2 = -1
//    Int a [] = {1,3,5,6,7,8,9} target 14


        int number[] = {1,4,8,12,18};
        int target = 30;
        int output[];

        int i = 0;
        int j = 0;
        while(i< number.length){

            j=0;
            while(j < number.length){

                if(number[i]+number[j] == 30){

                    System.out.println(i+" "+j);
                }
                j++;
            }
            i++;

        }

        int pass = 466;
        for ( i = 0; i < number.length; i++) {


            for (j = 0; j < number.length; j++) {
                for (int k = 0; k < number.length; k++) {



                    if (number[i] + number[j] + number[k] == 20) {

                        System.out.println(i + " " + j+ " " + k);
                    }
                }
            }
        }

        }







}
