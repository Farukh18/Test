package testEnvironment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;

public class FortuneCookieControllerTest {
    private static FortuneCookieController goodFactory;
    private static FortuneCookieController badFactory;

    @BeforeAll
    public static void beforeAll(){
        goodFactory = new FortuneCookieController(
                new FortuneCookieFactory(
                        new FortuneConfig(true),
                        singletonList("positive"),
                        singletonList("negative")
                )
        );

        badFactory = new FortuneCookieController(
                new FortuneCookieFactory(
                        new FortuneConfig(false),
                        singletonList("positive"),
                        singletonList("negative")
                )
        );
    }
    @Test
    public  void shouldReturnPositiveFortune() {
        Assertions.assertEquals("positive", goodFactory.tellFortune().getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune(){
        Assertions.assertEquals("negative", badFactory.tellFortune().getFortuneText());
    }
}
