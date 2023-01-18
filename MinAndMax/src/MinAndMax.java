import java.util.Scanner;
public class MinAndMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?: ");
        int n = input.nextInt();
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz:");
            int num = input.nextInt();
            if (i == 0) {
                min = num;
                max = num;
            } else {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
        input.close();
    }
}