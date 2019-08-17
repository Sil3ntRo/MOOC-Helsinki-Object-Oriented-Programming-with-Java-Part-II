/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Rohan
 */
import java.util.ArrayList;
import java.util.List;

public class AtLeastOne implements Criterion {
    private Criterion[] criterias;
    
    public AtLeastOne(Criterion... criterion) {
        this.criterias = criterion;
    }
    
    @Override
    public boolean complies(String line) {
        for(Criterion criterion : criterias) {
            if(criterion.complies(line)) {
                return true;
            }
        }
        return false;
    }
}
