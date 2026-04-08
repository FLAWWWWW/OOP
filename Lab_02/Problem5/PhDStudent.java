package Lab_02.Problem5;

import java.util.Objects;

public class PhDStudent extends Student {
    private String researchTopic;
    private String supervisor;
    
    public PhDStudent(String name, int age, String major, int studentId, 
                     String researchTopic, String supervisor) {
        super(name, age, major, studentId);
        this.researchTopic = researchTopic;
        this.supervisor = supervisor;
    }
    
    @Override
    public String getOccupation() {
        return "PhD Student - Research: " + researchTopic;
    }
    
    @Override
    protected boolean canHavePet(Animal pet) {
        return !(pet instanceof Dog);
    }
    
    public String getResearchTopic() {
        return researchTopic;
    }
    
    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }
    
    public String getSupervisor() {
        return supervisor;
    }
    
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Research: " + researchTopic + 
               ", Supervisor: " + supervisor;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        PhDStudent that = (PhDStudent) o;
        return Objects.equals(researchTopic, that.researchTopic) &&
               Objects.equals(supervisor, that.supervisor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), researchTopic, supervisor);
    }
}