package Lab01;

import java.util.Scanner;

public class month {
    public static void checkyear(int year){
        Scanner sc = new Scanner(System.in);
        while(year < 0){
            System.out.println("nhap year khong hop le, year khong am");
            if(sc.hasNextInt()){
                year = sc.nextInt();
            }
        }
    }

    public static void checkthang(String thang){
        String[] monthArr = {"January","Jan.","Jan","February","Feb.","Feb","March","Mar.","Mar","April","Apr.","Apr",
    "May","May.","June","Jun.","Jun","July","Jul.","Jul","August","Aug.","Aug","September","Sep.","Sep","October","Oct.",
    "Oct","November","Nov.","Nov","December","Dec.","Dec","1","2","3","4","5","6","7","8","9","10","11","12"};
    Scanner sc = new Scanner(System.in);
    boolean found = false;
    while(found){
            System.out.println("nhap sai yeu cau nhap lai");
            String userInput = sc.next();
            for(String element : monthArr){
                if (userInput.equalsIgnoreCase(element)) {
                    found = true;
                    break;
                }
            }
        }
    }

    public static void check1(String thang){
        if(thang.equals("January") == true || thang.equals("Jan.") == true|| thang.equals("Jan") == true||
        thang.equals("March") == true || thang.equals("Mar.") == true|| thang.equals("Mar") == true||
        thang.equals("May ") == true || thang.equals("May.") == true||
        thang.equals("July") == true||thang.equals("Jul.") == true || thang.equals("Jul") == true||
        thang.equals("August") == true||thang.equals("Aug.") == true || thang.equals("Aug") == true||
        thang.equals("October") == true||thang.equals("Oct.") == true || thang.equals("Oct") == true||
        thang.equals("December") == true||thang.equals("Dec.") == true || thang.equals("Dec") == true||
        thang.equals("1") == true|| thang.equals("3") == true|| thang.equals("5") == true||
        thang.equals("7") == true|| thang.equals("8") == true|| thang.equals("10") == true|| 
        thang.equals("12") == true){
            System.out.println("co 31 ngay");
        }
        if(thang.equals("April") == true || thang.equals("Apr.") == true|| thang.equals("Apr") == true||
        thang.equals("June") == true || thang.equals("Jun.") == true|| thang.equals("Jun") == true||
        thang.equals("September") == true || thang.equals("Sep.") == true|| thang.equals("Sep") == true||
        thang.equals("November") == true || thang.equals("Nov.") == true|| thang.equals("Nov") == true||
        thang.equals("4") == true|| thang.equals("6") == true|| thang.equals("9") == true||
        thang.equals("11") == true){
            System.out.println("co 30 ngay");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap year bat ki: ");
        int year = sc.nextInt();
        checkyear(year);

        System.out.println("nhap thang bat ki: ");
        String thang = sc.next();
        checkthang(thang);

        if(year % 100 !=0 && year % 4 != 0 || year % 400 != 0 && year % 100 == 0){
            if(thang.equals("February") == true || thang.equals("Feb.") == true|| thang.equals("Feb") == true||
            thang.equals("2") == true){
                System.out.println("co 28 ngay");
            }
            check1(thang);
        }
        if(year % 400 == 0 && year % 100 ==0 && year % 4 == 0){
            if(thang.equals("February") == true || thang.equals("Feb.") == true|| thang.equals("Feb") == true||
            thang.equals("2") == true ){
                System.out.println("co 29 ngay");
            }
            check1(thang);
        }
    }
}

