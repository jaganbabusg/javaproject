import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static ArrayList<Course> CourseDetails = new ArrayList<>();
	public static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		// Initialize course list and Student list
		CourseDetails.add(new Course("John Doe", "ST100", 12345678, "johndoe@gmail.com",
				"FSDC001", "UI/UX Design", "Completed", 100, true));
		CourseDetails.add(new Course("John Doe", "ST100", 12345678, "johndoe@gmail.com",
				"FSDC002", "Java Programming", "In Progress", 50, false));
		CourseDetails.add(new Course("John Doe", "ST100", 12345678, "johndoe@gmail.com",
				"FSDC003", "Communication Skills", "Not Started", 0, false));
		CourseDetails.add(new Course("Jane Smith", "ST200", 12345678, "janesmith@gmail.com",
				"FSDC001", "UI/UX Design", "Completed", 100, true));
		CourseDetails.add(new Course("Jane Smith", "ST200", 12345678, "janesmith@gmail.com",
				"FSDC002", "Java Programming", "In Progress", 80, false));
		CourseDetails.add(new Course("Jane Smith", "ST200", 12345678, "janesmith@gmail.com",
				"FSDC003", "Communication Skills", "Not Started", 0, false));
		CourseDetails.add(new Course("Alice Johnson", "ST300", 12345678, "alicejohnson@gmail.com",
				"FSDC001", "UI/UX Design", "Completed", 65, false));
		CourseDetails.add(new Course("Alice Johnson", "ST300", 12345678, "alicejohnson@gmail.com",
				"FSDC002", "Java Programming", "In Progress", 30, false));
		CourseDetails.add(new Course("Alice Johnson", "ST300", 12345678, "alicejohnson@gmail.com",
				"FSDC003", "Communication Skills", "Not Started", 0, false));

		while (true) {
			System.out.println("///////////////////////////////////////////////////////////");
			System.out.println("///////////////////////////////////////////////////////////");
			System.out.println("     Welcome to the BELLS.SG Student Management System     ");
			System.out.println("       Student Details & Status of Course Completion       ");
			System.out.println("///////////////////////////////////////////////////////////");
			System.out.println("///////////////////////////////////////////////////////////");
			System.out.println("1. View Student's Status of Course Completion");
			System.out.println("2. Add New Student Record & Status");
			System.out.println("3. Modify Student Record & Status");
			System.out.println("4. Delete Student Record");
			System.out.println("5. Quit");
			System.out.print("Select an option (1-5): ");
			int intSelect = SC.nextInt();
			SC.nextLine();
			if (intSelect == 1) {
				System.out.println("-------------------------------------------------");
				System.out.println("Student & Course Details:");
				for (Course course : CourseDetails) {
					course.displayCourse();
					System.out.println("-------------------------------------------------");
				}
				System.out.print("Press Enter to go to Main Menu...");
				SC.nextLine();
			} else if (intSelect == 2) {
				addCourse();
			} else if (intSelect == 3) {
				modifyCourse();
			} else if (intSelect == 4) {
				deleteCourse();
			} else if (intSelect == 5) {
				System.out.println("Exiting the program. Goodbye!");
				SC.close();
				break;
			} else {
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

	public static void addCourse() {
		String studentName = null, studentID = null, studentEmail = null, courseID = null, courseName = null,
				courseStatus = null;
		int studentMobile = 0, studentAttendance = 0;
		boolean studentCompletion = false;
		while (true) {
			System.out.print("Enter Student Name: ");
			studentName = SC.nextLine();
			if (studentName.isEmpty() || studentName.length() < 3) {
				System.out.println("Invalid name. Please enter a valid name (at least 3 characters).");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Student ID: ");
			studentID = SC.nextLine();
			if (studentID.isEmpty() || studentID.length() != 5
					|| !studentID.toUpperCase().startsWith("ST")) {
				System.out.println("Invalid ID. Please enter a valid ID (Ex. ST001).");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Student Mobile: ");
			studentMobile = SC.nextInt();
			SC.nextLine();
			if (Integer.toString(studentMobile).isEmpty()
					|| Integer.toString(studentMobile).length() != 8) {
				System.out.println(
						"Invalid mobile number. Please enter a valid mobile number (8 digits).");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Student Email: ");
			studentEmail = SC.nextLine();
			if (studentEmail.isEmpty() || !studentEmail.contains("@") || !studentEmail.contains(".")) {
				System.out.println("Invalid email. Please enter a valid email address.");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Course ID: ");
			courseID = SC.nextLine();
			if (courseID.isEmpty() || courseID.length() != 7) {
				System.out.println(
						"Invalid Course ID. Please enter a valid course ID (7 characters).");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Course Name: ");
			courseName = SC.nextLine();
			if (courseName.isEmpty() || courseName.length() < 3) {
				System.out.println(
						"Invalid course name. Please enter a valid course name (at least 3 characters).");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Course Status (Completed/In Progress/Not Started): ");
			courseStatus = SC.nextLine();
			if (courseStatus.isEmpty() || (!courseStatus.equalsIgnoreCase("Completed")
					&& !courseStatus.equalsIgnoreCase("In Progress")
					&& !courseStatus.equalsIgnoreCase("Not Started"))) {
				System.out.println(
						"Invalid course status. Please enter a valid course status (Completed/In Progress/Not Started).");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Student Attendance (0-100): ");
			studentAttendance = SC.nextInt();
			SC.nextLine();
			if (studentAttendance < 0 || studentAttendance > 100) {
				System.out.println(
						"Invalid attendance. Please enter a valid attendance percentage (0-100).");
				continue;
			} else {
				break;
			}
		}
		if (courseStatus.equalsIgnoreCase("Completed") && studentAttendance >= 75) {
			System.out.println("The student completed the course Successfully.");
			studentCompletion = true;
		} else if (courseStatus.equalsIgnoreCase("Completed") && studentAttendance < 75) {
			System.out.println("The student must retake the course.");
			studentCompletion = false;
		} else if (courseStatus.equalsIgnoreCase("Not Started")) {
			System.out.println("The course has not started yet.");
			studentCompletion = false;
		} else if (courseStatus.equalsIgnoreCase("In Progress")) {
			System.out.println("The course is in progress.");
			studentCompletion = false;
		} else {
			studentCompletion = false;
		}

		CourseDetails.add(new Course(studentName, studentID, studentMobile, studentEmail,
				courseID, courseName, courseStatus, studentAttendance, studentCompletion));
		System.out.println("Added successfully.");
		System.out.print("Press Enter to go to Main Menu...");
		SC.nextLine();
	}

	public static void modifyCourse() {
		String studentID = null, courseID = null, courseStatus = null;
		int studentAttendance = 0;
		boolean studentCompletion = false;
		while (true) {
			System.out.print("Enter Student ID to modify: ");
			studentID = SC.nextLine();
			if (studentID.isEmpty() || studentID.length() != 5
					|| !studentID.toUpperCase().startsWith("ST")) {
				System.out.println("Invalid Student ID. Please enter a valid Student ID (Ex. ST001).");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Course ID to modify: ");
			courseID = SC.nextLine();
			if (courseID.isEmpty() || courseID.length() != 7) {
				System.out.println("Invalid Course ID. Please enter a valid Course ID (Ex. FSDC001).");
				continue;
			} else {
				break;
			}
		}
		for (Course course : CourseDetails) {
			if (course.getStudentID().equalsIgnoreCase(studentID)
					&& course.getCourseID().equalsIgnoreCase(courseID)) {
				while (true) {
					System.out.print("Enter Course Status (Completed/In Progress/Not Started): ");
					courseStatus = SC.nextLine();
					if (courseStatus.isEmpty() || (!courseStatus.equalsIgnoreCase("Completed")
							&& !courseStatus.equalsIgnoreCase("In Progress")
							&& !courseStatus.equalsIgnoreCase("Not Started"))) {
						System.out.println(
								"Invalid course status. Please enter a valid course status (Completed/In Progress/Not Started).");
						continue;
					} else {
						break;
					}
				}
				while (true) {
					System.out.print("Enter Student Attendance (0-100): ");
					studentAttendance = SC.nextInt();
					SC.nextLine();
					if (studentAttendance < 0 || studentAttendance > 100) {
						System.out.println(
								"Invalid attendance. Please enter a valid attendance percentage (0-100).");
						continue;
					} else {
						break;
					}
				}
				if (courseStatus.equalsIgnoreCase("Completed") && studentAttendance >= 75) {
					System.out.print("The student completed the course Successfully.");
					studentCompletion = true;
				} else if (courseStatus.equalsIgnoreCase("Completed") && studentAttendance < 75) {
					System.out.print("The student must retake the course.");
					studentCompletion = false;
				} else if (courseStatus.equalsIgnoreCase("Not Started")) {
					System.out.print("The course has not started yet.");
					studentCompletion = false;
				} else if (courseStatus.equalsIgnoreCase("In Progress")) {
					System.out.print("The course is in progress.");
					studentCompletion = false;
				} else {
					studentCompletion = false;
				}
				SC.nextLine();
				course.setCourseStatus(courseStatus);
				course.setStudentAttendance(studentAttendance);
				course.setStudentCompletion(studentCompletion);
				System.out.println("-------------------------------------------------");
				System.out.println("Modified Course Details:");
				System.out.println(course.toString());
				System.out.println("-------------------------------------------------");
				System.out.println("Modified successfully.");
				System.out.print("Press Enter to go to Main Menu...");
				SC.nextLine();
				return;
			}
		}
		System.out.println("Student ID not found.");
		System.out.print("Press Enter to go to Main Menu...");
		SC.nextLine();
	}

	public static void deleteCourse() {
		String studentID = null, courseID = null;
		while (true) {
			System.out.print("Enter Student ID to delete: ");
			studentID = SC.nextLine();
			if (studentID.isEmpty() || studentID.length() != 5
					|| !studentID.toUpperCase().startsWith("ST")) {
				System.out.println("Invalid ID. Please enter a valid ID (Ex. ST001).");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("Enter Course ID to delete: ");
			courseID = SC.nextLine();
			if (courseID.isEmpty() || courseID.length() != 7) {
				System.out.println("Invalid Course ID. Please enter a valid Course ID (Ex. FSDC001).");
				continue;
			} else {
				break;
			}
		}
		for (int i = 0; i < CourseDetails.size(); i++) {
			if (CourseDetails.get(i).getStudentID().equalsIgnoreCase(studentID)) {
				CourseDetails.remove(i);
				System.out.println("Deleted successfully.");
				System.out.print("Press Enter to go to Main Menu...");
				SC.nextLine();
				return;
			}
		}
		System.out.println("Student ID not found.");
		System.out.print("Press Enter to go to Main Menu...");
		SC.nextLine();
	}
}
