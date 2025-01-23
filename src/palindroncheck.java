
import java.util.Scanner;

public class palindroncheck {

    // Метод для проверки палиндрома (итеративный способ)
    public static void main(String[] str) {
        // Приводим строку к нижнему регистру и убираем пробелы и знаки препинания
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0; // Указатель на начало строки
        int right = str.length() - 1; // Указатель на конец строки

        // Итеративно проверяем символы с обеих сторон строки
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Если символы не совпадают, строка не палиндром
            }
            left++;  // Сдвигаем указатель влево
            right--; // Сдвигаем указатель вправо
        }
        return true; // Строка является палиндромом
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово, число или предложение: ");
        String input = scanner.nextLine();

        // Проверяем, является ли введённая строка палиндромом
        if (checkPolindroma(input)) {
            System.out.println("Это палиндром!");
        } else {
            System.out.println("Это не палиндром.");
        }

        scanner.close();
    }
}
