package Lab01;

import java.util.Arrays;
import java.util.Scanner;

public class bai65 {
    public static void tinhtb(int n, int[] arr){
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("gia tri trung binh cua mang la: " + (double)(sum/n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap phan tu ");
        for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("ket qua sau khi sap xep la: " + Arrays.toString(arr));
        
        tinhtb(n, arr);
    }
}
