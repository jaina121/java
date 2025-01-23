//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                int[] array = {1,2,3,4,5,6,34};

                // Сумма и среднее
                int sum = 0;
                for (int num : array) {
                    sum += num;
                }
                double average = (double) sum / array.length;

                // Наименьший и наибольший элементы
                int min = array[0];
                int max = array[0];
                for (int num : array) {
                    if (num < min) min = num;
                    if (num > max) max = num;
                }

                // Второй наименьший и второй наибольший элементы
                int Min2 = Integer.MAX_VALUE;
                int Max2 = Integer.MIN_VALUE;

                for (int num : array) {
                    if (num > min && num < Min2) Min2 = num;
                    if (num < max && num > Max2) Max2 = num;
                }

                // Вывод результатов
                System.out.println("Сумма: " + sum);
                System.out.println("Среднее: " + average);
                System.out.println("Наименьший: " + min);
                System.out.println("Наибольший: " + max);
                System.out.println("Второй наименьший: " + Min2);
                System.out.println("Второй наибольший: " + Max2);
            }
        }



