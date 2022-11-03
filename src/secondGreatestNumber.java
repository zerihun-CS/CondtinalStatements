import java.util.GregorianCalendar;

public class secondGreatestNumber {

    public static void main(String[] args){


        int[] numbers = {9,4,35,35,7,56,8,67,879,7809,89,0,900,89,0,98,45,23,980,7809};
        int sum=0;

        int greatestNumber = numbers[0];
        int secondGreatestNumber = numbers[0];

        for (int number : numbers) {

            if (greatestNumber < number) {
                secondGreatestNumber = greatestNumber;
                greatestNumber = number;

            } else if ((secondGreatestNumber < number) && greatestNumber > number) {
                secondGreatestNumber = number;

            }
            //SGN = 980;
            //GN = 7809;

            System.out.println("GreatestNumber " + greatestNumber);
            System.out.println("SecondGreatestNumber " + secondGreatestNumber);

        }

        System.out.println("the  2nd GN IS  "+ secondGreatestNumber);

    }
}
