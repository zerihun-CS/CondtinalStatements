public class NestedForLoop {

    public static void main(String[] args){

        // for(inti, bol condition, inc/dec)


        int[] numbers = {23, 37, 85, 64, 43};
        int minNumber = numbers[0];
        int secondMinNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (minNumber>numbers[i]){
                minNumber = numbers[i];}
            if (minNumber > numbers[i])
                secondMinNumber = numbers[i];


        }
        System.out.println(numbers[secondMinNumber]);



    }
}
