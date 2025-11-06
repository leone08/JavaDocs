/**
 * Kelas TemperatureConverter digunakan untuk mengonversi suhu antar satuan
 * seperti Celcius, Fahrenheit, dan Kelvin.
 *
 * <pre>
 *     TemperatureConverter t = new TemperatureConverter();
 *     System.out.println(t.toFahrenheit(30));
 * </pre>
 *
 * @author Wanda
 * @version 1.0
 * @since 2025-11-05
 */
public class TemperatureConverter {

    /**
     * Mengonversi suhu dari Celcius ke Fahrenheit.
     *
     * @param celcius suhu dalam Celcius
     * @return suhu dalam Fahrenheit
     */
    public double toFahrenheit(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    /**
     * Mengonversi suhu dari Celcius ke Kelvin.
     *
     * @param celcius suhu dalam Celcius
     * @return suhu dalam Kelvin
     */
    public double toKelvin(double celcius) {
        return celcius + 273.15;
    }

    /**
     * Mengonversi suhu dari Fahrenheit ke Celcius.
     *
     * @param fahrenheit suhu dalam Fahrenheit
     * @return suhu dalam Celcius
     */
    public double toCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
