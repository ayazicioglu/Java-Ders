package ders27_Overriding;

public class BKuslar extends AHayvanlar{
    protected void kanat(){
        System.out.println("kanatlidirlar");
    }
    protected void solunum(){
        System.out.println("akcigerle nefes alırlar");
    }
    protected void gaga(){
        System.out.println("gagaları vardır");
    }
    protected void cogalma(){
        System.out.println("yumurtayla çoğalırlar");
    }
}
