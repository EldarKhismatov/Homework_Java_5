package ru.netology.services;
public class Vaccination {
    public int calculate(int income, int expenses, int threshold) {
        income = 10_000;
        expenses = 3_000; // обязательные месячные траты
        threshold = 20_000; // есть возможность отдохнуть
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                    count++; // увеличиваем счётчик месяцев отдыха
                    money = (money - expenses) / 3;
            } else {
                    money = money + income - expenses;
            }
        }return count;
    }
}



