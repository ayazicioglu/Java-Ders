package ders24_StringBuilder;

import ders25_inheritance.APersonel;

public class FChildOfPersonel extends APersonel {
    public static void main(String[] args) {
        FChildOfPersonel obj1=new FChildOfPersonel();
        System.out.println(obj1.isim);
        //obj1.privateMethod() çağrılamaz. çünkü private

    }
}
