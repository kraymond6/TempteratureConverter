/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kallie
 */
public class FtoCService implements TempConverter{
    private double temp;
    public FtoCService(Double temp){
        this.temp = temp;
    }
    public FtoCService(){
        
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    @Override
    public double convert(){
        //(°F  -  32)  x  5/9 = °C
        double f = temp;
        double c;
        c = (f - 32) * (5/9);
        return c;
    }
}
