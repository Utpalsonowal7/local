class str {
    public static void main(String[] args) {
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
    }
}