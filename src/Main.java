import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);




        Scanner scan   = new Scanner(System.in);
        System.out.println("Insert month in number");
        int seasonInput = scan.nextInt();

        if(seasonInput == 1)
            System.out.println("January");
        else if (seasonInput == 2)
            System.out.println("February");
        else if (seasonInput == 3)
            System.out.println("March");
        else
            System.out.println("");



        switch (seasonInput) {
            case 1 : System.out.println("January");
                break;
            case 2 : System.out.println("February");
                break;
            case 3 : System.out.println("March");
                break;
            case 4 :System.out.println("April");
                break;
            case 5 :System.out.println("May");
                break;
            case 6 : System.out.println("June");
                break;
            case 7 : System.out.println("July");
                break;
            case 8 : System.out.println("August");

            case 9: System.out.println("September");
                break;
            case 10 : System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;

            default: System.out.println("ERROR");
        }


        // summer, july, aug
        // autumn sep, oct, nov
        // winter jan, feb
        // spring march april may

//        System.out.println("please insert the Season ?");
//        String seasonInput = input.nextLine();

//        if(seasonInput.equalsIgnoreCase("summer")){
//            System.out.println("months july, aug ");
//        }
//        else if(seasonInput.equalsIgnoreCase("autumn")){
//            System.out.println("months sep, oct, nov");
//        }
//        else if(seasonInput.equalsIgnoreCase("winter")){
//            System.out.println("months  jan, feb ");
//        }
//        else if(seasonInput.equalsIgnoreCase("spring")){
//            System.out.println("months march april may  ");
//        }

        //switch (expression){
        // case value1:
        //case value2
//size 42 -> small size-> 48->mid  size->52 large size

        System.out.println("please insert your size ?");
        int sizeInput = input.nextInt();

//    switch (sizeInput){
//
//            case 42-3:
//                System.out.println("small size");
//                break;
//            case 48:
//                System.out.println("mid size");
//                break;
//            case 52:
//                System.out.println("large size");
//                break;
//
//            default:
//                System.out.println("error");
//
//
//
//
//        }

//String name = "zerihun";
//        char grade = 'A';
//        int age  = 45;
//        System.out.println("please Enter number to conver it to season");
//        byte season=input.nextByte();
//        switch (season){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//            case 6:
//                System.out.println("June");
//            default:
//                System.out.println("Error");
//        }



//        switch (seasonInput){
//
//            case "summer":
//                System.out.println("months july, aug ");
//                break;
//            case "autumn":
//                System.out.println("months sep, oct, nov");
//                break;
//            case "winter":
//                System.out.println("months  jan, feb ");
//                break;
//            case "spring":
//                System.out.println("months march april may  ");
//                break;
//            default:
//                System.out.println("error"); }


//        int monthNumber =input.nextInt();
//
//        switch (monthNumber) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("error");
//
//
//        }
//
//        System.out.print("Please enter : ");
//        int number1 = input.nextInt();
//        char sign = input.next().charAt(0);
//        int number2 = input.nextInt();
//
//
//
//        switch (sign) {
//            case '+':
//                System.out.println(number1 + number2);
//                break;
//            case '-':
//                System.out.println(number1 - number2);
//                break;
//            case '*':
//                System.out.println(number1 * number2);
//                break;
//            case '/':
//                System.out.println(number1 / number2);
//                break;
//            default:
//                System.out.println("Error");
//
//
//        }

        double firstNumber, secondNumber, result;



        System.out.println("Insert first number");
        firstNumber = input.nextDouble();

        System.out.println("Choose operation (+, -, *, or /)");
        char operator = input.next().charAt(0);

        System.out.println("Insert second number");
        secondNumber = input.nextDouble();

        switch (operator){
            case '+':
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                break;


            case '-':
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                break;


            case '/':
                result = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                break;


            case '*':
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                break;


            default:
                System.out.println("Invalid equation");
            }

        }





}