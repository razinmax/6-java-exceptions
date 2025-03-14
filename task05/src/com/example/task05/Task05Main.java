package com.example.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args) {
        String pathToFile = args[0]; // Путь к файлу, переданный через аргумент

        try {
            // Пробуем считать содержимое файла
            String content = readFile(pathToFile);
            System.out.println(content);  // Выводим содержимое файла в консоль
        } catch (FileNotFoundException e) {
            System.out.println("файл \"" + pathToFile + "\" не найден");
        } catch (IOException e) {
            System.out.println("произошла ошибка при чтении файла \"" + pathToFile + "\"");
        }
    }

    public static String readFile(String pathToFile) throws IOException {
        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();
        String currentLine;
        while ((currentLine = bufferedReader.readLine()) != null) {
            stringBuilder.append(currentLine); // Добавляем строку к содержимому
            stringBuilder.append("\n");
        }
        bufferedReader.close(); // Закрытие потока

        return stringBuilder.toString();  // Возвращаем содержимое файла
    }
}