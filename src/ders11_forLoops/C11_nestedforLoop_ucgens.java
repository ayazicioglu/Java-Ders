package ders11_forLoops;

public class C11_nestedforLoop_ucgens {
    public static void main(String[] args) {
        int input=5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
        for (int i =input-1; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
