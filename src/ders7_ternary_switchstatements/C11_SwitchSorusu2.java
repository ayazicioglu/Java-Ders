package ders7_ternary_switchstatements;

public class C11_SwitchSorusu2 {
    public static void main(String[] args) {
        char hrf = 's';
        switch (hrf) {
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("yanlış harf seçimi");
        }
    }
}