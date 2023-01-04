package testpingjava;

import java.util.Scanner;

public class LabFIfth5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String prouduk = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        if(prouduk.equals("coffee")){
            if(city.equals("London")){
                System.out.println(0.5*quantity);
            } else if (city.equals("Rome")) {
                System.out.println(0.40*quantity);
            } else{
                System.out.println(0.45*quantity);
            }
        }
        else if(prouduk.equals("water")){
            if(city.equals("London")){
                System.out.println(0.80*quantity);
            } else if (city.equals("Rome")) {
                System.out.println(0.70*quantity);
            } else{
                System.out.println(0.70*quantity);
            }
        }
        else if(prouduk.equals("beer")){
            if(city.equals("London")){
                System.out.println(1.20*quantity);
            } else if (city.equals("Rome")) {
                System.out.println(1.15*quantity);
            } else{
                System.out.println(1.10*quantity);
            }
        }
        else if(prouduk.equals("sweets")){
            if(city.equals("London")){
                System.out.println(1.45*quantity);
            } else if (city.equals("Rome")) {
                System.out.println(1.30*quantity);
            } else{
                System.out.println(1.35*quantity);
            }
        }
        else if(prouduk.equals("peanuts")){
            if(city.equals("London")){
                System.out.println(1.60*quantity);
            } else if (city.equals("Rome")) {
                System.out.println(1.50*quantity);
            } else{
                System.out.println(1.55*quantity);
            }
        }
    }
}
// the problem will be upluoded in my repositories