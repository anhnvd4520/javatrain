import java.util.Scanner;

public class Bai9 {
    public static void mangsonguyen(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        for (int i=0;i<n;i++){
            int count = 0;
            for (int k=0;k<n;k++){
                if (arr[i]==arr[k]){
                    count++;
                }

            }
            if (count==2){
                System.out.println(arr[i]);
            }
        }
    }
}
