public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        int age2 = 46;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age2 + " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int tempIsLow = -10;
        int tempIsHigh = 23;
        if (tempIsLow < 5) {
            System.out.println("На улице " + tempIsLow + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + tempIsLow + " градусов, можно идти без шапки.");
        }
        if (tempIsHigh < 5) {
            System.out.println("На улице " + tempIsHigh + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + tempIsHigh + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speedIsHigh = 105;
        int speedIsLow = 46;
        if (speedIsHigh > 60) {
            System.out.println("Если скорость " + speedIsHigh + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedIsHigh + " км/ч, то можно ездить спокойно.");
        }
        if (speedIsLow > 60) {
            System.out.println("Если скорость " + speedIsLow + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedIsLow + " км/ч, то можно ездить спокойно.");
        }

    }


    public static void task4() {
        System.out.println("Задача 4");
        int age2 = 1;
        if (age2 >= 2) {
            if (age2 >= 7) {
                if (age2 >= 18) {
                    if (age2 >= 24) {
                        System.out.println("Если возраст человека равен " + age2 + " то ему  нужно ходить на работу.");
                    } else {
                        System.out.println("Если возраст человека равен " + age2 + " то ему  нужно ходить в университет.");
                    }
                } else {
                    System.out.println("Если возраст человека равен " + age2 + " то ему  нужно ходить в школу.");
                }
            } else {
                System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад.");
            }
        } else {
            System.out.println("Если возраст человека равен " + age2 + " то ему  еще рано куда-то ходить.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age3 = 16;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " то ему нельзя кататься на аттракционе.");
        } else {
            if (age3 < 14) {
                System.out.println("Если возраст ребенка равен " + age3 + " то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + age3 + " то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int peopleInTheCar = 101;
        if (peopleInTheCar <= 59) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            if (peopleInTheCar <= 101) {
                System.out.println("В вагоне есть стоячие места");
            } else {
                System.out.println("В вагоне нет мест");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 3000;
        int two = 600;
        int three = 30000;
        if (one > two && one > three) {
            System.out.println(one + " - большее из чисел");
        } else {
            if (two > three) {
                System.out.println(two + " - большее из чисел");
            } else {
                System.out.println(three + " - большее из чисел");
            }
        }
    }
}




