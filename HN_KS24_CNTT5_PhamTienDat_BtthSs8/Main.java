package HN_KS24_CNTT5_PhamTienDat_BtthSs8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] ds = null;
        int n=0;
        int choice;

        do{
            System.out.println("---------quan ly sinh vien----------");
            System.out.println("1.nhap danh sach sinh vien");
            System.out.println("2.hien thi danh sach sinh vien");
            System.out.println("3.tim kiem sinh vien theo hoc luc");
            System.out.println("4.sap xep hoc luc giam dan");
            System.out.println("5.thoat");
            System.out.println("nhap lua chon cua ban : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("so luong sv muon them: ");
                    n = sc.nextInt();
                    sc.nextLine();

                    ds = new Student[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("sinh vien thu " + (i + 1));

                        String id;
                        while (true) {
                            System.out.print("ma sv (SVxxx): ");
                            id = sc.nextLine();

                            if (id.length() == 5 && id.startsWith("SV")) {
                                boolean hopLe = true;
                                for (int j = 2; j < 5; j++) {
                                    if (!Character.isDigit(id.charAt(j))) {
                                        hopLe = false;
                                        break;
                                    }
                                }
                                if (hopLe) break;
                            }
                            System.out.println("sai ding dang msv");
                        }

                        String name;
                        while (true) {
                            System.out.print("ten: ");
                            name = sc.nextLine();

                            if (!name.trim().isEmpty()) {
                                break;
                            }
                            System.out.println("ten khong duoc bo trong");
                        }

                        double score;
                        while (true) {
                            System.out.print("diem trung binh (0-10): ");
                            score = sc.nextDouble();
                            sc.nextLine();

                            if (score >= 0 && score <= 10) {
                                break;
                            }
                            System.out.println("diem phai tu 0-10");
                        }

                        ds[i] = new Student(id, name, score);
                    }
                    break;
                case 2:
                    if (ds == null) {
                        System.out.println("danh sach sinh vien trong");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.println(ds[i]);
                        }
                    }
                    break;
                case 3:
                    if (ds == null) {
                        System.out.println("danh sach trong");
                    } else {
                        System.out.print("nhap hoc luc can tim: ");
                        String rank = sc.nextLine();

                        for (int i = 0; i < n; i++) {
                            if (ds[i].getRank().equalsIgnoreCase(rank)) {
                                System.out.println(ds[i]);
                            }
                        }
                    }
                    break;
                case 4:
                    if (ds != null) {
                        for (int i = 0; i < n - 1; i++) {
                            for (int j = i + 1; j < n; j++) {
                                if (ds[i].getScore() < ds[j].getScore()) {
                                    Student temp = ds[i];
                                    ds[i] = ds[j];
                                    ds[j] = temp;
                                }
                            }
                        }
                        System.out.println("da sap xep xong!");
                    }
                    break;
                case 5:
                    System.out.println("thoat chuong trinh");
                    break;
                default:
                    System.out.println("lua chon khong hop le");
                    break;
            }
        }while(choice!=5);
    }
}
