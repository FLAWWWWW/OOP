package Lab_02.Problem4;

public class Series extends Circuit {
    private Circuit circuit1;
    private Circuit circuit2;
    private double potentialDiff;
    
    public Series(Circuit c1, Circuit c2) {
        this.circuit1 = c1;
        this.circuit2 = c2;
        this.potentialDiff = 0.0;
    }
    
    @Override
    public double getResistance() {
        return circuit1.getResistance() + circuit2.getResistance();
    }
    
    @Override
    public double getPotentialDiff() {
        return potentialDiff;
    }
    
    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDiff = V;
        
        double totalResistance = getResistance();
        double current = V / totalResistance;
        
        double v1 = current * circuit1.getResistance();
        double v2 = current * circuit2.getResistance();
        
        circuit1.applyPotentialDiff(v1);
        circuit2.applyPotentialDiff(v2);
    }
    
    public Circuit getCircuit1() {
        return circuit1;
    }
    
    public Circuit getCircuit2() {
        return circuit2;
    }
    
    @Override
    public String toString() {
        return "Series(" + circuit1 + ", " + circuit2 + ") " + potentialDiff;
    }
}