package ders3_dataCasting_matematik;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        System.out.println('a'+'b');
        System.out.println('a'*'b');
        System.out.println('a'-32);
        System.out.println((char)('a'-32));

        Scanner scan=new Scanner(System.in);
        char ilkarakter=scan.next().charAt(0);
        System.out.println((char) (ilkarakter+1)+","+(char) (ilkarakter+2)+","+(char) (ilkarakter+3));
    }
}
