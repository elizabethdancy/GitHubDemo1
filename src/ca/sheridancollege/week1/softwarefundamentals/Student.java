
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * This class models students
 * @author Liz Dancy, May 2021
 */
public class Student 
{
    private String name;
    private String studentID;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String givenName, String givenID)
    {
        name = givenName;
        studentID = givenID;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
