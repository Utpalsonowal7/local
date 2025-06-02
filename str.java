class str {
    public static void main(String[] args) {
        //string class
        String str1 = "utpal";
        String str2 = new String("utpal");


        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
        System.out.println(str1.charAt(4));
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2, 3));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.replace('a', 'o'));
        System.out.println(str1.contains("a"));

        //StringBuffer class
        StringBuffer str3 = new StringBuffer("Hello,");

        System.out.println(str3.append(" world! "));
        System.out.println(str3.insert( 0, " world! "));
    }
}