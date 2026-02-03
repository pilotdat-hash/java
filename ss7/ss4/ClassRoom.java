package ss7.ss4;

public class ClassRoom {
    private String studentName;
    public static double classFund = 0;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println(studentName + " đóng " + amount);
    }

    public static void showFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}
