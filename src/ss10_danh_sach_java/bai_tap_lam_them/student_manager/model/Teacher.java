package ss10_danh_sach_java.bai_tap_lam_them.student_manager.model;

public class Teacher extends Person{
    private String chuyenMon;

    public Teacher(String id, String name, String date, String sex, String chuyenMon) {
        super(id, name, date, sex);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "chuyenMon='" + chuyenMon + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
