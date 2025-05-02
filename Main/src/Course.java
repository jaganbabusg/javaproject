public class Course extends Student {
    protected String CourseID;
    protected String CourseName;
    protected String CourseStatus; // Completed, In Progress, Not Started
    protected double StudentAttendance; // 0-100%
    protected boolean StudentCompletion; // (if course is completed and attendance is more than 75% then passed)

    public Course() {
        // Default constructor
    }

    public Course(String studentName, String studentID, int studentMobile, String studentEmail, String courseID,
            String courseName, String courseStatus, int studentAttendance, boolean studentCompletion) {
        super(studentName, studentID, studentMobile, studentEmail);
        setCourseID(courseID);
        setCourseName(courseName);
        setCourseStatus(courseStatus);
        setStudentAttendance(studentAttendance);
        setStudentCompletion(studentCompletion);
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseStatus() {
        return CourseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        CourseStatus = courseStatus;
    }

    public double getStudentAttendance() {
        return StudentAttendance;
    }

    public void setStudentAttendance(double studentAttendance) {
        StudentAttendance = studentAttendance;
    }

    public boolean isStudentCompletion() {
        return StudentCompletion;
    }

    public void setStudentCompletion(boolean studentCompletion) {
        StudentCompletion = studentCompletion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Course-ID = " + getCourseID() + ", Course-Name = " + getCourseName() + ", Course-Status = "
                + getCourseStatus() + ", Student-Attendance = " + getStudentAttendance() + ", Student-Completion = "
                + (isStudentCompletion() ? "YES" : "NO");
    }

    public void displayCourse() {
        System.out.println(super.toString() + ", Course-ID = " + getCourseID() + ", Course-Name = " + getCourseName() + ", Course-Status = "
        + getCourseStatus() + ", Student-Attendance = " + getStudentAttendance() + ", Student-Completion = " + (isStudentCompletion() ? "YES" : "NO"));
    }
}
