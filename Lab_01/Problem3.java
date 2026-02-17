package Lab_01;

import java.sql.Time;

public class Problem3 {
    public static void main(String[] args){
        Temperature temperature = new Temperature();
        Temperature temperature_degree = new Temperature(36);
        Temperature temperature3_scale = new Temperature('C');
        Temperature temperature4_degree_scale = new Temperature(90, 'F');

        temperature.setTempAndScale(36, 'C');

        System.out.println(temperature.getScale());
        System.out.println(temperature.getTempC());
        System.out.println(temperature.getTempF());
    }
}

class Temperature{
    private double degrees;
    private char scale;
    
    Temperature(){
        degrees = 0;
        scale = 'C';
    }
    Temperature(double degrees){
        this.degrees = degrees;
        scale = 'C';
    }
    Temperature(char scale){
        degrees = 0;
        this.scale = scale;
    }
    Temperature(double degrees, char scale){
        this.degrees = degrees;
        this.scale = scale;
    }

    void setTemp(double temperature) { this.degrees = temperature; } // validate abs zero
    void setScale(char scale) { this.scale = scale; }
    void setTempAndScale(double degrees, char scale){
        this.degrees = degrees;
        this.scale = scale;
    }

    char getScale(){ return scale; }

    String getTempF(){
        if(scale == 'F'){
            return String.format("Temperature = %.2f %s", degrees, scale);
        }
        else{
            double degreesF = 9*(degrees/5) + 32;
            return String.format("Temperature = %.2f %s", degreesF, scale);
        }
    }

    String getTempC(){
        if(scale == 'C'){
            return String.format("Temperature = %.2f %s", degrees, scale);
        }
        else{
            double degreesC = 5*(degrees - 32) / 9;
            return String.format("Temperature = %.2f %s", degreesC, scale);
        }
    }
}
