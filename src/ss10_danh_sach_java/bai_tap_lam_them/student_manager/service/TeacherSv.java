package ss10_danh_sach_java.bai_tap_lam_them.student_manager.service;

import ss10_danh_sach_java.bai_tap_lam_them.student_manager.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherSv implements ITeacherSv {
        List<Teacher> teacherList = new ArrayList<>();


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
        Teacher teacher = new Teacher(id,name,date,sex,chuyenMon);
        teacherList.add(teacher);
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {

    }
}
