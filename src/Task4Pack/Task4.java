package Task4Pack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) throws IOException {

        FileWriter TextWrite = new FileWriter("task4.txt", StandardCharsets.UTF_8);    // створюємо об'єкт FileWriter шо записує String значення в указаний файл і його кодування тексту
        TextWrite.write("Тиша, мир і лад. Десь там тоне межи скель цвіркотня цикад.");  //  через створену ссилку додаємо Стрінгове значення
        TextWrite.close();   // закриваємо ОБОВ'ЯЗКОВО потік

        FileReader TextRead = new FileReader("task4.txt");   // Створюємо об'єкт який читає файл
        Scanner read = new Scanner(TextRead);   // Зчитуємо через Сканер наш файл
        System.out.print(read.nextLine());   // Виводимо в консоль значення яке ми завели через FileWriter
        TextRead.close();     // закриваємо ОБОВ'ЯЗКОВО потік

    }
}
