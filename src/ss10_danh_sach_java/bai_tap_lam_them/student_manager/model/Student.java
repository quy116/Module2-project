package ss10_danh_sach_java.bai_tap_lam_them.student_manager.model;

public class Student extends Person{
    private String point;

    public Student(String id, String name, String date, String sex, String point) {
        super(id, name, date, sex);
        this.point = point;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point='" + point + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
