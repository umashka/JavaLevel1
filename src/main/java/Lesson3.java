public class Lesson3 {
    public static void main(String[] args) {
        // Задать целочисленный массив, состоящий из элементов 0 и 1.
        // С помощью цикла и условия заменить 0 на 1, 1 на 0.
        int[] numbers1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbers1.length; i++){
            numbers1[i] = (numbers1[i] == 0)? 1 : 0;
            System.out.print(numbers1[i] + ", ");
        }
        System.out.println();

        // Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
        int[] numbers2 = new int[100];
        for (int i = 0; i < numbers2.length; i++){
            numbers2[i] = i + 1;
        }
        System.out.println(numbers2[56]);

        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2
        int[] numbers3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers3.length; i++){
            if (numbers3[i] < 6)
                numbers3[i] *= 2;
            System.out.print(numbers3[i] + ", ");
        }
        System.out.println();

        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int n = 5;
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++){
                if ((i == j) || (i + j == (n - 1))) matrix[i][j] = 1;
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue
        int[] numbers5 = FillArray(10, 7);
        for (int i: numbers5) {  // <-- вот это очень забавная запись цикла по типу foreach :)
            System.out.print(i + ", ");
        }
        System.out.println();

        // Задать одномерный массив и найти в нем минимальный и максимальный элементы.
        // Не используя потоковых min и max при этом? :)))
        int[] numbers6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = numbers6[0];
        int max = numbers6[0];
        for (int i: numbers6){  // <-- пытаюсь привыкнуть к этой записи :)
            min = (i < min)? i : min;
            max = (i > max)? i : max;
        }
        System.out.println("Min = " + min + ", Max = " + max);

        // Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место,
        // в котором сумма левой и правой части массива равны
        int[] numbers7 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Balance = " + checkBalance(numbers7));

        // Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // (пока без сдвига влево)
        int[] numbers8 = {1, 2, 3, 4, 5, 6, 7};
        int[] shift_numbers81 = ShiftArray(numbers8, 3);
        for (int i: shift_numbers81) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static int[] FillArray(int len, int initialValue){
        int [] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return  arr;
    }

    public static boolean checkBalance(int [] arr){
        boolean bal = false;
        int sum = 0;
        for (int i: arr) sum += i; // это вся сумма массива

        int r_sum = 0;
        for (int i: arr) {
            r_sum += i; // это сумма с одной стороны массива (напр., правая), копим ее
            if (sum - r_sum == r_sum)  // бежим до тех пор, пока не найдем равенство разности сумм
                bal = true;
        }
        return bal;
    }

    public static int[] ShiftArray(int[] arr, int shift){
        int ni = Math.abs(shift);
        int [] res = new int[arr.length];
        if (shift > 0)
            for (int i = 0; i < arr.length; i++){
                res[i] = arr[ni];
                ni++;
                if (ni == arr.length) ni = 0;
            }
        return res;
    }
}
