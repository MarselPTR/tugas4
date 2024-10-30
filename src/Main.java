import java.util.Scanner;

public class Main {  //refactor move class
    // metode untuk menjalankan program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Selamat datang di Program Konverter Satuan!");
        System.out.println("Pilih jenis konversi yang ingin Anda lakukan:");
        System.out.println("1. Konversi Panjang (Meter ke Kaki)");
        System.out.println("2. Konversi Berat (Kilogram ke Pon)");
        System.out.println("3. Konversi Waktu (Detik ke Menit)");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();


        System.out.print("Masukkan nilai yang ingin dikonversi: ");
        double nilai = input.nextDouble();

        // pembuatan objek dari KonverterSatuan gunakan constructor
        KonverterSatuan konverter = new KonverterSatuan(pilihan, nilai);

        // memanggil metode untuk melakukan konversi
        konverter.lakukanKonversi();

        input.close(); // menutup Scanner bolo
    }
}
