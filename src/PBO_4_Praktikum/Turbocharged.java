package PBO_4_Praktikum;
public class Turbocharged extends Engine_Base {
    private double psi, multiplier;

    public Turbocharged(double psi, double multiplier, String name, double cc_single, int piston) {
        super(name, cc_single, piston);
        this.psi = psi;
        this.multiplier = multiplier;
    }

    public double getPsi() {
        return psi;
    }

    public double getMultiplier() {
        return multiplier;
    }

    @Override
    public void getEngineData() {
        super.getEngineData();
        System.out.println("Turbocharger PSI : " + this.getPsi() + " psi");
        System.out.println("Final HP : " + (this.getHorsepower()*this.getMultiplier()) + " HP");
    }
    
    
}
