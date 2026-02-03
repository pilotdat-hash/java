package ss7.ss4;

public class Main {

    public static void main(String[] args) {
        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Bình");
        ClassRoom s3 = new ClassRoom("Chi");

        s1.contribute(100);
        s2.contribute(200);
        s3.contribute(150);

        ClassRoom.showFund();

    }
}
