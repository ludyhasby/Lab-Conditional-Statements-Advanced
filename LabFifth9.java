package testpingjava;

import java.util.Scanner;

public class LabFifth9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        switch(string){
            case "banana" :
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
