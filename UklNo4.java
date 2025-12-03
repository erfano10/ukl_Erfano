import java.util.Scanner;

public class UklNo4 {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);

        System.out.println("Kamu mau memasukkan jummlah Array berapa? :");
        int n = Inputan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan angka ke-" + (i + 1) + ":");
            array[i] = Inputan.nextInt();
        }

        boolean adaDuplikat = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki duplikat sebanyak " + array[i]);
                    adaDuplikat = true;
                    break;

                }
            }
            if (adaDuplikat) {
                break;
            }
        }
        if (!adaDuplikat) {
            System.out.println("Array tidak memiliki elemen duplikat");
        }
    }
}
