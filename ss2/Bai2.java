package ss2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma : ");
        char code = sc.next().charAt(0);
        switch (code){
            case 'A':
                System.out.println("tang 1- sach van hoc");
                break;
            case 'B':
                System.out.println("tang 2- sach khoa hoc");
                break;
            case 'C':
                System.out.println("tang 3- sach ngoai ngu");
                break;
            case 'D':
                System.out.println("tang 4- sach tin hoc");
                break;
            default:
                System.out.println("ma khong hop le");
        }
    }
}
