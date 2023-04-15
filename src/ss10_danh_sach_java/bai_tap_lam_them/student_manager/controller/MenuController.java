package ss10_danh_sach_java.bai_tap_lam_them.student_manager.controller;

import ss10_danh_sach_java.bai_tap_lam_them.student_manager.service.StudentSv;
import ss10_danh_sach_java.bai_tap_lam_them.student_manager.service.TeacherSv;

import java.util.Scanner;

public class MenuController {
    static Scanner sc = new Scanner(System.in);
    static TeacherSv teacherSv = new TeacherSv();
    static StudentSv studentSv = new StudentSv();

    public static void diplayMenu() {
        boolean flag = true;
        do {
            System.out.println("mời chọn chức năng\n" +
                    "1. Student manager \n" +
                    "2. Techer manager \n" +
                    "3. exit");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                studentManager();
                    break;
                case 2:
                    techerManager();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("chọn chứ k đúng");
            }
        } while (flag);
    }

    public static void techerManager() {
        teacherSv.displayTecher();
        boolean flag = true;
        do {
            System.out.println("nhập chức năng\n" +
                    "1. thêm học viên\n" +
                    "2. sửa thông tin giáo viên \n" +
                    "3. xoá học viên\n" +
                    "4. hiển thị tt giáo viên\n" +
                    "5. exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    teacherSv.addTeacher();
                    break;
                case 2:
                    teacherSv.editTeacher();
                    break;
                case 3:
                    teacherSv.deleteTecher();
                    break;
                case 4:
                    teacherSv.displayTecher();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("chọn chứ k đúng");
            }
        } while (flag);
    }
    public static void studentManager() {
        studentSv.display();
        boolean flag = true;
        do {
            System.out.println("nhập chức năng\n" +
                    "1. thêm học viên\n" +
                    "2. sửa thông tin học viên \n" +
                    "3. xoá giáo viên\n" +
                    "4. hiển thị tt học viên\n" +
                    "5. exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    studentSv.addStudent();
                    break;
                case 2:
                    studentSv.edit();
                    break;
                case 3:
                    studentSv.delete();
                    break;
                case 4:
                    studentSv.display();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("chọn chứ k đúng");
            }
        } while (flag);
    }
}


