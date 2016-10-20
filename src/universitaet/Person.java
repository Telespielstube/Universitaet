package universitaet;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marta
 */
public class Person {

    protected String familyName;
    protected String firstName;
    protected int day;
    protected int month;
    protected int year;
    
    Person() {}
    
    Person(String familyName, String firstName) {
        this.familyName = familyName;
        this.firstName = firstName;
    }
    
    Person(String familyName, String firstName, int day, int month, int year) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    /** Returns the family name. 
     *
     * @return family name of the student
     */
    public String getFamilyName() {
        return familyName;
    }
    
    /** Returns first name.
     *
     * @return first name of the student.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /** Returns day of birth of the student.
     *
     * @return day of birth of the student.
     */
    public int getDay() {
        return day;
    }
    
    /** Returns month of birth of the student.
     *
     * @return month of birth of the student.
     */
    public int getMonth() {
        return month;
    }
    
    /** Returns year of birth of the student.
     *
     * @return year of birth of the student.
     */
    public int getYear() {
        return year;
    }
}
