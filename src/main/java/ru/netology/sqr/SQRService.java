package ru.netology.sqr;

public class SQRService {
    public int squareCount(int min, int max) {
        int counter = 0;

        //бежим по циклу перебирая значения в интервале
        for (int i = 10; i <= 99; i++) {

            // проверяем условие попаданя квадратов чисел в заданный диапазон
            if (i * i >= min & i * i <= max) {

                //при выпадании числа, удовлетворяющего условиям, увеличиваем счетчик на единицу
                counter++;
            }
        }
        return counter;
    }
}


