import java.lang.String;
import java.util.Scanner;

public class TextAnalyzer {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    masukkan_Text(scanner);
                    break;
                case 2:
                    jumlah_Karakter();
                    break;
                case 3:
                    jumlah_Kata();
                    break;
                case 4:
                    pencarian_Kata(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilih != 5);

        scanner.close();
    }

    private static void masukkan_Text(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        String inputText = scanner.nextLine();

        if (!inputText.isEmpty()) {
            text = inputText;
            System.out.println("Teks telah dimasukkan!\n");
        } else {
            System.out.println("Teks tidak boleh kosong. Silakan masukkan teks.\n");
        }
    }

    private static void jumlah_Karakter() {
        System.out.println("Jumlah karakter dalam teks: " + text.length() + "\n");
    }

    private static void jumlah_Kata() {
        String[] kata = text.split("\\s+");
        System.out.println("Jumlah kata dalam teks: " + kata.length + "\n");
    }

    private static void pencarian_Kata(Scanner scanner) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.nextLine();
        int hitung = 0;

        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                hitung++;
            }
        }
        System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + hitung + " kali dalam teks.\n");
    }
}