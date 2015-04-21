/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kallie
 */
public class CtoFService implements TempConverter{
    private double temp;
    public CtoFService(double temp){
        this.temp = temp;
    }
    public CtoFService(){}

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    public double convert(){
        //°C  x  9/5 + 32 = °F
        double c = temp;
        double f;
        f = (c * (9/5)) + 32;
        return f;
    }
}
