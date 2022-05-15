import java.util.Scanner;

public class menu1 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw isosceles triangle ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập chiều dài hình chữ nhật: ");
                    int a= input.nextInt();
                    System.out.println("nhập chiều cao hình chữ nhật:");
                    int b= input.nextInt();
                    for (int i = 1; i <= b; i++) {
                        for (int j = 1; j <= a; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("nhập cạnh góc vuông cân: ");
                    int c= input.nextInt();
                    System.out.println("tam giác vuông có cạnh góc vuông ở botton-left");
                    for (int i = 1 ; i <= c ; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("tam giác vuông có cạnh góc vuông ở top-left ");
                    for (int i = c; i >= 1 ; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("nhập chiều cao của tam giác cân: ");
                    int d= input.nextInt();
                    int k=0;
                    for (int i = 1; i <= d; i++, k = 0) {
                        for (int j = 1; j <= d - i; j++) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            k++;
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}