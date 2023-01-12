package ders07_ternary_switchstatement;

public class C06_sorulari {
    public static void main(String[] args) {
        int input=54;
        System.out.println(input>=50 ? "sınıfı geçtin": "maalesef kaldın");

        char chr1='h';
        System.out.println(chr1>='a'&&chr1<='z'? (char)(chr1-32) : chr1);

        int inpu2=-5;
        System.out.println(inpu2>0?inpu2:-1*inpu2);
    }
}
