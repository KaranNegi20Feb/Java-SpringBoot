interface myclass{
    int a=10;//<-- treated as constant
    void myfun();
}
class myclass2 implements myclass{
        @Override
        public void myfun(){
            System.out.println("fun1" + a);
        }
}

public class InterfaceAbstract{
    public static void main(String []args){
        myclass2 m1=new myclass2();
        m1.myfun();
    } 
}