import java.util.Scanner;
import java.util.Random;
public class uklNo3 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Random random = new Random();
        // Array operator
        String[] operators = {"*", "/", "%"};
        
        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Jawab pertanyaan dengan benar. Tekan 'n' untuk berhenti.");
        
        while (true) {
            // Generate bilangan acak (1-10)
            int bil1 = random.nextInt(10) + 1;
            int bil2 = random.nextInt(10) + 1;
            
            // Pastikan bil2 tidak 0 untuk pembagian dan modulus
            while (bil2 == 0) {
                bil2 = random.nextInt(10) + 1;
            }
            
            // Pilih operator acak
            int opIndex = random.nextInt(3);
            String operator = operators[opIndex];
            
            // Hitung hasil benar
            int hasilBenar;
            if (operator.equals("*")) {
                hasilBenar = bil1 * bil2;
            } else if (operator.equals("/")) {
                hasilBenar = bil1 / bil2;
            } else {
                hasilBenar = bil1 % bil2;
            }
            
            // Tampilkan pertanyaan
            System.out.print(bil1 + " " + operator + " " + bil2 + " = ");
            int jawaban = inputan.nextInt();
            
            if (jawaban == hasilBenar) {
                System.out.println("Jawaban benar!");
            } else {
                System.out.println("Jawaban salah. Jawaban yang benar adalah " + hasilBenar);
            }
            
            // Tanya apakah lanjut
            System.out.print("Apakah ingin melanjutkan? (y/n): ");
            String lanjut = inputan.next();
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Terima kasih telah bermain!");
    }
}
