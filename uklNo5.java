import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class uklNo5 {
    public static int kocongangka() {
        Random acak = new Random();
        return acak.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int countKomputer = 0;
        int countUser = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ListUser = new ArrayList<>();
        ArrayList<Integer> ListKomputer = new ArrayList<>();

        while (countKomputer < 5 && countUser < 5) {
            System.out.println("Ketik untuk lempar dadu :");
            int dadukomputer = kocongangka();
            ListKomputer.add(dadukomputer);
            scan.next();
            System.out.println("dadu komputer = " + dadukomputer);
            int daduUser = kocongangka();
            ListUser.add(daduUser);
            System.out.println("dadu user adalah = " + daduUser);

            if (daduUser > dadukomputer) {
                System.out.println("User menang");
                countUser++;
            } else if (daduUser < dadukomputer) {
                System.out.println("Komputer Menang");
                countKomputer++;
            } else {
                System.out.println("Seri");
            }
            System.out.println("===============================");
        }
        System.out.println("Game sudah selesaii Terimakasihh!!");
        if (countUser == 5) {
            System.out.println("user menang");
        } else {
            System.out.println("komputer menang");
        }
        System.out.println(ListUser);
        System.out.println(ListKomputer);

    }
}