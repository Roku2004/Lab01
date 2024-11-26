package Lab01;
import java.util.Scanner;

public class bai226 {
    // giai phuong trinh bac 1
    public static void bacnhat(double a, double b){
        if( a == 0){
            if(b == 0)
            {
                System.out.println("phuong trinh co vo so nghiem");
            }
            else
            {
                System.out.println("phương trinh vo nghiem");
            }
        }
        else
        {
            System.out.println("nghiem cua phuong trinh la: " +(-b/a));
        }
    }

    //giai hpt bac nhat
    public static void hptbn(double a11,double a12,double b1,double a21,double a22,double b2){
        double D = a11*a22-a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2-a21*b1;
        System.out.println("Nghiem cua phuong trinh la (" +D1/D +"," + D2/D +")");
    }

    // gia phuong trinh bac 2 1 an
    public static void ptbh(double a,double b,double c ){
        double delta = b*b -4*a*c;
        if(delta < 0){
            System.out.println("phuong trinh vo nghiem");
        }
        if(delta == 0){
            System.out.println("phuong trinh co nghiem duy nhat la " + (-b/(2*a)));
        }
        if(delta > 0){
            System.out.println("phuong trinh co 2 nghiem la (" + ((-b+Math.sqrt(delta))/(2*a)) + ", " + ((-b-Math.sqrt(delta))/(2*a)) + ")");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. giai phuong trinh bac nhat");
        System.out.println("2. giai he phuong trinh bac nhat");
        System.out.println("3. giai phuong trinh bac 2 mot an");
        System.out.println("chon tu 1 den 3");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("nhap gia tri a b cua pt ax+b=0");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            bacnhat(a, b);
            break;

            case 2:
            System.out.println("nhap gia tri a11, a12, b1, a21, a22, b2 cua hpt theo thu tu");
            double a11 = sc.nextDouble();
            double a12 = sc.nextDouble();
            double b1 = sc.nextDouble();
            double a21 = sc.nextDouble();
            double a22 = sc.nextDouble();
            double b2 = sc.nextDouble();
            hptbn(a11, a12, b1, a21, a22, b2);
            break;

            case 3:
            double a1 = sc.nextDouble();
            double b11 = sc.nextDouble();
            double c = sc.nextDouble();
            ptbh(a1, b11, c);
            break;
        }
    }
}
