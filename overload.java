class test {
    
    void display(int age){
        System.out.println(age);
    }

    
    void display(String name){
        System.out.println(name);
    }
}

public class overload {

    public static void main(String[] args) {
        test obj = new test();

        obj.display(23);
        obj.display("utplaj");
    }
}