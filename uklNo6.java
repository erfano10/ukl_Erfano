import java.util.Scanner;

public class uklNo6 {
    public static void main(String[] args) {
        int totalBiaya = 0;
        int denda = 0;
        Scanner Masukan = new Scanner(System.in);
        System.out.println("Masukkan nama Peminjam :");
        String namaPeminjam = Masukan.nextLine();
        System.out.println("Masukkan judul buku :");
        String judulBuku = Masukan.nextLine();
        System.out.println("Pilih lah kategori buku A, B,atau C :");
        String pilihKategori = Masukan.nextLine();
        System.out.println("Lama peminjaman buku (hari)");
        int lamaPeminjaman = Masukan.nextInt();

        if (pilihKategori.equalsIgnoreCase("A")) {
            totalBiaya = lamaPeminjaman * 2000;
        } else if (pilihKategori.equalsIgnoreCase("B")) {
            totalBiaya = lamaPeminjaman * 1500;
        } else if (pilihKategori.equalsIgnoreCase("C")) {
            totalBiaya = lamaPeminjaman * 1000;
        }
        if (lamaPeminjaman > 7) {
            int terlambat = lamaPeminjaman - 7;
         denda = terlambat * 500;
        }
        System.out.println("nama Peminjam adalah = "+namaPeminjam);
        System.out.println("Judul buku adalah : "+judulBuku);
        System.out.println("kategori buku A, B, atau C : "+pilihKategori );
        System.out.println("lama peminjaman buku : "+lamaPeminjaman);
        System.out.println("Biaya awal peminjaman adalah "+totalBiaya);
        System.out.println("Denda keterlambatan adalah "+denda);
        System.out.println("Biaya akhir peminjaman adalah "+(denda+totalBiaya));

    }
}
