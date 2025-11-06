/**
 * Kelas utama untuk menjalankan program konversi suhu sederhana.
 */
public class Main {

    /**
     * Metode utama yang menjalankan program konversi suhu.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("=== Konversi Suhu ===");
        System.out.println("30°C = " + converter.toFahrenheit(30) + "°F");
        System.out.println("30°C = " + converter.toKelvin(30) + "K");
        System.out.println("86°F = " + converter.toCelcius(86) + "°C");
    }
}