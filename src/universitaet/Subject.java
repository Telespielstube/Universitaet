/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitaet;

/**
 *
 * @author marta
 */
public class Subject {
    
    Student student;
    private int semester;
    private String name;
    private String subjectOfStudy;
    
    Subject() {}
    
    Subject(int semester, String name, String subjectOfStudy) {
        if (semester < 1 || semester > 6) {
            throw new IllegalArgumentException("Semester should be in the range of 1 to 6.");
        }
        this.semester = semester;
        this.name = name;
        this.subjectOfStudy = subjectOfStudy;
    }
    
    /** Returns the semester.
     *
     * @return 
     */
    public int getSemester() {
        return semester;
    }
    
    /** Returns the name of the course.
     *
     * @return Course name 
     */
    public String getName() {
        return name;
    }
    
    /** Returns the study program
     *
     * @return Name of the study program
     */
    public String getSubjectOfStudy() {
        return subjectOfStudy;
    }
    
    /** Sets the semester
     *
     * @param semester the new semester
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    /** Sets the name of the new course
     *
     * @param Name of the new course.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /** Sets the new subject of study.
     *
     * @param Name of the new subject of study.
     */
    public void setSubject(String subjectOfStudy) {
        this.subjectOfStudy = subjectOfStudy;
    }
    
    @Override
    public String toString() {
        return semester + " " + name + ", " + subjectOfStudy;
    } 

}
