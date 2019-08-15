/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Rohan
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    private List<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        employees.add(person);
    }
    
    public void add(List<Person> persons) {
        for(Person p : persons) {
            employees.add(p);
        }
    }
    
    public void print() {
        for(Person p : employees) {
            System.out.println(p);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> emp = employees.iterator();
        
        while(emp.hasNext()) {
            Person nextEmp = emp.next();
            
            if(nextEmp.getEducation() == education) {
                System.out.println(nextEmp);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> emp = employees.iterator();
        
        while(emp.hasNext()) {
            Person nextEmp = emp.next();
            
            if(nextEmp.getEducation() == education) {
                emp.remove();
            }
        }
    }
}
