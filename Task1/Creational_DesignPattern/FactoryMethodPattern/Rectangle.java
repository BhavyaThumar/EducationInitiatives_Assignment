package Task1.Creational_DesignPattern.FactoryMethodPattern;

// Concrete Product: Rectangle
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
