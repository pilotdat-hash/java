package ss2;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("nhap tuoi : ");
        int age = sc.nextInt();
        System.out.println("so sach dang muon: ");
        int books = sc.nextInt();

        if (age >= 18 && books <3){
            System.out.println("cho phep muon sach");
        }else if(age < 18){
            System.out.println("ban chua du tuoi");
        } else if (books>=3) {
            System.out.println("so sach muon dat gioi han");
        }
    }
}
