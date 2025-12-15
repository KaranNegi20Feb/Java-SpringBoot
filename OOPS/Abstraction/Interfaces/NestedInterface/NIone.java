class Outer {
    interface Inner {
        void display();
    }
}

class GFG implements Outer.Inner{
    
    public void display(){
        
        System.out.println(
            "Hello from Nested Interface Inside a Class!");
    }

    public static void main(String[] args){
        
        Outer.Inner obj = new GFG();
        obj.display();
    }
}