package ss7.Btth;

public class Main {
    public static void main(String[] args) {
        Student datpham = new Student(1,"pham tien dat");
        Student chien = new Student(2,"chien");
        Student thang = new Student(1,"thang");

        datpham.display();
        chien.display();
        thang.display();

        Student.showTotalStudent();
    }

}
