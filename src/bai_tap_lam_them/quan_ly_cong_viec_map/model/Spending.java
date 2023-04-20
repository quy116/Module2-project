package bai_tap_lam_them.quan_ly_cong_viec_map.model;

public class Spending {
    private String spendingCode;
    private String spendingName;
    private String spendingDate;
    private String spendingMoney;
    private String spendingComment;

    public Spending() {
    }

    public Spending(String spendingCode, String spendingName, String spendingDate, String spendingMoney, String spendingComment) {
        this.spendingCode = spendingCode;
        this.spendingName = spendingName;
        this.spendingDate = spendingDate;
        this.spendingMoney = spendingMoney;
        this.spendingComment = spendingComment;
    }

    public String getSpendingCode() {
        return spendingCode;
    }

    public void setSpendingCode(String spendingCode) {
        this.spendingCode = spendingCode;
    }

    public String getSpendingName() {
        return spendingName;
    }

    public void setSpendingName(String spendingName) {
        this.spendingName = spendingName;
    }

    public String getSpendingDate() {
        return spendingDate;
    }

    public void setSpendingDate(String spendingDate) {
        this.spendingDate = spendingDate;
    }

    public String getSpendingMoney() {
        return spendingMoney;
    }

    public void setSpendingMoney(String spendingMoney) {
        this.spendingMoney = spendingMoney;
    }

    public String getSpendingComment() {
        return spendingComment;
    }

    public void setSpendingComment(String spendingComment) {
        this.spendingComment = spendingComment;
    }

    @Override
    public String toString() {
        return "Spending{" +
                "spendingCode='" + spendingCode + '\'' +
                ", spendingName='" + spendingName + '\'' +
                ", spendingDate='" + spendingDate + '\'' +
                ", spendingMoney='" + spendingMoney + '\'' +
                ", spendingComment='" + spendingComment + '\'' +
                '}';
    }
}
