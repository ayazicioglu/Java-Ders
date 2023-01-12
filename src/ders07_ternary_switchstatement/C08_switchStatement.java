package ders07_ternary_switchstatement;

public class C08_switchStatement {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        char islem='*';

        switch (islem){
            case '+':
                System.out.println("Sayiların toplamı:"+(a+b));break;
            case '-':
                System.out.println("Sayiların farkı:"+(a-b));break;
            case '*':
                System.out.println("Sayiların çarpımı:"+a*b);break;
            case '/':
                System.out.println("sayıların bölümü:"+a/b);    break;
            default:
                System.out.println("yanlış işlem tercihi");
        }
    }
}
