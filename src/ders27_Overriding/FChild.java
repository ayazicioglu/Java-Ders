package ders27_Overriding;

public class FChild extends EParent{
    @Override
    protected void method1() {
        super.method1();
        //eğer overriding method ile birlikte  overridden method da çalışsın istersek
        //overriding method icinden  super.method1(); yazabiliriz
    }


    protected void method2() {

    }

    public void method3(){
        System.out.println("Child method3");
        //Parent class'da aynı isimde method olmasına rağmen override olarak görünmedi
        //sebep: parent'deki method3 private access modifier'a sahip olduğundan
    }
}
