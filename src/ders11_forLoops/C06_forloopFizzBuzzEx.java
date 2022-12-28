package ders11_forLoops;

import java.util.Scanner;

public class C06_forloopFizzBuzzEx {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int input= scan.nextInt();

        for (int i = 1; i < input; i++) {
            if (i%3==0 && i%5==0) System.out.println("fizzBuzz\t");
            else if (i%3==0) System.out.print("fizz\t");
            else if (i%5==0) System.out.print("buzz\t");
            else System.out.print(i+" "); {

            }
            {

            }
        }

    }
}
