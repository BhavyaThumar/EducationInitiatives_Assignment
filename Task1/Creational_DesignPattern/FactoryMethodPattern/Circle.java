package Task1.Creational_DesignPattern.FactoryMethodPattern;

// Concrete Product: Circle
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
