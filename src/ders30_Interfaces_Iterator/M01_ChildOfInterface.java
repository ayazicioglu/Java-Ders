package ders30_Interfaces_Iterator;

public class M01_ChildOfInterface implements I01_Interface,I02_Interface {
    //Bir class baska bir class'i extends keyword ile parent edinebilir
    //Ancak birden fazla class'i parent EDİNEMEZ
    //Interface'ler için böyle bir şey sözkonusu değildir
    //Bir class istediği kadar Interface'i implement edinebilir
    public static void main(String[] args) {
        System.out.println(I01_Interface.SAYI2);
        //I01_Interface.SAYI=20; atama yapmaya izin vermez
    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
