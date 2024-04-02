public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возвраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возвраст человека равен " + age + ", он не достиг совершеннолетия");
        }
        // Задача 2
        int temperature = 4;
        if ( temperature >= 5 ) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        // Задача 3
        int speed = 54;
        if ( speed > 60) {
            System.out.println("Если скорость " + speed + ", то придеться заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
        // Задача 4
        int agePeople = 24;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возвраст человека равен " + agePeople + ", то ему нужно ходить в садик");
        } else if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возвраст человека равен " + agePeople + ", то ему нужно ходить в школу");
        } else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возвраст человека равен " + agePeople + ", то ему нужно ходить в университет");
        } else if (agePeople > 24) {
            System.out.println("Если возвраст человека равен " + agePeople + ", то ему нужно ходить на работу");
        }
        // Задача 5
        int ageChildren = 7;
        if (ageChildren < 5) {
            System.out.println("Если возвраст ребенка равен " + ageChildren + ", то ему нельзя кататься на аттракционе");
        } else if (ageChildren > 5 && ageChildren < 14) {
            System.out.println("Если возвраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе в сопровождении");
        } else if (ageChildren > 14) {
            System.out.println("Если возвраст ребенка равен " + ageChildren + ", то ему можно кататься без сопровождения");
        }
        // Задача 6
        int carriageCapacity = 90;
        int seatPlace = 60;
        if (seatPlace < 60 && carriageCapacity < 102) {
            System.out.println("В вагоне есть сидячие места");
        } else if (seatPlace == 60 && carriageCapacity < 102) {
            System.out.println("В вагоне только стоячие места");
        }  else if (seatPlace == 60 && carriageCapacity >= 102){
            System.out.println("Вагон полностью забит");
        }
        // Задача 7
        int one = 1909;
        int two = 26;
        int three = 97;
        if (one > two && one > three){
            System.out.println("Первое число больше");
        } else if (two > one && two > three) {
            System.out.println("Второе число больше");
        } else if (three > one && three > two) {
            System.out.println("Третье число больше");
        }
    }
    }