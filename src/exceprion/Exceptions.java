package exceprion;

//exception 3/7
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        }catch(NullStringException  | EmptyStringException exp) {
            System.out.println("Введена пустая строка.");

        }catch(StringNotNumberException exp) {
            System.out.println("Вы ввели не целое число.");

        }catch(StringIsTooBigNumberException exp) {
            System.out.println("Введённое число слишком большое.");

        }catch(StringIsTooSmallNumberException exp) {
            System.out.println("Введённое число слишком маленькое.");
        }

    }
}
