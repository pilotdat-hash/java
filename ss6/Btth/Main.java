package ss6.Btth;

public class Main {
    public static void main(String[] args) {
        BankAccount dat = new BankAccount("22122006","DatPham",12345678);
        BankAccount dat2 = new BankAccount("12345678","dat2",876543210);

        System.out.println("thong tin tk 1 ban dau: ");
        dat.display();
        System.out.println("thong tin tk 2 ban dau: ");
        dat2.display();

        dat.deposit(100);
        dat2.withdraw(200);

        System.out.println("thong tin tk 1 sau: ");
        dat.display();
        System.out.println("thong tin tk 2 sau: ");
        dat2.display();
    }

}
