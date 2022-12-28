package ders11_forLoops;

public class C09_NestedFrLoop {
    public static void main(String[] args) {
        int kisakenar=6;
        int uzunkenar=9;

        for (int i = 1; i <=kisakenar; i++) {      //outer loop sütun uzunluğunu belirler
            for (int j = 1; j <=uzunkenar ; j++) { //inner loop satır uzunluğunu belirler
                System.out.print("* ");

            }
            System.out.println(""); //satır ile işlem bittiğinde alt satıra geçmesi için.
        }
    }
}
