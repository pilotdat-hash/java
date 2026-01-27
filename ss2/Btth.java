package ss2;

import java.util.Scanner;

public class Btth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập số lượng sách trả: ");
        int soSach = sc.nextInt();

        int tongTienPhat = 0;

        for (int i = 1; i <= soSach; i++) {
            System.out.print("Nhập số ngày quá hạn của sách " + i + ": ");
            int ngayTre = sc.nextInt();

            if (ngayTre > 0 && ngayTre <= 5) {
                tongTienPhat += ngayTre * 2000;
            } else if (ngayTre > 5) {
                tongTienPhat += 5 * 2000 + (ngayTre - 5) * 5000;
            }
        }

        System.out.println("Tổng tiền phạt: " + tongTienPhat + " VNĐ");


        System.out.print("\nNhập tuổi: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhập số sách đã mượn trong tháng: ");
        int soSachMuon = sc.nextInt();

        System.out.print("Có thẻ sinh viên ưu tiên không? (1: Có, 0: Không): ");
        int theUuTien = sc.nextInt();

        boolean duDieuKienVIP = (tuoi >= 18 && soSachMuon >= 10) || theUuTien == 1;

        System.out.println(
                duDieuKienVIP
                        ? "Đủ tiêu chuẩn nâng cấp VIP"
                        : "Chưa đủ tiêu chuẩn"
        );


        int tongSachHopLe = 0;
        int maSach;

        System.out.println("\nNhập mã sách (0 để kết thúc):");

        do {
            System.out.print("Nhập mã sách: ");
            maSach = sc.nextInt();

            if (maSach < 0) {
                System.out.println("Mã sách không hợp lệ, nhập lại!");
                continue;
            }

            if (maSach == 0) {
                break;
            }

            tongSachHopLe++;

        } while (true);

        System.out.println("Tổng số sách hợp lệ đã nhập: " + tongSachHopLe);

        sc.close();
    }
}
