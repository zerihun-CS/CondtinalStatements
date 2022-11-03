import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForLoop {

    public static void main(String a[]){

            // for(init; , cond; , inc/dec)
        //for(int i = 0; i<10; i++){


        //code

        //   }

//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(i);
//            System.out.println("hello world"); //5
//        }

//
//
//
//        Scanner scan = new Scanner(System.in);
//
//        String[] members = new String[10];
//
//
//        for (int member = 0 ; member < members.length; member ++) {
//            System.out.println("please insert your name ");  //1
//
//            members[member] = scan.nextLine();
//
//        }
//
//
//
//        Random random = new Random();
//        random.nextInt(0,10);
//
//
//
//        System.out.println(Arrays.toString(members));
//
//        System.out.println("the lucky member is "+members[random.nextInt(0,10)]);


//        String names[] = {"hanna","beza","dav","able","amir","shalom"};
////        System.out.println(names[3]);
//
        int[] numbers = {9,4,35,35,7,56,8,67,879,7809,89,0,800,89,0,98,45,23};
      int sum=0;

        int greatestNumber = 1;
        int secondGreatestNumber = 0;

      for (int i = 0; i<numbers.length; i++){

          if(greatestNumber<numbers[i]) {
              secondGreatestNumber = greatestNumber;
              greatestNumber = numbers[i];

          }

      }

        System.out.println("the GN IS  "+ secondGreatestNumber);

// odd numbers replaced with zero
        for (int i=0; i< numbers.length; i++) {

            if(numbers[i] %2 != 0)
                numbers[i] = 0;

        }

        System.out.println(Arrays.toString(numbers));


        // sum of the elements in an array
        for (int i=0; i< numbers.length; i++){

            System.out.println("sum = "+sum+"  array element  "+numbers[i]);
//            sum += numbers[i];
            sum = sum+ numbers[i];



        }


//        System.out.println("what's up");


//        for(int i = 0; i<5; ){
//            System.out.println(i);
//            System.out.println("what's up");
//            i++;
//            System.out.println("after inc"+i);
//        }



        int[] anyArray = {5,6,45,65,7,6,8,67,87,8,79};

        for(int i  = 0; i < anyArray.length; i++){
            System.out.println(anyArray[i]);
        }
//for(datatype value: array){
        //}


        // for each loop
        for (int singleValue:anyArray ) {

            System.out.println(singleValue);
        }

        String names[] ={"able","hanna","dav","alex"};
        int i = 0;
        for(String value:names){
            System.out.println(names[i]);
            i++;
        }


        Scanner input = new Scanner(System.in);

        System.out.println("please insert a number ?");

        int fnumber = input.nextInt();


        int factorialOutput = 1 ;



// factorial of a number example
        for(i = fnumber; i>0; i--){

            factorialOutput = factorialOutput * i;

        }
        System.out.println("the factorial of "+ fnumber+" is "+ factorialOutput);




    }

}
