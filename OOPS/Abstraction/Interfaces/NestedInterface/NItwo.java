interface OuterInterface {

    void show();

    interface InnerInterface {
        void msg();
    }
}

class Test implements OuterInterface.InnerInterface {

    public void msg()
    {

        System.out.println(
            "Message from Nested Interface Inside an Interface!");
    }

    public static void main(String[] args){
        
        OuterInterface.InnerInterface obj = new Test();
        obj.msg();
    }
}