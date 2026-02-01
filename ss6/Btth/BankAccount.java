/*

BTTH:
Yêu cầu:
- Quản lý tài khoản ngân hàng (giao dịch)
Giải pháp:
- Class
- Object (Instance)
- if else

B1: Định nghĩa Class:
- Thuộc tính:
	+ accountNumber – String – private
	+ ownerName – String – private
	+ balance – double - private
- Phương thức:
	+ Constructors: (ko có tham số, có tham số)
	+ Getter / Setter
	+ deposit( double money )
		+ Kiểm tra tiền money có hợp lệ
		+ Cộng số dư lên
	+ withdraw( double money )
		+ Kiểm tra số tiền money có hợp lệ hay không
		+ Kiểm tra số dư có đủ rút hay không (balance – money < 0)
		+ Trừ số dư đi
	+ display()
		+ định dạng
		-----------------------------------
		Số TK: 0987654321
		Name: Hà Bích Ngọc
		Balance: 100.000.000 VNĐ
		----------------------------------------
B2: Lớp Kiểm thử (main để chạy)
- Khởi tạo 2 tìa khoản (Object - Instances)
- In thông tin tài khoản trước khi giao dịch
- Thực hiện giao dịch
- In thông tin tài khoản sau khi giao dịch

 */




package ss6.Btth;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // nap tien
    public void deposit(double money){
        if(money < 0){
            System.err.println("so tien nap khong hop le");
        }else{
            balance += money;
        }
    }

    //rut tien
    public void withdraw(double money){
        if(money >0 && (balance - money >= 0)){
            balance -= money;
        }else{
            System.err.println("so du khong du");
        }
    }

    // hien thi thong tin

    public void display(){
        System.out.println("--------------------");
        System.out.println("STK : Account Number : "+accountNumber);
        System.out.println("Name : "+ownerName);
        System.out.println("So du : "+balance);
        System.out.println("--------------------");
    }



}










