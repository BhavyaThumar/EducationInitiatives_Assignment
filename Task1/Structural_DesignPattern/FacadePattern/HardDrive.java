package Task1.Structural_DesignPattern.FacadePattern;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data from hard drive (lba: " + lba + ", size: " + size + ")");
        return new byte[size];
    }
}
