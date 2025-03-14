package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        // Получаем стек вызовов
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        // stackTrace[0] — это метод printMethodName, stackTrace[1] — это метод main,
        // stackTrace[2] — это метод, который вызвал main (если это было в другом контексте).
        String methodName = stackTrace[2].getMethodName(); // Получаем имя метода, который вызвал printMethodName

        // Выводим имя метода, который вызвал printMethodName
        System.out.print(methodName);
    }
}