package org.example;

public class MathService {

     public int calculateSqrtCeil(int number) {
            for (int i = 0; i <= number; i++) {
                if (i * i >= number) {
                    return i;
                }
            }
            return 0;
        }
    }
