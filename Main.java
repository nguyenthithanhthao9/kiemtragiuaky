import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
quanlisach manager =new quanlisach();
Scanner sc=new Scanner(System.in);
int choice;
do{
    System.out.println("-------MENU--------");
    System.out.println("1.Hiển thị danh sách các quyển sách ");
    System.out.println("2.Thêm sách vào danh sách ");
    System.out.println("3.Sửa thông tin sách theo Id");
    System.out.println("4.Thoát chương trình.");
    System.out.println("5.vui lòng chọn lại ");
    System.out.print("------------------");
    choice=sc.nextInt();
    sc.nextLine();
    switch(choice){
        case 1:
manager.hienthi();
break;
        case 2:
            System.out.println("thêm  mã sách vào danh sách:");
            String id= sc.nextLine();
            System.out.println("nhập tên sách:");
            String tensach=sc.nextLine();
            System.out.println("nhập tên tác giả:");
            String tentacgia=sc.nextLine();
            System.out.println("nhập tên nhà xuất bản:");
            String tennhaxuatban=sc.nextLine();
            manager.addBook(new sach(id,tensach,tentacgia,tennhaxuatban));
            break;
            case 3:
                System.out.println("Sửa thông tin  mã sách :");
                String newId=sc.nextLine();
                System.out.println("nhập tên sách mới:");
                String newtensach=sc.nextLine();
                System.out.println("nhập tên tác giả mới :");
                String newtentacgia=sc.nextLine();
                System.out.println("nhập tên nhà xuất bản mới:");
                String newtennhaxuatban=sc.nextLine();
        manager.editBookById(newId,newtensach,newtentacgia,newtennhaxuatban);
        break;
        case 4:
            System.out.println("4.Thoát chương trình.");
            break;
        default:
            System.out.println("Lựa chọn không hợp lệ.");
    }
}while (choice !=0);
sc.close();
    }


}