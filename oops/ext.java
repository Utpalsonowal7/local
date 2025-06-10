class Employee {
    int empId;
    String name;

    void display() {
        System.out.println("The name and salary of the EMPLOYEE is : ");
    }

}

class Manager extends Employee {
    float salary ;

    Manager(){
        empId = 101; 
        name = "Utpal";
        salary = 123456.01f;
    }

    void input() {
        System.out.println(empId + " " + name + " " + salary);
    }

}

class ext {
    public static void main(String[] args) {
        Manager obj = new Manager();

        obj.display();
        obj.input();
    }
}