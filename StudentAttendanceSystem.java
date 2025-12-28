import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentAttendanceSystem {
    private HashMap<String, ArrayList<Boolean>> attendanceRecords;
    private ArrayList<String> studentList;

    public StudentAttendanceSystem() {
        attendanceRecords = new HashMap<>();
        studentList = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        studentList.add(studentName);
        attendanceRecords.put(studentName, new ArrayList<>());
        System.out.println(studentName + " added successfully.");
    }

    public void markAttendance(String studentName, boolean present) {
        if (!studentList.contains(studentName)) {
            System.out.println("Student " + studentName + " not found.");
            return;
        }
        attendanceRecords.get(studentName).add(present);
        System.out.println("Attendance for " + studentName + " marked as " + (present ? "Present" : "Absent"));
    }

    public void displayAttendance(String studentName) {
        if (!studentList.contains(studentName)) {
            System.out.println("Student " + studentName + " not found.");
            return;
        }

        ArrayList<Boolean> attendance = attendanceRecords.get(studentName);
        if (attendance.isEmpty()) {
            System.out.println("No attendance records found for " + studentName);
            return;
        }

        System.out.println("Attendance record for " + studentName + ":");
        for (int i = 0; i < attendance.size(); i++) {
            System.out.println("Day " + (i + 1) + ": " + (attendance.get(i) ? "Present" : "Absent"));
        }
    }

    public void displayAllAttendance() {
        if (studentList.isEmpty()) {
            System.out.println("No students enrolled yet.");
            return;
        }

        System.out.println("Overall Attendance:");
        for (String studentName : studentList) {
            System.out.print(studentName + ": ");
            ArrayList<Boolean> attendance = attendanceRecords.get(studentName);
            if (attendance.isEmpty()) {
                System.out.println("No records");
                continue;
            }
            for (Boolean present : attendance) {
                System.out.print(present ? "P " : "A ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StudentAttendanceSystem system = new StudentAttendanceSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Attendance System");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Display Attendance (Individual)");
            System.out.println("4. Display All Attendance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String studentName = scanner.nextLine();
                        system.addStudent(studentName);
                        break;
                    case 2:
                        System.out.print("Enter student name: ");
                        String studentToMark = scanner.nextLine();
                        System.out.print("Enter attendance (P/A): ");
                        String attendance = scanner.nextLine().toUpperCase();
                        if (attendance.equals("P") || attendance.equals("A")) {
                            system.markAttendance(studentToMark, attendance.equals("P"));
                        } else {
                            System.out.println("Invalid attendance input. Please enter P or A.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter student name: ");
                        String studentToDisplay = scanner.nextLine();
                        system.displayAttendance(studentToDisplay);
                        break;
                    case 4:
                        system.displayAllAttendance();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
}