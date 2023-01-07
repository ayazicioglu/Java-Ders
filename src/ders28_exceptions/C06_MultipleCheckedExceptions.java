package ders28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {
    public static void main(String[] args) {
        //metin.txt dosyasindaki yazilari yazdıralım
        /*
        Eğer birden fazla catch cümlemiz var ise ve ecxeption'lar arasında parent-child ilişkisi varsa:
        1-ikisini de yazmak istiyorsak önce child exception, sonra parent yazılmalıdır. Aksi durumda parent
        üstte olursa tüm exceptionları yakalayacağından child exceptionları yazmak anlamsız olur.
        2- ikisini yazmak istemiyorsak sadece parent exception yeterli olacaktır. cunku parent
        daha kapsayıcıdır ve daha çok exception'ı yakalar
         */

        try {
            FileInputStream fis=new FileInputStream("src/ders28_exceptions/metin.txt");
            int k=0;
            while ((k=fis.read())!= (-1)){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {//geniş aralıklı elek
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {//daha dar aralıklı elek
            throw new RuntimeException(e);
        }
    }
}
