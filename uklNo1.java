import java.util.Scanner;

public class uklNo1 {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);

        int bilangan;
        System.out.println("masukkan angka :");
        bilangan = Inputan.nextInt();
           // bilangan antara 100 - 500 cek prima 
            boolean isprima = true;
            for (int i = 2; i < Math.sqrt(bilangan); i++) {

                if (bilangan % i == 0) {
                    isprima = false;
                    break;
                }
            }

            if (bilangan < 0) {
            System.out.println("kurang dari 0");
        }else if (bilangan <100){
            System.out.println("kurang dari 100");
        }else if (bilangan >500) {
            System.out.println("lebih dari 500");
        }else {
            if (isprima) {
                System.out.println("ini adalah bilangan prima");
            }else {
                System.out.println("Bilangan ini bukan bilangan prima");
            }
        }

            //kurang dari 100 ket kurang dari 100
            //lebih dari 500 ket lebih dari 500
            //100-500 muncul ket 200 bukan bilangan prima

        }
    }

