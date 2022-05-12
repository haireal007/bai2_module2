import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Intergratedmoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập Số tiền gửi :");
        double money = input.nextDouble();
        System.out.println("nhập tháng gửi :");
        int month = input.nextInt();
        System.out.println("nhập số lãi suất :");
        double interestRate = input.nextDouble();
        double totalinterest = 0;
        for (int i = 0; i < month; i++) {
            totalinterest += money * (interestRate / 100) * 12 * month;
            System.out.println("Tổng số tiền lãi:" + totalinterest);
        }
    }
}
