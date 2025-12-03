import java.util.Scanner;

public class uklNo2 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int[] money = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };
        System.out.println("Masukkan Uang (maksimal 6 digit): ");
        int uang = masukan.nextInt();// int uang buat nyimpen uangnya berapa
        if (uang < 0 || uang > 99999) {
            System.out.println("ERROR : jumlah uang harus 0 - 999999");
            return;
        }
        for (int b = 0; b < money.length; b++) {
            int lembar = uang / money[b];// int lembar buat nyimpen kira kira di bagi berapa
            uang = uang % money[b];

            if (lembar > 0) {
                if (money[b] >= 1000) {
                    System.out.println(lembar + "Lembar" + money[b]);
                } else {
                    System.out.println(lembar + "koin" + money[b]);
                }

            }

            // maksimal 6 digit, pecahan sampai koin 1

        }

    }
}