import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Q1
        // Write a Java program that accept three numbers from the user and print the largest number .

        System.out.println("Please Enter first number :");
        int first = input.nextInt();
        System.out.println("Please Enter second number :");
        int second = input.nextInt();
        System.out.println("Please Enter third number :");
        int third = input.nextInt();

        if (first > second && first > third) {
            System.out.println(first + " First number is greatest number ");
        }
        else if (second > first && second > third) {
            System.out.println(second + " Second number is greatest number ");
        }
        else if (third > first && third > second) {
            System.out.println(third + " Third number is greatest number ");
        }
        else{
            System.out.println("All numbers are equal ");
        }


        // Q2
        // Write a Java program that accept a String and a number from the user
        // then print the character in the given index .

        System.out.println("Please Enter a String :");
        String str = input.nextLine();
        str = input.nextLine();

        System.out.println("Please Enter index number :");
        int number = input.nextInt();

        System.out.println(str.charAt(number));


        // Q3
        //  Write a program to enter the numbers till the user wants
        //  and at the end it should display the sum entered .

        int num = 0;
        String decision = "" ;
        int sum = 0;


        do {

            System.out.println("Please Enter a number :");
            num = input.nextInt();

            System.out.println("Do you want to complete ? (Y/N) :");
            decision = input.next();

            sum = sum + num;

        }while(!decision.equals("N"));

        System.out.println(sum);


        // Q4
        // Write a Java program to find positive and negative numbers of a given array:

        int arr[] = {10, -21 , 30, 31, -25};

        for ( int i:arr ) {

            if (i > 0) {
                System.out.println(i + " is a positive number");
            } else if (i < 0) {
                System.out.println(i + " is a negative number");
            }
            else {
                System.out.println(i + " is a zero ");
            }
        }


       // Q5
       // Write a Java program to find a shortest word of a given array:

        String arrWords[] = { "Tuwaiq", "Bootcamp" , "Student" , "JAVA" } ;

        int smallest = arrWords[0].length() ;
        String newWord = "" ;

        for ( String w:arrWords ) {
            if (w.length() <= smallest) {
                smallest = w.length();
                newWord = w ;
            }
        }
            System.out.println(newWord);
    }
}