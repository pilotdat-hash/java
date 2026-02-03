package ss7.ss3;

public class Main {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5\n");
        System.out.println(">> Kết quả xử lý:");

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("- Điểm trung bình cả lớp: %.2f%n", avg);

        for (double s : scores) {
            String result = ScoreUtils.checkPass(s) ? "Đạt" : "Trượt";
            System.out.println("- Điểm " + s + ": " + result);
        }
    }
}
