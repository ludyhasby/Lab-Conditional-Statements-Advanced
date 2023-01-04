package testpingjava;

import java.util.Scanner;

public class LabFifth11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());

        if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday"))
        {
            switch(fruit){
                case "banana":
                    System.out.format("%.2f", qty*2.50);
                    break;
                case "apple":
                    System.out.format("%.2f", qty*1.20);
                    break;
                case "orange":
                    System.out.format("%.2f", qty*0.85);
                    break;
                case "grapefruit":
                    System.out.format("%.2f", qty*1.45);
                    break;
                case "kiwi":
                    System.out.format("%.2f", qty*2.70);
                    break;
                case "pineapple":
                    System.out.format("%.2f", qty*5.50);
                    break;
                case "grapes":
                    System.out.format("%.2f", qty*3.85);
                    break;
                default:
                    System.out.println("error");
            }
        } else if(day.equals("Saturday")||day.equals("Sunday"))
        {
            switch(fruit){
                case "banana":
                    System.out.format("%.2f", qty*2.70);
                    break;
                case "apple":
                    System.out.format("%.2f", qty*1.25);
                    break;
                case "orange":
                    System.out.format("%.2f", qty*0.90);
                    break;
                case "grapefruit":
                    System.out.format("%.2f", qty*1.60);
                    break;
                case "kiwi":
                    System.out.format("%.2f", qty*3.00);
                    break;
                case "pineapple":
                    System.out.format("%.2f", qty*5.60);
                    break;
                case "grapes":
                    System.out.format("%.2f", qty*4.20);
                    break;
                default:
                    System.out.println("error");
            }
        } else{
            System.out.println("error");
        }
    }
}