package HN_KS24_CNTT5_PhamTienDat_BtthSs5;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Btth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mssvList = new String[100];
        int size = 0;
        Pattern pattern = Pattern.compile("^B\\d{7}$");

        while(true){
            System.out.println("=======MENU QUAN LY SV =======");
            System.out.println("1.hien thi danh sach msv");
            System.out.println("2.them moi msv");
            System.out.println("3.cap nhat msv theo index");
            System.out.println("4.xoa msv");
            System.out.println("5.tim kiem msv");
            System.out.println("0.thoat");
            System.out.println("nhap lua chon cua ban: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1: // hien thi danh sach msv
                    if (size == 0) {
                        System.out.println("Danh sach rong");
                    } else {
                        for (int i = 0; i < size; i++) {
                            System.out.println((i + 1) + ". " + mssvList[i]);
                        }
                    }
                    break;
                case 2:// them msv
                    if (size == 100) {
                        System.out.println("Mang da day");
                        break;
                    }
                    String newMssv;
                    while (true) {
                        System.out.print("Nhap MSSV moi: ");
                        newMssv = scanner.nextLine();
                        if (pattern.matcher(newMssv).matches()) break;
                        System.out.println("MSSV khong hop le");
                    }
                    mssvList[size] = newMssv;
                    size++;
                    break;
                case 3://cap nhat msv thoe index
                    System.out.println("nhap index: ");
                    int index = scanner.nextInt() -1 ;
                    scanner.nextLine();
                    if(index <0 || index > size){
                        System.out.println("index khong hop le");
                        break;
                    }else{
                        String updateMssv;
                        while(true){
                            System.out.println("nhap msv moi");
                            updateMssv = scanner.nextLine();
                            if (pattern.matcher(updateMssv).matches()) {
                                mssvList[index] = updateMssv;
                                break;
                            } else {
                                System.out.println("MSSV khong hop le");
                            }
                        }
                    }


                    break;

                case 4://xoa msv
                    System.out.println("nhap msv can xoa: ");
                    String deleteMssv = scanner.nextLine();
                    int deleteIndex = -1;
                    for(int i=0; i<size;i++){
                        if(mssvList[i].equals(deleteMssv)){
                            deleteIndex = i;
                        }
                    }
                    if(deleteIndex == -1){
                        System.out.println("khong tim thay msv");
                    }else{
                        for (int i = deleteIndex; i < size - 1; i++) {
                            mssvList[i] = mssvList[i + 1];
                        }
                        mssvList[size - 1] = null;
                        size--;
                    }



                    break;
                case 5://tim msv

                    System.out.println("nhap msv can tim: ");
                    String search = scanner.nextLine().toLowerCase();
                    boolean found = false;
                    for(int i=0;i<size;i++){
                        if(mssvList[i].toLowerCase().contains(search)){
                            System.out.println("ma so tim duoc tu chuoi" + search + mssvList[i]);
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("khong tim thay msv phu hop");
                    }



                    break;
                case 0:
                    return;
                default:
                    System.out.println("lua chon khong hop le");
            }

        }
    }

}
