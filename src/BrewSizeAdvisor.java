import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        if(v>=400){
            System.out.println("Large");
        }else if(150<v<400){
            System.out.println("Medium");
        }else{
            System.out.println("Small");
        }

        // TODO:
        // Print "Small", "Medium", or "Large"
        // based on the given volume

        sc.close();
    }
}

