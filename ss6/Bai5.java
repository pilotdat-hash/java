package ss6;

public class Bai5 {
    static class Book {
        String maSach;
        String tenSach;
        String tacGia;
        double gia;

        public Book(String maSach, String tenSach, String tacGia, double gia) {
            this.maSach = maSach;
            this.tenSach = tenSach;
            this.tacGia = tacGia;
            this.gia = gia;
        }

        public void hienThiThongTin() {
            System.out.println("Mã sách: " + maSach);
            System.out.println("Tên sách: " + tenSach);
            System.out.println("Tác giả: " + tacGia);
            System.out.println("Giá: " + gia);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("B01", "Java Cơ Bản", "Nguyễn Văn A", 95000);
        Book b2 = new Book("B02", "OOP Nâng Cao", "Trần Thị B", 120000);

        b1.hienThiThongTin();
        b2.hienThiThongTin();
    }
}
