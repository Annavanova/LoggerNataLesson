## LoggerNataLesson
### Задача «Логгер»
#### Описание
В этом задании попрактикуемся с шаблоном Singleton (Одиночка). Мы пишем программу, которая будет каждый свой шаг обильно логгировать в консоль, но не напрямую через System.out.println, а через объект-логгер нашего собственного класса-синглтона.

1. Функционал программы
2. Программа здоровается с пользователем, просит ввести два числа: размер списка N и верхнюю границу значений элементов в списке M.
3. Программа создаёт список ArrayList из N элементов и заполняет их случайными числами от 0 до M.
4. Программа просит пользователя ввести число f для фильтрации списка.
5. Программа создаёт объект filter вашего класса Filter, передав в конструктор значение f
6. Программа вызывает у filter метод List<Integer> filterOut(List<Integer> list), передавая созданный случайный список в качестве параметра и принимая в качестве ответа список, который идентичен исходному, если пропустить элементы меньше f
7. Программа выводит итоговый список на экран и завершает свою работу
