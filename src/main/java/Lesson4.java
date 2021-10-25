import java.util.Scanner;
import java.util.Random;

public class Lesson4 {
    // Полностью разобраться с кодом, попробовать переписать с нуля,
    // стараясь не подглядывать в методичку.
    // Переделать проверку победы, чтобы она не была реализована просто набором условий,
    // например, с использованием циклов.

    public  static char[][] map;
    public static  int size;
    public static Scanner scan = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args){
        size = 3;
        map = new char[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                map[i][j] = '_';
            }
        PrintMap();
        while (true){
            MyTurn();
            if (isWin('x')) {
                System.out.println("You are winner!!!");
                break;
            }
            if (!isTurnExist()) {
                System.out.println("No more turn...");
                break;
            }

            ComTurn();
            if (isWin('x')) {
                System.out.println("Computer is winner :(");
                break;
            }
            if (!isTurnExist()) {
                System.out.println("No more turn...");
                break;
            }
        }
    }

    // Проверка правильности выбора ячейки
    public static boolean isCorrect(int x, int y){
        return !(x < 0 || x >= size || y < 0 || y >= size);
    }

    // Мой ход
    public static void MyTurn(){
        int x, y;
        do {
            System.out.println("Map [1.." + size + "] - Enter X and Y: ");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while(!isCorrect(x, y) && map[x][y] != '_');
        map[x][y] = 'x';
        PrintMap();
    }

    // Ход компьютера
    public static void ComTurn(){
        int x, y;
        do {
            x = rnd.nextInt(size);
            y = rnd.nextInt(size);
        } while(!isCorrect(x, y) && map[x][y] != '_');
        map[x][y] = 'o';
        System.out.println("Computer turn:");
        PrintMap();
    }

    // Проверка победы
    public  static  boolean isWin(char c){
        boolean rWin, cWin;

        // Проверка по строкам и столбцам.
        for (int i = 0; i < size; i++){
            rWin = true;
            cWin = true;
            for (int j = 0; j< size; j++){
                rWin &= (map[i][j] == c);
                cWin &= (map[j][i] == c);
            }
            if (rWin || cWin) return true;
        }

        // Проверка по диагоналям
        rWin = true;
        cWin = true;
        for (int i = 0; i < size; i++){
            rWin &= (map[i][i] == c);
            cWin &= (map[i][size - 1 - i] == c);
        }
        if (rWin || cWin) return true;

        return  false;
    }

    // Проверка того, есть ли еще ходы
    public static boolean isTurnExist(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == '_') return true;
            }
        }
        return false;
    }

    // Печать карты
    public static void PrintMap(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
