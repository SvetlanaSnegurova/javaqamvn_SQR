package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int lowerBound, int upperBound) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {
            int iSqr = i * i;
            if (iSqr >= lowerBound) {
                if (iSqr <= upperBound) {
                    result++;

                }
            }
        }
        return result;
    }
}





