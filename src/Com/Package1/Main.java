package Com.Package1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int AgeOfUser = 56;
//        //string UserName = "Russka Ivan";
//        System.out.println("Default User Age : " + AgeOfUser + ".");
//        AgeOfUser = 34;
//        System.out.println("Age none default user : " + AgeOfUser + ".");
//
//        byte  Age2 = 25;
//        short Age3 = 32000;
//        int   Age4 = 21345;
//        long  Age5 = 213;
//
//        float  Age6 = 4.033f;
//        double Age7 = 4.033d;
//
//        char   Char1 = 'F';
//        String String1 = "Press F";
//        System.out.println(String1);
//
//        boolean isHaker = true;

        Scanner object1 = new Scanner(System.in);
//        System.out.print("Give me your name : ");
//        String UserName = object1.nextLine();
//        System.out.println("Hello, dog (" + UserName + ")");
//        int num1 = object1.nextInt();
//        byte num2 = object1.nextByte();
//        boolean boo1 = object1.nextBoolean();
//        System.out.println("Give me a first number : ");
//        float num1 = object1.nextFloat();
//
////          float num1 = 50, num2 = 33;
//        System.out.println("Give me a second number :");
//        float num2 = object1.nextFloat();
//        float res1 = num1 % num2;
//        float res2 = num1 + num2;
//        float res3 = num1 - num2;
//        float res4 = num1 * num2;
//        float res5 = num1 / num2;

//          res += 10;
//          res++;
//          System.out.println("Result : ");
//          System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5 +"\n");
//          int FirstNumber = 10, SecondNumber = 15;
//        System.out.print("Give me first string for if(user role) : ");
//        String FirstNumberForIf = object1.nextLine();
//        System.out.print("Give me a second string for if(password) : ");
//        String SecondStringForIf = object1.nextLine();
//          if ( FirstNumberForIf.equals("Admin") && SecondStringForIf.equals("qwerty") ) {
//              System.out.println("Uspehov");
//          } else {
//              System.out.println("Not uspehov");
//          }

        int num = object1.nextInt();
        switch (num) {
            case 1:
                System.out.println("num == 1");
                break;
            case 2 :
                System.out.println("num == 2");
                break;
            default:
                System.out.println("lOH1");
        }
    }
}
