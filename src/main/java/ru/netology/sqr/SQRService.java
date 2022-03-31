package ru.netology.sqr;

public class SQRService {

    public int calculateSqrService(int underRange, int upperRange) {
        int counter = 0;
        for (int i = 10; i <= 90; i++) {
            int square = i * i;
            if (underRange <= square && square <= upperRange) {
                counter++;
            }
        }
        return counter;
    }

}