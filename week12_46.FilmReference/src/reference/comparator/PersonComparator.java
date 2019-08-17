/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;



/**
 *
 * @author Rohan
 */

import reference.domain.Person;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class PersonComparator implements Comparator<Person> {
    private Map<Person, Integer> people;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.people = peopleIdentities;
    }
    
    @Override
    public int compare(Person o1, Person o2) {
        if(people.get(o1) == people.get(o2)) {
            return 0;
        }
        else if(people.get(o1) > people.get(o2)) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
