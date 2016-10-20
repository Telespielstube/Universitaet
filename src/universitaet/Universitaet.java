package universitaet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marta
 */
public class Universitaet implements Filter {

    static List<Student> studentList = new ArrayList<>();
    
    /** 
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Universitaet universitaet = new Universitaet();
        Person person = new Person();
    
        Student student1 = new Student("Bell", "Peter", 12, 7, 1990, 123456, "Seminar1", new Subject(2, "Programming", "Computer Science"), new Subject(2, "Mathematics", "Computer Science"), new Subject(2, "Operating Systems", "Computer Science"), null);
        Student student2 = new Student("Smith", "Chris", 23, 4, 1996, 45678, "Seminar2", new Subject(2, "English", "Design"), new Subject(2, "Web Design", "Design"), null, null);
        Student student3 = new Student("Meyer", "Simon", 2, 8, 1992, 34567, "Seminar3", new Subject(3, "English", "Business"), new Subject(5, "Project", "Business"), new Subject(3, "Museumskunde", "Business"), new Subject(3, "Mathematics", "Business"));
              
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        
        System.out.println("List of all students");
        System.out.println("--------------------");
        String listOutput = studentList.toString();
        System.out.println(listOutput); 
        System.out.println("\nFiltered list by subject"); 
        System.out.println("------------------------");
        List<Student> studentListBySubject = universitaet.filterBySubject("Programming");
        System.out.println(studentListBySubject);
    }
    
    /** Filters the students by their subjects.
     *
     * @param searchFor     String to search for in the students list.       
     * @return              Filtered list of students and the subjects. 
     */
    @Override
    public List<Student> filterBySubject(String searchFor) {     
        List<Student> studentListBySubject = new ArrayList<>();
        Subject subject;
        
        for (int i = 0; i < studentList.size(); i++) {
            Student currentStudent = studentList.get(i);
            
            if (currentStudent.getFirstSubject().getName().equals(searchFor)) {
                studentListBySubject.add(currentStudent);
            }
        }
        return studentListBySubject;
    }
}
