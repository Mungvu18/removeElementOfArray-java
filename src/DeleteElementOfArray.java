import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementOfArray {
    // khởi tạo 1 mảng N phần tử nhập từ bàn phím
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("mời bạn nhập số lượng phần tử của mảng");
            N = sc.nextInt();
            if (N > 20) {
                System.out.println("Mời bạn nhập lại. Số phần tử mảng k được lớn hơn 20.");
            }
        } while (N > 20);
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập giá trị phần tử của mảng thứ " + (i + 1) + " là: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng arr gồm " + N + " phần tử là:");
        System.out.println(Arrays.toString(arr));
        System.out.println("mời bạn nhập number cần kiểm tra: ");
        int number = sc.nextInt();
        deleteElement(arr, number);
        System.out.printf(Arrays.toString(arr));

    }

    public static int[] deleteElement(int[] arr, int number) {
        int index = arr.length;
        int i;
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                count++;
            }
        }
        for (int j = 0; j < count; j++) {
            for (i = 0; i < arr.length; i++) {
                if (number == arr[i]) {
                    index = i;
                }
            }
            for (i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            if (index >= 0 && index < arr.length) {
                arr[arr.length - 1] = 0;
            }
        }
        return arr;
    }
}
