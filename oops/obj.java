class car {
    String brand;
    String name;
    String color;

    void display() {
        System.out.println(" The car brand is : " + brand);
        System.out.println(" The car name is : " + name);
        System.out.println(" The car color is : " + color);
    }
}

class obj {
    public static void main(String[] args) {
      car car1 = new car();
      car1.brand = "Toyota";
      car1.name = "Innova";
      car1.color = "White";

      car car2 = new car();
      car2.brand = "BMW";
      car2.name = "M5 CS";
      car2.color = "Frozen Deep Green";

      car1.display();
      System.out.println("\n");
      car2.display();
    }

}