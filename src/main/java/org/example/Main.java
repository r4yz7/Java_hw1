package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void first(){
        System.out.println("Your time is limited,\n\tso don`t waste it\n\t\tliving someone else`s life\n\t\t\tSteve Jobs");
    }
    static void second(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = scanner.nextDouble();
        System.out.print("Enter percent: ");
        double p = scanner.nextDouble();
        double res = (p/100)*n;
        System.out.println("Result: " + res);
    }
    static void third(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter n2: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter n3: ");
        int n3 = scanner.nextInt();
        int res = (n1*100)+(n2*10)+n3;
        System.out.println("Res: " + res);
    }
    static void fourth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number(100000-999999): ");
        int n = scanner.nextInt();
        if(n<=100000 || n>=999999){
            System.out.println("Wrong number");
        }
        else{
            int n1 = n/100000;
            int n2 = n/10000%10;
            int n3 = n/1000%10;
            int n4 = n/100%10;
            int n5 = n/10%10;
            int n6 = n%10;
            int res = n6*100000 + n5*10000 + n3*1000 + n4*100+n2+10+n1;
            System.out.println("res: " + res);
        }
    }

    static void fifth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter(1-12)");
        int n = scanner.nextInt();
        if(n==1 || n==2 || n==12)
            System.out.println("Winter");
        else if(n>=3 && n<=5)
            System.out.println("Spring");
        else if(n>=6 && n<=8)
            System.out.println("Summer");
        else if(n>=9&&n<=11)
            System.out.println("Autumn");
        else
            System.out.println("Wrong number");
    }
    static void sixth(){
        System.out.print("Enter the number of meters: ");
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        System.out.print("1 - Miles");
        System.out.print("2 - Yards");
        System.out.print("3 - Inches");
        System.out.print("Choice: ");
        int menu = scanner.nextInt();
        if(menu==1){
            double res = m*0.000621371;
            System.out.println("Miles: " + res);
        }
        else if(menu == 2){
            double res = m/0.9144;
            System.out.println("Yards: " + res);
        }
        else if(menu==3){
            double res = m*39.37007874;
            System.out.println("Inches: " + res);
        }
        else
            System.out.println("Wrong number");

    }
    public static void main(String[] args) {
//        first();
//        second();
//        third();
//        fourth();
//        fifth();
//        sixth();

    }
}