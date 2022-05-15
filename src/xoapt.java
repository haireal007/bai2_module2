import java.util.Scanner;

public class xoapt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vị trí phần tử xoá:");
        int index = scanner.nextInt();
        int arr[]={1,2,3,4,5,6,7,8,9};
        int arr2[]={arr.length};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==index){
                for (int j = 0; j < arr.length; j++) {
                    arr2[j-1]=arr[i];
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
