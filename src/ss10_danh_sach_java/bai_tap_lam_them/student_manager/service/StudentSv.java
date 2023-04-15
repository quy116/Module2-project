package ss10_danh_sach_java.bai_tap_lam_them.student_manager.service;

import ss10_danh_sach_java.bai_tap_lam_them.student_manager.model.Student;
import ss10_danh_sach_java.bai_tap_lam_them.student_manager.model.Teacher;

import java.util.Scanner;
import java.util.Stack;

public class StudentSv implements IStudentSv {
    Stack<String> studentList = new Stack<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ID");
        String id = sc.nextLine();
        System.out.println("nhap name");
        String name = sc.nextLine();
        System.out.println("nhap ngay thang nam sinh :");
        String date = sc.nextLine();
        System.out.println("nhap gioi tinh");
        String sex = sc.nextLine();
        System.out.println("nhap chuyen mon :");
        String point  = sc.nextLine();
        Student student = new Student(id,name,date,sex,point);
        studentList.push(String.valueOf(student));
    }

    @Override
    public void delete() {
        System.out.println("nhập ID");
        int input = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (input == i + 1) {
                studentList.remove(i);
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("nhập ID đối tượng muốn thay đổi");
        int input = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (input == i + 1) {
                System.out.println("nhap ID");
                String id = sc.nextLine();
                System.out.println("nhap name");
                String name = sc.nextLine();
                System.out.println("nhap ngay thang nam sinh :");
                String date = sc.nextLine();
                System.out.println("nhap gioi tinh");
                String sex = sc.nextLine();
                System.out.println("nhap diem :");
                String point = sc.nextLine();
                Student edit = new Student(id, name, date, sex, point);
                studentList.set(i, String.valueOf(edit));
            }
        }
    }

    @Override
    public void display() {
        for (String s : studentList) {
            System.out.println(s);
        }
    }
}
