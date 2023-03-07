import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayıAdet, sayı, min = 0, max = 0;
        System.out.print("Kaç Tane Sayı Giriceksiniz? :");
        sayıAdet = input.nextInt();

        for (int i = 1; i <= sayıAdet; i++) {
            System.out.print(i + ". Sayıyı Giriniz :");
            sayı = input.nextInt();

            if (i == 1) {
                min = sayı;
                max = sayı;
            }
           else if (sayı<=min) {
                min = sayı;

            }
           else if (sayı>=max) {
                max = sayı;
            }


        }
        System.out.println("En Büyük :" + max);
        System.out.println("En Küçük :" + min);

    }
}