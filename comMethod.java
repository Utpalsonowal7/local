class Mycompare {

    public int compare(int a, int b) {
        if (a == b)
            return 0;
        else if (a > b)
            return 1;
        else
            return -1;
    }

    public int compare(String str1, String str2) {
        return str1.compareTo(str2); // returns >0, 0, or <0
    }
}

public class comMethod {
    public static void main(String[] args) {
        Mycompare obj = new Mycompare();

        int a = 10, b = 20;
        String str1 = "Utpal";
        String str2 = "Sonowal";

        int c = obj.compare(a, b);

        if (c > 0) {
            System.out.println("a is greater");
        } else if (c < 0) {
            System.out.println("b is greater");
        } else {
            System.out.println("a and b are equal");
        }

        int strCompare = obj.compare(str1, str2);

        if (strCompare > 0) {
            System.out.println(str1 + " is greater");
        } else if (strCompare < 0) {
            System.out.println(str2 + " is greater");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
