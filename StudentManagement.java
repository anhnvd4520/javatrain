import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students;
    public StudentManagement() {
        students = new ArrayList<>();
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Trả về null nếu không tìm thấy sinh viên với id tương ứng
    }
//
//    public void addStudent(Student student) {
//        students.add(student);
//        System.out.println("Student added successfully.");
//    }

    public void editStudent(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter new address: ");
            String address = scanner.nextLine();
            System.out.print("Enter new GPA: ");
            double gpa = scanner.nextDouble();

            student.setName(name);
            student.setAge(age);
            student.setAddress(address);
            student.setGpa(gpa);

            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void sortStudentsByGpa() {
        Collections.sort(students, Comparator.comparingDouble(Student::getGpa));
        System.out.println("Students sorted by GPA.");
    }

    public void sortStudentsByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name.");
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of students:");
            for (Student student : students) {
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Address: " + student.getAddress());
                System.out.println("GPA: " + student.getGpa());
                System.out.println("-------------------------");
            }
        }
    }
}

