/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author athanas1
 */
public class Manager extends Employee {
private Employee employee;

 public void OrientNewEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee();
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        e.NewEmployee("A101");
        employee = e;
    }
    
    public String getEmployeeStatus() {
        return employee.getStatus();
    }
    
    
     
}
