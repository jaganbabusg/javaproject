public abstract class Student {

    protected String StudentName;
    protected String StudentID;
    protected int StudentMobile;
    protected String StudentEmail;

    public Student() {
        // Default constructor
    }

    public Student(String studentName, String studentID, int studentMobile, String studentEmail) {
        setStudentName(studentName);
        setStudentID(studentID);
        setStudentMobile(studentMobile);
        setStudentEmail(studentEmail);
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public int getStudentMobile() {
        return StudentMobile;
    }

    public void setStudentMobile(int studentMobile) {
        StudentMobile = studentMobile;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student-Name = " + getStudentName() + ", Student-ID = " + getStudentID() + ", Student-Mobile = "
                + getStudentMobile()
                + ", Student-Email = " + getStudentEmail();
    }

    public void displayStudent() {
        System.out.println("Student-Name = " + getStudentName() + ", Student-ID = " + getStudentID()
                + ", Student-Mobile = " + getStudentMobile()
                + ", Student-Email = " + getStudentEmail());
    }
}