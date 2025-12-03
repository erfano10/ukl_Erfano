import java.util.ArrayList;
import java.util.Scanner;

public class uklNo7 {
     
    // Helper untuk mengulang karakter
    private static String repeatChar(char ch, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) sb.append(ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner masukan = new java.util.Scanner(System.in);

        System.out.print("Masukkan jumlah jenis cookies yang ingin dihitung (Maks 3): ");
        int jumlahCookies = masukan.nextInt();
        masukan.nextLine();

        if (jumlahCookies < 1 || jumlahCookies > 3) {
            System.out.println("❌ Jumlah cookies harus antara 1 sampai 3.");
            masukan.close();
            return;
        }

        java.util.ArrayList<String> namaCookiesList = new java.util.ArrayList<>();
        java.util.ArrayList<Long> totalBiayaList = new java.util.ArrayList<>();
        java.util.ArrayList<Long> totalPendapatanList = new java.util.ArrayList<>();
        java.util.ArrayList<Long> labaRugiList = new java.util.ArrayList<>();

        long totalLabaRugiKeseluruhan = 0;
        long labaTerbesar = Long.MIN_VALUE;
        String cookiesLabaTertinggi = "";

        // Ganti .repeat(...) dengan repeatChar(...)
        String menu = "\n" + repeatChar('-', 35)
                + "\nMenu Cookies Otomatis (Harga Tetap):"
                + "\n1. Chocolate Chip (H.Produksi: 8000, H.Jual: 12000)"
                + "\n2. Oatmeal Raisin (H.Produksi: 9000, H.Jual: 8500)"
                + "\n3. Butter Crunch (H.Produksi: 7500, H.Jual: 9500)"
                + "\n" + repeatChar('-', 35);

        for (int g = 0; g < jumlahCookies; g++) {
            System.out.println("\nCookies ke-" + (g + 1) + ":");
            System.out.println(menu);
            System.out.print("Pilih nomor cookies (1, 2, atau 3): ");
            int pilihan = masukan.nextInt();
            masukan.nextLine();

            String namaCookies = "";
            long hargaProduksi = 0;
            long hargaJual = 0;

            switch (pilihan) {
                case 1:
                    namaCookies = "Chocolate Chip";
                    hargaProduksi = 8000;
                    hargaJual = 12000;
                    break;
                case 2:
                    namaCookies = "Oatmeal Raisin";
                    hargaProduksi = 9000;
                    hargaJual = 8500;
                    break;
                case 3:
                    namaCookies = "Butter Crunch";
                    hargaProduksi = 7500;
                    hargaJual = 9500;
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid (harus 1, 2, atau 3).");
                    g--;
                    continue;
            }

            System.out.println("Anda memilih: " + namaCookies);
            System.out.print("Jumlah bungkus terjual: ");
            long jumlahTerjual = masukan.nextLong();
            masukan.nextLine();

            long totalBiaya = hargaProduksi * jumlahTerjual;
            long totalPendapatan = hargaJual * jumlahTerjual;
            long labaRugi = totalPendapatan - totalBiaya;

            namaCookiesList.add(namaCookies);
            totalBiayaList.add(totalBiaya);
            totalPendapatanList.add(totalPendapatan);
            labaRugiList.add(labaRugi);

            totalLabaRugiKeseluruhan += labaRugi;
            if (labaRugi > labaTerbesar) {
                labaTerbesar = labaRugi;
                cookiesLabaTertinggi = namaCookies;
            }
        }

        // Output rapi
        System.out.println("\n" + repeatChar('=', 75));
        System.out.println("Output Perhitungan Laba/Rugi Cookies:");
        System.out.println(repeatChar('=', 75));

        System.out.printf("%-20s | %-15s | %-17s | %-15s | %-6s\n",
                "Nama Cookies", "Total Biaya", "Total Pendapatan", "Laba/Rugi", "Status");
        System.out.println(repeatChar('-', 75));

        for (int g = 0; g < namaCookiesList.size(); g++) {
            long lr = labaRugiList.get(g);
            String status = lr > 0 ? "Laba" : (lr < 0 ? "Rugi" : "Impas");

            System.out.printf("%-20s | Rp%,13d | Rp%,15d | Rp%,13d | %-6s\n",
                    namaCookiesList.get(g),
                    totalBiayaList.get(g),
                    totalPendapatanList.get(g),
                    lr,
                    status);
        }

        System.out.println(repeatChar('-', 75));
        System.out.printf("Total Laba/Rugi Keseluruhan: Rp%,d\n", totalLabaRugiKeseluruhan);
        System.out.printf("Cookies dengan Laba Tertinggi: %s (Rp%,d)\n", cookiesLabaTertinggi, labaTerbesar);

        masukan.close();
    }
}
    


    
