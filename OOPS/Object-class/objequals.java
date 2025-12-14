class objequals{
    
    String title;

    objequals(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj){
        
        objequals b = (objequals) obj;
        return this.title.equals(b.title);
    }

    public static void main(String[] args) {
        objequals b1 = new objequals("Java");
        objequals b2 = new objequals("Java");

        System.out.println(b1.equals(b2)); // true
    }
}