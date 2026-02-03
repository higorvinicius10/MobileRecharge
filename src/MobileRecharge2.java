import java.util.Scanner;

public class MobileRecharge2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your phone number:");
        double customerNumber = input.nextDouble();

        System.out.println("Enter the desired recharge amount:");
        int rechargeAmount = input.nextInt();


        int[] RECHARGE_VALUES = {20, 30, 50, 60, 80, 100};

        switch (rechargeAmount) {
            case 20:
                System.out.println("Recharge of 20 selected");
                System.out.println("Recharge completed, come back anytime dear customer");
                break;

            case 30:
                System.out.println("Recharge of 30 selected");
                System.out.println("Recharge completed, come back anytime dear customer");
                break;

            case 50:
                System.out.println("Recharge of 50 selected");
                System.out.println("Recharge completed, come back anytime dear customer");
                break;

            case 60:
                System.out.println("Recharge of 60 selected");
                System.out.println("Recharge completed, come back anytime dear customer");
                break;

            case 80:
                System.out.println("Recharge of 80 selected");
                System.out.println("Recharge completed, come back anytime dear customer");
                break;

            case 100:
                System.out.println("Recharge of 100 selected");
                System.out.println("Recharge completed, come back anytime dear customer");
                break;

            default:
                System.out.println("Invalid recharge amount");
        }
    }
}




