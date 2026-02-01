package ss6;

public class Bai6 {
    static class User {
        private int id;
        private String username;
        private String password;
        private String email;

        public User(int id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password);
            setEmail(email);
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public void setPassword(String password) {
            if (password != null && !password.isEmpty()) {
                this.password = password;
            } else {
                System.out.println("Password không được rỗng!");
            }
        }

        public void setEmail(String email) {
            if (email != null && email.contains("@")) {
                this.email = email;
            } else {
                System.out.println("Email không hợp lệ!");
            }
        }

        public void hienThiThongTin() {
            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ********");
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        User u1 = new User(1, "datpham", "123456", "dat@gmail.com");
        User u2 = new User(2, "user2", "", "saiemail");
        User u3 = new User(3, "user3", "abc123", "user3@mail.com");

        u1.hienThiThongTin();
        u2.hienThiThongTin();
        u3.hienThiThongTin();

        u1.setPassword("");
        u1.setEmail("email_sai");

        u1.hienThiThongTin();
    }
}
