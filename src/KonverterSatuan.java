public class KonverterSatuan {
    public static final double SECONDTOMINUTE = 60.0;
    public static final double KILOGRAMTOPON = 2.20462;
    public static final double CMTOFEET = 3.28084;
    double value; // Variabel penyimpan nilai yang di konversi saya refactor get set dan rename
    int choice;  // Variabel penyimpan jenis konversi saya refactor get set dan rename

    // Constructor untuk menerima pilihan dan nilai input dari pengguna
    public KonverterSatuan(int choice, double value) {
        this.setChoice(choice);
        this.setValue(value);
    }

    // Metode untuk memulai konversi berdasarkan pilihan
    public void lakukanKonversi() {
        double hasil;

        switch (getChoice()) {
            case 1:
                hasil = meterKeKaki(getValue());
                System.out.println(getValue() + " meter sama dengan " + hasil + " kaki.");
                break;

            case 2:
                hasil = kilogramKePon(getValue());
                System.out.println(getValue() + " kilogram sama dengan " + hasil + " pon.");
                break;

            case 3:
                hasil = detikKeMenit((int) getValue());
                System.out.println((int) getValue() + " detik sama dengan " + hasil + " menit.");
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    // metode konversi cm to feet
    public static double meterKeKaki(double meter) {
        // saya inline variable dan introduce constant
        return meter * CMTOFEET; // 1 meter = 3.28084 kaki
    }

    // metode konversi kg to pon
    public static double kilogramKePon(double kilogram) {
        // saya inline variable, dan introduce constant
        return kilogram * KILOGRAMTOPON; // 1 kilogram = 2.20462 pon
    }

    // metode konversi detik to menit
    public static double detikKeMenit(int detik) {
        double secondtominute = SECONDTOMINUTE; //saya introduce variable dan introduce constant
        return detik / secondtominute; // 1 menit = 60 detik, dan introduce constant
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
}
