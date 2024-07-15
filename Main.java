package LoggerLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static List<Integer> randomElementInList(int sizeList, int maxElementList) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            newList.add(new Random().nextInt(maxElementList));
        }
        return newList;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int listSize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int hightList = scanner.nextInt();
        if (listSize < 0 || hightList < 0) {
            throw new IllegalArgumentException("Вы ввели не корректный размер списка или не корректную границу значений");
        }
        logger.log("Создаём и наполняем список");
        List<Integer> randomList = randomElementInList(listSize, hightList);
        System.out.println("Вот случайный список: " + randomList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int maxFilter = scanner.nextInt();
        if (maxFilter < 0) {
            throw new IllegalArgumentException("Вы ввели не корректное число");
            //System.out.println("Вы ввели не корректное число");
        }
        logger.log("Запускаем фильтрацию ");
        Filter filter = new Filter(maxFilter);
        List<Integer> outList = filter.filterOut(randomList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + outList);
        logger.log("Завершаем программу. ");

    }
}
