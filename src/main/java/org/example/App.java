package org.example;

public class App {

    public static void main(String[] args) {

        String apple = "Яблоко";
        String pear = "Груша";
        String pineapple = "Ананас";

        String[] fruits = {apple, pear, pineapple};
        // первый вариант обьявления массива
//        fruits = new String[3];
//        fruits[0] = apple;

        // System.out.println(fruits[1]);
        // цикл будет выполняться пока i будет меньше чем длинна массива fruits
        // цикл  foreach для каждого фрукта из массива фруктов сделай следующее
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        
//        for(int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }


    }
}
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 3; j++) {
//                int mult = i * j;
//                // амперсант возвращает true если обе части уравнения выполняются
//                if (3 < mult && mult < 8) {
//                    System.out.println(i + " и " + j);
//                }
//            }
//        }
//        System.out.println("Вышли из цикла");
//           if (i * i > 36) {
//                System.out.println("Проход в цикле номер " + i);
//                 }



