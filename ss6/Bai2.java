package ss6;

public class Bai2 {
    static class Account {
        String username;
        String password;
        String email;

        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void doiMatKhau(String matKhauMoi) {
            this.password = matKhauMoi;
        }

        public void hienThiThongTin() {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ********");
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Account acc = new Account("datpham", "123456", "dat@gmail.com");

        acc.hienThiThongTin();
        acc.doiMatKhau("newpassword2026");
        acc.hienThiThongTin();
    }
}
