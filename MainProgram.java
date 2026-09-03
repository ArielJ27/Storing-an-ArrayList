import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(10, "Ariel", "Dorm A"));
        students.add(new Student(3, "Marcus", "Dorm B"));
        students.add(new Student(7, "Bella", "Dorm C"));
        students.add(new Student(1, "Zane", "Dorm D"));
        students.add(new Student(5, "Chloe", "Dorm E"));
        students.add(new Student(2, "Evan", "Dorm F"));
        students.add(new Student(9, "Liam", "Dorm G"));
        students.add(new Student(4, "Nora", "Dorm H"));
        students.add(new Student(6, "Olivia", "Dorm I"));
        students.add(new Student(8, "Sophia", "Dorm J"));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name
        SelectionSort.selectionSort(students, new CompareByName());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by roll number
        SelectionSort.selectionSort(students, new CompareByRollno());
        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
