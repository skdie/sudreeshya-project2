package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sc;

    public static void main(String[] args) {
        int qNo;
        int sum;
        int number;
        String num;
        int length;
        int i;
        sc = new Scanner(System.in);
        System.out.println("Enter question number");
        qNo = sc.nextInt();
        switch (qNo){
            case 1:
                System.out.println("Enter a number");
                number = sc.nextInt();
                i=1;
                while (i <= number){
                    System.out.print(i+" ");
                    i++;
                }
                break;

            case 2:
                System.out.println("Enter a number");
                number = sc.nextInt();
                while (number >=1){
                    System.out.print(number+" ");
                    number--;
                }
                break;

            case 3:
                char ch = 'a';
                while (ch != '{'){
                    System.out.print(ch+" ");
                    ch++;
                }
                break;

            case 4:
                number = 0;
                while (number <= 100){
                    System.out.println(number);
                    number = number + 2;
                }
                break;

            case 5:
                number = 1;
                while (number <= 100){
                    System.out.println(number);
                    number = number + 2;
                }
                break;

            case 6:
                i =1;
                sum = 0;
                System.out.println("Enter a number: ");
                number = sc.nextInt();
                while(i <= number){
                    sum = sum + i;
                    i++;
                }
                System.out.println(sum);
                break;

            case 7:
                i = 0;
                sum = 0;
                System.out.println("Enter a number: ");
                number = sc.nextInt();
                while (i <= number){
                    sum = sum +i;
                    i = i+2;
                }
                System.out.println("The sum of even numbers is: "+sum);
                break;

            case 8:
                i = 1;
                sum = 0;
                System.out.println("Enter a number: ");
                number = sc.nextInt();
                while (i <= number){
                    sum = sum +i;
                    i = i+2;
                }
                System.out.println("The sum of odd numbers is: "+sum);
                break;

            case 9:
                System.out.println("Enter a number to get multiplication table: ");
                number = sc.nextInt();
                i = 1;
                while (i<=10){
                    System.out.println(number + " * " + i + " = " + number*i);
                    i++;
                }
                break;

            case 10:
                System.out.println("Enter the digit which you want to count: ");

                try {
                    number = sc.nextInt();
                    length = String.valueOf(number).length();
                    System.out.println("The length is: "+length);
                }
                catch (Exception e){
                    System.out.println("Exception occured "+e);
                }
                break;

            case 11:
                System.out.println("Enter a digit: ");
                try{
                    number = sc.nextInt();
                    num = String.valueOf(number);
                    length = num.length();
                    System.out.println("First digit is: "+num.charAt(0)+"\nLast digit is: "+num.charAt(length-1));
                }
                catch (Exception e){
                    System.out.println("Exception occured: "+e);
                }
                break;

            case 12:
                System.out.println("Enter a digit: ");
                try{
                    number = sc.nextInt();
                    num = String.valueOf(number);
                    length = num.length();
                    System.out.println();
                    for(i=0;i<length;i++){
                        if(i == 0){
                            System.out.print(num.charAt(length-1));
                        }
                        else if(i == (length-1)){
                            System.out.print(num.charAt(0));
                        }
                        else
                            System.out.print(num.charAt(i));
                    }
                }
                catch (Exception e){
                    System.out.println("Exception occured: "+e);
                }
                break;

            case 13:
                System.out.println("Enter a digit");
                try {
                    sum = 0;
                    number = sc.nextInt();
                    while(number > 0){
                        i = number % 10;
                        sum = sum + i;
                        number = number/10;
                    }
                    System.out.println("The sum is: "+sum);
                }
                catch (Exception e){
                    System.out.println("Exception occured "+e);
                }
                break;

            case 14:
                System.out.println("Enter a digit");
                try {
                    sum = 1;
                    number = sc.nextInt();
                    while(number > 0){
                        i = number % 10;
                        sum = sum * i;
                        number = number/10;
                    }
                    System.out.println("The product is: "+sum);
                }
                catch (Exception e){
                    System.out.println("Exception occured "+e);
                }
                break;

            case 15:
                System.out.println("Enter a digit: ");
                try {
                    number = sc.nextInt();
                    while(number > 0){
                        i = number % 10;
                        System.out.print(i);
                        number = number/10;
                    }
                }
                catch (Exception e){
                    System.out.println("Exception occured "+e);
                }
                break;

            case 16:
                System.out.println("Enter a digit: ");
                try{
                    number = sc.nextInt();
                    boolean palindrome = true;
                    num = String.valueOf(number);
                    length = num.length();
                    int j = length;
                    for(i=0;i<=length/2;i++){
                        j--;
                        if(num.charAt(i) != num.charAt(j)){
                            palindrome = false;
                            break;
                        }

                    }
                    if(palindrome){
                        System.out.println(number+" is a palindrome");
                    }
                    else {
                        System.out.println(number+" is not a palindrome");
                    }
                }
                catch (Exception e){
                    System.out.println("Exception occured :"+e);
                }
                break;

            case 17:
                try{
                    System.out.println("Enter a number: ");
                    number= sc.nextInt();
                    length = findLength(number);
                    int a[] = new int[length];

                    i=0;
                    while(number>0){
                        length--;
                        a[length]= number%10;
                        number = number/10;
                    }

                }
                catch (Exception e){
                    System.out.println("Exception occured: "+e);
                }
                break;
        }

    }

    private static int findLength(int number) {
        int i = 0;
        while(number>0){
            number = number/10;
            i++;
        }
        return i;

    }
}
