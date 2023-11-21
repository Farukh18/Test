package EquivalenceClasses;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceIs0Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, 0)
        );

        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceIsKm21(){
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, 21)
        );
        Assertions.assertEquals("Bike can not go for more than 20 km", ex.getMessage());
    }

    @Test
    public void shouldReturn20ForBikeAndDistanceIs20Km() {
        int price = priceCalculator.calculatePrice(TransportType.BIKE, 20);
        Assertions.assertEquals(200, price);
    }

    private Executable generateExecutable(TransportType type, int distance) {
        return () -> priceCalculator.calculatePrice(type, distance);
    }
    @Test
    public void shouldThrowExceptionWhenCarAndDistanceIs0Km(){
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, 0)
        );
        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldReturn20ForCarAndDistanceIs1000Km(){
        int price = priceCalculator.calculatePrice(TransportType.CAR, 1000);
        Assertions.assertEquals(7000, price);
    }

    @Test
    public void shouldThrowExceptionWhenCarAndDistanceIs1000Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, 1001)
        );
        Assertions.assertEquals("Car can not go for more than 1000 km", ex.getMessage());
    }
    @Test
    public void shouldThrowExceptionWhenTruckAndDistanceIs0Km(){
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.TRUCK, 0)
        );
        Assertions.assertEquals("Distance should be more than 0 km", exception.getMessage());
    }
    @Test
    public void shouldReturn20ForTruckAndDistanceIs1000Km(){
        int price =  priceCalculator.calculatePrice(TransportType.TRUCK, 10000);
        Assertions.assertEquals(50000, price);
    }
    @Test
    public void tryToPickUnsupportedException(){
        UnsupportedOperationException un = Assertions.assertThrows(
                UnsupportedOperationException.class,
                generateExecutable(TransportType.DRONE, 0)
        );
        Assertions.assertEquals("transport type '" + TransportType.DRONE + "' is not handled correctly", un.getMessage());
    }

}
