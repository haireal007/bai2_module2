import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class HoatdongQL {
    public static void main(String[] args) {
        Quanlynv[] nhanVien = new Quanlynv[0];
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    Quanlynv[] nhanVien1 = new Quanlynv[nhanVien.length + 1];
                    Scanner id = new Scanner(System.in);
                    System.out.println("Nhập id:");
                    int Id = id.nextInt();
                    Scanner name = new Scanner(System.in);
                    System.out.println("Nhập name:");
                    String Name = name.nextLine();
                    Scanner age = new Scanner(System.in);
                    System.out.println("Nhập age:");
                    int Age = age.nextInt();
                    Scanner address = new Scanner(System.in);
                    System.out.println("Nhập address:");
                    String Address = address.nextLine();
                    Quanlynv nhanVienMoi = new Quanlynv(Id, Name, Age, Address);
                    nhanVien1[nhanVien.length] = nhanVienMoi;
                    nhanVien = nhanVien1;
                    break;
                case 2:
                    Scanner index = new Scanner(System.in);
                    System.out.println("Nhập số phần tử cần sửa:");
                    int Index = index.nextInt();
                case 4:
                    System.out.println(Arrays.toString(nhanVien));
            }
        }
    }
}
