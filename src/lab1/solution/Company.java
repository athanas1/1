/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author athanas1
 */
public class Company {
     private HRManager HR;
     
     public Company(){
         HR = new HRManager();
     }

    public HRManager getHR() {
        return HR;
    }

    public void setHR(HRManager HR) {
        this.HR = HR;
    }
     
    
     
}
