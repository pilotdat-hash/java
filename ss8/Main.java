package ss8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(100);
        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Cập nhật");
            System.out.println("5. Xóa");
            System.out.println("6. Sắp xếp theo điểm TB");
            System.out.println("7. Thống kê");
            System.out.println("8. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Mã SV: ");
                    String id = sc.nextLine();

                    System.out.print("Họ tên: ");
                    String name = sc.nextLine();

                    int age;
                    do {
                        System.out.print("Tuổi (18-30): ");
                        age = sc.nextInt();
                    } while (age < 18 || age > 30);
                    sc.nextLine();

                    System.out.print("Giới tính: ");
                    String gender = sc.nextLine();

                    double math, physics, chemistry;
                    do {
                        System.out.print("Điểm Toán: ");
                        math = sc.nextDouble();
                    } while (math < 0 || math > 10);

                    do {
                        System.out.print("Điểm Lý: ");
                        physics = sc.nextDouble();
                    } while (physics < 0 || physics > 10);

                    do {
                        System.out.print("Điểm Hóa: ");
                        chemistry = sc.nextDouble();
                    } while (chemistry < 0 || chemistry > 10);
                    sc.nextLine();

                    if (manager.addStudent(
                            new Student(id, name, age, gender, math, physics, chemistry)))
                        System.out.println("Thêm thành công!");
                    else
                        System.out.println("Mã SV đã tồn tại!");

                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Nhập mã hoặc tên SV: ");
                    String key = sc.nextLine();
                    Student s = manager.findById(key);
                    if (s != null)
                        s.display();
                    else
                        manager.searchByName(key);
                    break;

                case 4:
                    System.out.print("Nhập mã SV cần cập nhật: ");
                    String uid = sc.nextLine();

                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();

                    int newAge;
                    do {
                        System.out.print("Tuổi mới (18-30): ");
                        newAge = sc.nextInt();
                    } while (newAge < 18 || newAge > 30);

                    double nm, np, nc;
                    do {
                        System.out.print("Toán mới: ");
                        nm = sc.nextDouble();
                    } while (nm < 0 || nm > 10);

                    do {
                        System.out.print("Lý mới: ");
                        np = sc.nextDouble();
                    } while (np < 0 || np > 10);

                    do {
                        System.out.print("Hóa mới: ");
                        nc = sc.nextDouble();
                    } while (nc < 0 || nc > 10);
                    sc.nextLine();

                    if (manager.updateStudent(uid, newName, newAge, nm, np, nc))
                        System.out.println("Cập nhật thành công!");
                    else
                        System.out.println("Không tìm thấy sinh viên!");
                    break;

                case 5:
                    System.out.print("Nhập mã SV cần xóa: ");
                    if (manager.deleteById(sc.nextLine()))
                        System.out.println("Xóa thành công!");
                    else
                        System.out.println("Không tìm thấy!");
                    break;

                case 6:
                    manager.sortByAverageDesc();
                    System.out.println("Đã sắp xếp theo điểm TB giảm dần!");
                    break;

                case 7:
                    manager.statistics();
                    break;
            }
        } while (choice != 8);

        sc.close();
    }
}
