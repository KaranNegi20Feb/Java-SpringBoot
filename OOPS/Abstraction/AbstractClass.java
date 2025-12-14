abstract class myclass{
    String name;
    public abstract void myfun();
    public void myfun2(){
        System.out.println("fun2");
    }
}
class myclass2 extends myclass{
        @Override
        public void myfun(){
            System.out.println("fun1");
        }
}

public class InterfaceAbstract{
    public static void main(String []args){
        myclass2 m1=new myclass2();
        m1.myfun();
        m1.myfun2();
    } 
}