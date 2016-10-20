/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitaet;

import java.util.List;

/**
 *
 * @author marta
 */
public interface Filter {
    
    /** 
     *
     * @param searchFor     String to search for in the students list.     
     * @return              Filtered list of students and the subjects. 
     */
    public abstract List<Student> filterBySubject(String searchFor);
}
