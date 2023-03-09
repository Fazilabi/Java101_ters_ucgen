import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number for triangle:");
        int num = input.nextInt();

        for (int a = 1; a <= num; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 2*(num-a)-1; c>=1 ; c--){
                System.out.print("*");
            }


            System.out.println();
        }

    }
}