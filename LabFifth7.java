package testpingjava;

import java.util.Scanner;

public class LabFifth7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        switch (day){
            case "Sunday":
                System.out.println("closed");
                break;
            default:
                if(hour>=10 && hour <18){
                    System.out.println("open");
                } else{
                    System.out.println("closed");
                }
        }
    }
}
// the problem will be upluoded in my repositories