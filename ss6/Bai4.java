package ss6;

public class Bai4 {
    static class Employee {
        String maNV;
        String tenNV;
        double luong;

        public Employee() {
            this.maNV = "Chưa có";
            this.tenNV = "Chưa có";
            this.luong = 0;
        }

        public Employee(String maNV, String tenNV) {
            this.maNV = maNV;
            this.tenNV = tenNV;
            this.luong = 0;
        }

        public Employee(String maNV, String tenNV, double luong) {
            this.maNV = maNV;
            this.tenNV = tenNV;
            this.luong = luong;
        }

        public void hienThiThongTin() {
            System.out.println("Mã NV: " + maNV);
            System.out.println("Tên NV: " + tenNV);
            System.out.println("Lương: " + luong);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Nguyễn Văn A");
        Employee e3 = new Employee("NV02", "Trần Thị B", 15000000);

        e1.hienThiThongTin();
        e2.hienThiThongTin();
        e3.hienThiThongTin();
    }
}
