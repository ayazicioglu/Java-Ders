package ders27_Overriding;

public class EParent extends DGrandParent{
    @Override   //bu notasyonu Java ekledi. Overridden methodu ile Override methodu ilişkilendirir.
    protected void method1() {
        System.out.println("Parent method1");
        //eğer parent class'da method1 silinirse felan @Override in altı çizilir CTE verir
    }
     protected void method2(){
        System.out.println("Parent method2");
    }
    private void method3(){
        System.out.println("Parent method3");
    }
}
