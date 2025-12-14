class objclone implements Cloneable{
    
    int id = 1;
    String name = "Vishnu";

    @Override
    public Object clone() throws CloneNotSupportedException{
        
        return super.clone();  // shallow copy
    }

    public static void main(String[] args) throws Exception{
        
        objclone s1 = new objclone();
        objclone s2 = (objclone) s1.clone();

        System.out.println(s1.name); // Vishnu
        System.out.println(s2.name); // Vishnu
    }
}