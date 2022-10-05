package PBO_4_Praktikum;
public class Engine_Base {
    private String name;
    private double cc_single, cc_total, horsepower;
    private int piston;

    public Engine_Base(String name, double cc_single, int piston) {
        this.name = name;
        this.cc_single = cc_single;
        this.piston = piston;
    }

    public String getName() {
        return name;
    }

    public double getCc_single() {
        return cc_single;
    }

    public double getCc_total() {
        this.cc_total = this.getCc_single()*this.getPiston();
        return cc_total;
    }
    
    public double getHorsepower() {
        this.horsepower = this.getCc_total()/15;
        return horsepower;
    }

    public int getPiston() {
        return piston;
    }
    
    public void getEngineData() {
        System.out.println("\nEngine Name : " + this.getName());
        System.out.println("Number of Cylinder : " + this.getPiston());
        System.out.println("Cubication : " + this.getCc_total() + " CC");
        System.out.println("Base Horsepower : " + this.getHorsepower() + " HP");
    }
}
