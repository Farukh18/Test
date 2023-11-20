package optionall;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Warehouse {
    private List<Candy> candies;

    public Warehouse() {
        this.candies = List.of(
                new Candy("Мишка в лесу", 32, 2, Set.of("Мишка косолапый")),
                new Candy("Трюфель", 44, 5, Set.of("Трюфель классический", "Трюфель шоколадный")));
    }

    // Ищет конфеты на складе по их названию
    // Возвращает пустой Optional, если конфеты отсутствуют
    // или в обратном случае Optional, содержащий соответствующие конфеты
    public Optional<Candy> search(String name) {
        return candies.stream()
                .filter(candy -> candy.name.equals(name) || candy.alternativeNames.equals(name))
                .findFirst();


    }

}
