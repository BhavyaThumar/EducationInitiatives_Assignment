package SatelliteCommandSystem;

public class SolarPanelCommand implements Command {
    private Satellite satellite;
    private boolean activate;

    public SolarPanelCommand(Satellite satellite, boolean activate) {
        this.satellite = satellite;
        this.activate = activate;
    }

    @Override
    public void execute() {
        if (activate) {
            satellite.activatePanels();
        } else {
            satellite.deactivatePanels();
        }
    }
}
