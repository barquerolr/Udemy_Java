package com.company;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUP()
    {
        //getTheCase().pressPowerBUtton();
        theCase.pressPowerBUtton();
        drawLogo();
    }

    private void drawLogo()
    {
        //Fancy Graphics
        //getMonitor().drawPixelAt(1200,50,"yello");
        monitor.drawPixelAt(1200,50,"yellow");
        //Use getters to check whether the objects had been initialized, or looking for some verification.
    }

    /*private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
    */
}
