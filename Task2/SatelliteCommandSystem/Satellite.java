package SatelliteCommandSystem;

public class Satellite {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    public void rotate(String direction) {
        this.orientation = direction;
        System.out.println("Satellite rotated to " + direction);
    }

    public void activatePanels() {
        if (!solarPanelsActive) {
            solarPanelsActive = true;
            System.out.println("Solar panels activated.");
        } else {
            System.out.println("Solar panels are already active.");
        }
    }

    public void deactivatePanels() {
        if (solarPanelsActive) {
            solarPanelsActive = false;
            System.out.println("Solar panels deactivated.");
        } else {
            System.out.println("Solar panels are already inactive.");
        }
    }

    public void collectData() {
        if (solarPanelsActive) {
            dataCollected += 10;
            System.out.println("Data collected: " + dataCollected);
        } else {
            System.out.println("Cannot collect data. Solar panels are inactive.");
        }
    }

    public void getStatus() {
        System.out.println("Orientation: " + orientation);
        System.out.println("Solar Panels: " + (solarPanelsActive ? "Active" : "Inactive"));
        System.out.println("Data Collected: " + dataCollected);
    }
}
