package ss6;

public class Bai3 {
    static class Product {
        private String maSP;
        private String tenSP;
        private double giaBan;

        public Product(String maSP, String tenSP, double giaBan) {
            this.maSP = maSP;
            this.tenSP = tenSP;
            setGiaBan(giaBan);
        }

        public String getMaSP() {
            return maSP;
        }

        public String getTenSP() {
            return tenSP;
        }

        public double getGiaBan() {
            return giaBan;
        }

        public void setGiaBan(double giaBan) {
            if (giaBan > 0) {
                this.giaBan = giaBan;
            } else {
                System.out.println("Giá bán không hợp lệ!");
            }
        }

        public void hienThiThongTin() {
            System.out.println("Mã SP: " + maSP);
            System.out.println("Tên SP: " + tenSP);
            System.out.println("Giá bán: " + giaBan);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Product p = new Product("SP01", "Laptop", 15000000);

        p.hienThiThongTin();

        p.setGiaBan(-5000);

        p.hienThiThongTin();

        p.setGiaBan(18000000);

        p.hienThiThongTin();
    }
}
