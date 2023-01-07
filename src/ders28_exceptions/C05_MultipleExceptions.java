package ders28_exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    public static void main(String[] args) {
        /*
        Eger birden fazla excepiton oluşma ihtimali varsa bu exception'lar birbirinden bagımsız ise;
            1-tek try istenen kadar catch yapabiliriz
            2-ikisi icin icice try catch yapabiliriz
            3- tek ama daha kapsamlı try catch yapabiliriz.
            Üçünün de çözümü var sırasıyla aşağıda
         */

        String str="Java da çok fazla exception var";
        int[] arr={3,5,1,3,2,6,3,6,8,5,2};

        //kullanıcıdan bir tamsayı alın ve girilen sayiyi index olarak kullanıp
        //str ve arr den o indexdeki elemanlari yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir index giriniz");
        int index= scan.nextInt();

        //System.out.println("String'de istenilen indexdeki element:  "+str.substring(index,index+1));
        //System.out.println("Array'de istenilen indexdeki element: "+arr[index]);

        /* 1.çözüm>>> tek try istenen kadar catch

        try{
            System.out.println("String'de istenilen indexdeki element:  "+str.substring(index,index+1));
            System.out.println("Array'de istenilen indexdeki element: "+arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("İstenen index String'in sınırları dışında");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("İstenen index Array'in sınırlları dışında");
        }

         */

        /* 2.çözüm iç içe try catch
        try {
            try {
                System.out.println("String'de istenilen indexdeki element:  "+str.substring(index,index+1));
                System.out.println("Array'de istenilen indexdeki element: "+arr[index]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("İstenen index String'in sınırları dışında");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("İstenen index Array'in sınırlları dışında");
        }

         */
        //3. çözüm tek ama daha kapsamlı bir catcher kullanma

        try{
        System.out.println("String'de istenilen indexdeki element:  "+str.substring(index,index+1));
        System.out.println("Array'de istenilen indexdeki element: "+arr[index]);
        }catch (RuntimeException e){
            System.out.println("index String ve/veya Array'in sınırları dışında");
            e.printStackTrace();
        }
    }
}
