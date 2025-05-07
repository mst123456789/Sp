import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String department;
    int age;

    public Student(int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department + ", Age: " + age);
    }
}

public class StudentSearch {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", "Computer Science", 20));
        students.add(new Student(102, "Bob", "Mechanical", 22));
        students.add(new Student(103, "Charlie", "Electrical", 21));
        students.add(new Student(104, "David", "Civil", 23));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID to search: ");
        int searchId = scanner.nextInt();
        scanner.close();

        boolean found = false;
        for (Student student : students) {
            if (student.id == searchId) {
                System.out.println("Student Found:");
                student.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + searchId + " not found.");
        }
    }
}
