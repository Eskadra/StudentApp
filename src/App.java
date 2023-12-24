import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        StudentSteam studentStream = new StudentSteam(1);

        // Создание объектов Student
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        // Создание группы студентов
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        StudentGroup group1 = new StudentGroup(students, 1);

        // Создание другой группы студентов
        List<Student> students2 = new ArrayList<>();
        students2.add(s4);
        students2.add(s5);

        StudentGroup group2 = new StudentGroup(students2, 2);

        // Создание третьей группы студентов
        List<Student> students3 = new ArrayList<>();
        students3.add(s5);
        students3.add(s6);
        students3.add(s1);
        students3.add(s2);

        StudentGroup group3 = new StudentGroup(students3, 3);

        // Создание списка групп студентов
        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        System.out.println(groups);

        // Сортировка списка групп студентов по количеству студентов в группе
        Collections.sort(groups);

        // Вывод групп студентов в консоль
        for (StudentGroup group : groups) {
            System.out.println("Группа " + group.getIdGroup() + ": " + group.getGroup().size() + " студент(а)");
        }
        
        System.out.println("=========================================================");

        studentStream.addStudentGroup(group1);
        studentStream.addStudentGroup(group2);
        studentStream.addStudentGroup(group3);

        for (StudentGroup group : studentStream) {
            System.out.println("Group: " + group.getIdGroup());
            System.out.println("Students: " + group.getGroup());
            System.out.println();
        }
    }
}