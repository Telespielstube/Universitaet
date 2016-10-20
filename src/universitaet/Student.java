package universitaet;
import java.util.*;
/**
 *
 * @author marta
 */
public class Student extends Person {
    
    Subject subject;
    
    private final int matriculationNumber;
    private String seminarGroup;
    private Subject firstSubject;
    private Subject secondSubject;
    private Subject thirdSubject;
    private Subject fourthSubject; 
    
    Student(String familyName, String firstName, int day, int month, int year, int matriculationNumber, String seminarGroup, Subject firstSubject, Subject secondSubject, Subject thirdSubject, Subject fourthSubject) {
        super(familyName, firstName, day, month, year);        
        this.matriculationNumber = matriculationNumber;
        this.seminarGroup = seminarGroup;
        this.firstSubject = firstSubject;
        this.secondSubject = secondSubject;
        this.thirdSubject = thirdSubject;
        this.fourthSubject = fourthSubject;
    }
    
    /** Returns the matriculation number.
     *
     * @return unique id number for students   
     */
    public int getMatriculationNumber() {
        return matriculationNumber;
    }
    
    /** Returns the seminar group.
     *
     * @return Name of seminar group the student is in.   
     */
    public String getSeminarGroup() {
        return seminarGroup;
    }
    
    /** Returns the first subject.
     *
     * @return Name of the first subject.
     */
    public Subject getFirstSubject() {
        return firstSubject;
    }
    
    /** Returns the second subject.
     *
     * @return Name of the second subject.
     */
    public Subject getSecondSubject() {
        return secondSubject;
    }
    
    /** Returns the third subject.
     *
     * @return Name of the third subject.
     */
    public Subject getThirdSubject() {
        return thirdSubject;
    }
    
    /** Returns the fourth subject.
     *
     * @return Name of the fourth subject.
     */
    public Subject getFourthSubject() {
        return fourthSubject;
    }
    
    @Override
    public String toString() {
        String returnValue = "\n" + familyName + "\t" + firstName + "\t" + day + "." + month + "." + year + "\t" + matriculationNumber + " " + seminarGroup;
        if (firstSubject == null) {
            returnValue += "\n\t" + firstSubject;
        }  
        if (secondSubject != null) {
            returnValue += "\n\t" +  secondSubject;
        }
        if (thirdSubject != null) {
            returnValue += "\n\t" + thirdSubject;
        }
        if (fourthSubject != null) {
            returnValue += "\n\t" + fourthSubject;
        }
        return returnValue;     
    }
    
}
