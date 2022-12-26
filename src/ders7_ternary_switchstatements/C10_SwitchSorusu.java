package ders7_ternary_switchstatements;

public class C10_SwitchSorusu {
    public static void main(String[] args) {
        int gunno=5;
        switch (gunno) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaİçi");
                break;
            case 6:
            case 7:
                System.out.println("HaftaSonu");
                break;
            default:
                System.out.println("Yanlış giriş");
        }
    }
}


