package ders28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("src/ders28_exceptions/metin.txt");
        /*
        Bazı kodları yazdığımızda Java compile time sirasında o kodlarda exception riskini görür
         ve bizden bir çözüm bekler

         Özellikle dosya okuma ve yazma ile ilgili IO (Input/Output) işlemlerinde
         Java ya okuyamazsam ya yazamassam diyerek bizden compile time'da çözüm ister

         bu durumda biz exception ile karsilasildığında kod dursun diyorsak:
         method satirina throws keyword kullanarak beklenilen exception(lar)i deklare edebiliriz
         Bu sadece olayın farkında olduğumuzu deklare eder.

         kod devam etsin diyorsak: try-catch-(finally) blogu kullanabiliriz
         */
    }
}
