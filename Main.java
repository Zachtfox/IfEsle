import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the temperature");
        double temp = scan.nextDouble();

        if(temp < 97.5){
            System.out.println("Temperature = " + temp + " temperature is low.");
        }
         else if ( temp > 99.5){
            System.out.println("Temperature = " + temp + " temperature is high.");
        }
        else{
            System.out.println("Temperature = " + temp + " temperature is normal.");
        }


    }
}
