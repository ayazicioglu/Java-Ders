package ders07_ternary_switchstatement;

public class C04_ternaryOpera {
    public static void main(String[] args) {
        int input=45;

        if (input>=100) input*=2;
        else input+=10;
        System.out.println(input);

        //ternary ile yazılış
        input =45;
        input=input>=100 ? input*2 :input+10;
        System.out.println(input);
    }
}
