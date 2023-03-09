import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number for triangle:");
        int num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int space = 0; space <= row; space++) {
                System.out.print(" ");
            }
            for (int star = 2*(num-row)-1; star>=1 ; star--){
                System.out.print("*");
            }


            System.out.println();
        }

    }
}