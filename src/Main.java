//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     System.out.println("Домашнее Задание");
     System.out.println("Задание №1");
        int age = 19;

        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + " то он не совершеннолетний нужно немного подождать");
        }

        System.out.println("Задание №2");
        int degree = 10;
        if (degree > 5 || degree < 5){
            System.out.printf("На улице " + degree + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + degree + " градусов, нужно надеть шапку");
        }

        System.out.println("Задание №3");
        int speed = 78;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
        if (speed < 60){
            System.out.println("Ecли скорость " + speed + " то можно ездить спокойно");
        }

        System.out.println("Задание №4");
        int age1 = 32;
        if (age1 > 2 && age1 < 6){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        }
        if (age1 > 7 && age1 < 17){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 < 24){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        }
        if (age1 > 24){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
        }


        System.out.println("Задание №5");
        int kidAge = 8;
        if (kidAge < 5){
            System.out.println("Если возраст ребенка равен " + kidAge + " то ему нельзя кататься на аттракционе");
        }
        if (kidAge > 5 || kidAge <= 14){
            System.out.println("Если возраст ребенка равен " + kidAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (kidAge > 14){
            System.out.println("Если возраст ребенка равен " + kidAge + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задание №6");
        int place = 0;
        if (place  >  60) {
            System.out.println("Если место под номером " + place  +   ", то   место стоячее");
        }
        if (place  <= 60 && place != 0) {
            System.out.println("Если место под номером " + place + ", то   место сидячее");
        }   else {
            System.out.println("Если мест " + place +  ", то вагон уже полностью забит ");
        }

        System.out.println("Задание №7");

        int one = 30;
        int two = 340;
        int three = 67;

        if (one > two && one > three) {
            System.out.println("Максимальное число равное " + one);
        }
        else if (two > one && two > three) {
            System.out.println("Максимальное число равное " + two );
        }
        else if  (three > one && three > two) {
            System.out.println("Максимальное число равное " + three);
        }



        


    }
    }
