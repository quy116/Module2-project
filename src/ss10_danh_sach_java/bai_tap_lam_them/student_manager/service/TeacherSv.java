package ss10_danh_sach_java.bai_tap_lam_them.student_manager.service;

import ss10_danh_sach_java.bai_tap_lam_them.student_manager.model.Teacher;

import java.util.Scanner;
import java.util.Stack;

public class TeacherSv implements ITeacherSv {
    Scanner sc = new Scanner(System.in);
    Stack<Teacher> teacherList = new Stack<>();


    //    public Teacher(String id, String name, String date, String sex, String chuyenMon) {
//        super(id, name, date, sex);
//        this.chuyenMon = chuyenMon;
//    }


    @Override
    public void addTeacher() {
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
        String chuyenMon = sc.nextLine();
        Teacher teacher = new Teacher(id, name, date, sex, chuyenMon);
        teacherList.push(teacher);
    }

    public void deleteTecher() {
        System.out.println("nhập ID");
        int input = sc.nextInt();
        for (int i = 0; i < teacherList.size(); i++) {
            if (input == i + 1) {
                teacherList.remove(i);
            }
        }

    }

    @Override
    public void editTeacher() {
        System.out.println("nhập ID đối tượng muốn thay đổi");
        int input = sc.nextInt();
        for (int i = 0; i < teacherList.size(); i++) {
            if (input == i + 1) {
                System.out.println("nhap ID");
                String id = sc.nextLine();
                System.out.println("nhap name");
                String name = sc.nextLine();
                System.out.println("nhap ngay thang nam sinh :");
                String date = sc.nextLine();
                System.out.println("nhap gioi tinh");
                String sex = sc.nextLine();
                System.out.println("nhap chuyen mon :");
                String chuyenMon = sc.nextLine();
                Teacher iedtteacher = new Teacher(id, name, date, sex, chuyenMon);
                teacherList.set(i, iedtteacher);
            }
        }
    }

    @Override
    public void displayTecher() {
        for (Teacher t : teacherList) {
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "TeacherSv{" +
                "teacherList=" + teacherList +
                '}';
    }


}
