package modul6_task1;

import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        System.out.println("Input name: ");
        final  Scanner scanner = new Scanner(System.in);
        try {
            final int number = scanner.nextInt();
            if (number <0){
                throw new NegativeNumberException(number);
            }

        }catch (IllegalStateException ex){   //Сигналы, что метод был вызван в недопустимое или несоответствующее время. Другими словами среда Java или приложение Java не находятся в соответствующем состоянии для требуемой работы.
            System.out.println("[Error] : Метод был вызван в недопустимое или несоответствующее время");
        } catch (NegativeNumberException e) {
            System.out.println("[Error] : Input whole number!");
        }

    }

}
