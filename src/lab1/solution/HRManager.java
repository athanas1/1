/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1.solution;

/**
 *
 * @author Jim
 */
public class HRManager {
    private Employee employee;
    
   //single responsibility rule   1.Keep it simple  2.
    
    public void HireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee();
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        employee = e;
    }
    
    
     public void OrientNewEmployee(){
       employee.doOrientation("A101");
    }
     
    public String getEmployeeStatus() {
        return employee.getStatus();
    }
}
