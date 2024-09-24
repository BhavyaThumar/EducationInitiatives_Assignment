package Task1.Structural_DesignPattern.FacadePattern;

public class CPU {
    public void freeze() {
        System.out.println("Freezing CPU...");
    }

    public void jump(long position) {
        System.out.println("Jumping to position " + position);
    }

    public void execute() {
        System.out.println("Executing instructions...");
    }
}
