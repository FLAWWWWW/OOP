package Lab_02.Problem4;

public abstract class Circuit {
    protected double potentialDiff;
    
    public abstract double getResistance();
    
    public abstract double getPotentialDiff();
    
    public abstract void applyPotentialDiff(double V);
    
    public double getPower() {
        return Math.pow(getPotentialDiff(), 2) / getResistance();
    }
    
    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }
}