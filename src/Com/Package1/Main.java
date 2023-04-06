package Com.Package1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int AgeOfUser = 56;
//        string UserName = "Russka Ivan";
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

//        Scanner object1 = new Scanner(System.in);
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

//        int num = object1.nextInt();
//        switch (num) {
//            case 1:
//                System.out.println("num == 1");
//                break;
//            case 2 :
//                System.out.println("num == 2");
//                break;
//            default:
//                System.out.println("lOH1");
//        for(float i = 150; i >= 10; i/=2) {
//            System.out.println("Uspehov : " + i);
//        }
//        int kek = 0;
//        while(kek < 10){
//            System.out.println("Keks : " + kek);
//            kek++;
//        }
//
//        float frik = 15;
//        do {
//            System.out.println("FriksNumber is : " + frik);
//            frik *=15;
//        } while(frik < 16);
//        int[] Arr = new int[5];
//        Scanner ObjScan = new Scanner(System.in);
//
//        for(int i = 0; i < Arr.length; i++) {
//            System.out.print("Hello, give me a number : ");
//            int ValueNumber = ObjScan.nextInt();
//            Arr[i] = ValueNumber;
////            Arr[i] = java.util.random.RandomGenerator.getDefault().nextInt();
//        }
//        int min = Arr[0];
//        for(int CountIf = 0; CountIf < Arr.length; CountIf++ ) {
//         if(Arr[CountIf] < min){
//          min = Arr[CountIf];
//         }
//        }
//        System.out.println("Min for Array : " + min);
//        char [][] Symbols1 = new char[2][2];
//        Symbols1[0][0] = 't';
//        System.out.println(Symbols1[0][0]);
//
//        byte [][] Numbers = new byte[][] {
//                {5, 7},
//                {7, 3},
//                {2, 0}
//        };
//        Numbers[1][1] = 67;
//        System.out.println(Numbers[1][1]);
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(50);
//        numbers.add(1, 35);
//
//        System.out.println(numbers.get(1));
//        numbers.remove(1);
//
//        for(Integer el :numbers) {
//            System.out.println(el);
//        }

//        LinkedList<Integer> num2 = new LinkedList<>();
//        num2.add(5);
//        num2.add(7);
//        num2.add(2123);
//
//        for(Integer elem : num2) {
//          System.out.println(elem);
//    }
//        InfoFunc("Fucking paranoya");
//        int Result3 = SummFunc(1 ,5);
//        int Result2 = SummFunc(5, Result3);
//        InfoFunc("Itogo : " + String.valueOf(Result2));
//        float[] ArrayOfFloat = new float[] {5, 15, 34, 56};

//        System.out.println(String.valueOf(SummArr(ArrayOfFloat)));
//        Scanner ScannerObject = new Scanner(System.in);
//        float[] ArrOfFloat    = new float[] {0, 0, 0};
//
//        for(int i = 0; i < 3; i++) {
//            System.out.println("Дай числа : ");
//            float ChislaOtDogs = ScannerObject.nextFloat();
//            ArrOfFloat[i] = ChislaOtDogs;
//            ChislaOtDogs = 0;
//        }
//        SummArr(ArrOfFloat);
//          Car BMW = new Car(250.5f, 1500, "green", new byte[] {0, 0, 0});
//          BMW.dviglo.SetValues(true, 15);
//          BMW.dviglo.info();
//
//          Truck Gruzovik = new Truck(5600, new byte[] {100, 0, 50});
//          Gruzovik.SetSpeedValue(250.4f, 2700, "white", new byte[] {0, 50, 99}, true);
//          Gruzovik.dviglo.SetValues(false, 15000);
//          Gruzovik.dviglo.info();
//          System.out.println(Gruzovik.GetValues());

//          Gruzovik.getLoaded();

        Car flyCar = new Car(250.5f, 3600, "orange", new byte[] {0, 14, 56}) {
            @Override
            public void MoveObject(float speed) {
                super.MoveObject(speed);

                this.dviglo.isReady(true);
                System.out.println("Mashina ne govno, letaet");
            }
        };

        flyCar.MoveObject(356);
    }

//    public static int SummFunc(Integer a, Integer b) {
//        int Result =  a + b;
//        String Rez = "Result function : " + Result;
//        InfoFunc(Rez);
//        return Result;
//    }
//    public static void InfoFunc(String Words) {
//        System.out.println(Words);
//    }
//    public static float SummArr(float[] Arr) {
//      float Summ = 0;
//      for(int i = 0; i < Arr.length; i++) {
//          Summ += Arr[i];
//      }
//      System.out.println("Result summ for Arr : " + Summ);
//      return  Summ;
//    }
}
