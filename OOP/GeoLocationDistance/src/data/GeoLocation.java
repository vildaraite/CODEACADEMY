package data;
// lapkricio 22d. paskaitos galas 20min
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
public class GeoLocation {
    private static int numbOfLocations = 0;

    private final BigDecimal lat;
    private final BigDecimal lon;

    public GeoLocation() {
        lat = getGeneratedValue(-90, 90);
        lon = getGeneratedValue(-90, 90);

        numbOfLocations++;
    }

    public GeoLocation(double lat, double lon) {
        this.lat = BigDecimal.valueOf(lat);
        this.lon = BigDecimal.valueOf(lon);

        numbOfLocations++;
    }

    public GeoLocation(GeoLocation geoLocation) {
        lat = geoLocation.lat.add(getGeneratedValue(-0.1, 0.1));
        lon = geoLocation.lon.add(getGeneratedValue(-0.1, 0.1));

        numbOfLocations++;
    }

    public void print() {
        System.out.printf("[%s %s]%n", lat, lon);
    }

    public static int getNumbOfLocations() {
        return numbOfLocations;
    }

    public static double distance(GeoLocation a, GeoLocation b) {
        double lat1 = a.lat.doubleValue();
        double lon1 = a.lon.doubleValue();
        double lat2 = b.lat.doubleValue();
        double lon2 = b.lon.doubleValue();

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double result = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(result));

        return rad * c;
    }

    private BigDecimal getGeneratedValue(double min, double max) {
        Random random = new Random();
        double result = random.doubles(min, max).findFirst().getAsDouble();

        return BigDecimal.valueOf(result).setScale(6, RoundingMode.HALF_UP);
    }
}
