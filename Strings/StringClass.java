public class StringClass{
    public static void main(String []args){
        String k="karan";
        String n="Negi";
        //lenght
        System.out.println(k.length());
        //chatAt
        System.out.println(k.charAt(0));
        //substring from i to j-1
        System.out.println(k.substring(0,3));
        //concat
        System.out.println(k.concat(n));
        //indexOf and lastIndexOf
        System.out.println(k.indexOf('a'));
        System.out.println(k.indexOf('a',2));
        System.out.println(k.lastIndexOf('a'));
        /*
        5
        k
        kar
        karanNegi
        1
        3
        3
        */
       //equals
        String a="karan";
        System.out.println(k.equals(a)); //true
        //lowercase and uppercase
        System.out.println(k.toUpperCase()); //KARAN
        System.out.println(k.toLowerCase()); //karan
        //equalsIgnoreCase
        String b="KARAN";
        System.out.println(k.equalsIgnoreCase(b)); //true
        //trim
        String p="   karan   ";
        System.out.println(p.trim()); //karan
        //replace
        System.out.println(k.replace('a','o')); //koron
        //contains
        System.out.println(k.contains("ka")); //true
        //toCharArray
        String str = "Hello";
        char[] chars = str.toCharArray();
        for(char c : chars) {
            System.out.print(c + " ");
        }
        //startsWith
        System.out.println(k.startsWith("ka")); //true
        //endsWith
        System.out.println(k.endsWith("an")); //true
        //isEmpty
        String emptyString = "";
        System.out.println(emptyString.isEmpty()); //true
    }
}