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

    private static void task1(){
    System.out.println("Задание 1");
    int age = 17;
    if (age >= 18){
    System.out.println("Если возраст человека равен " + age + " , то он совершеннолений!");}
    if (age < 18){
    System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать!");}
    }

    private static void task2(){
    System.out.println("Задание 2");
    int temperature = -4;
    if (temperature <= 5){
    System.out.println("На улице " + temperature + " градуса, нужно надеть шапку!");}
    if (temperature > 5){
    System.out.println("На улице " + temperature + " градуса, можно идти без шапки!");}
    }

    private static void task3() {
    System.out.println("Задание 3");
    int speed = 70;
    if (speed > 60){
    System.out.println("Если скорость " + speed + " , то придется заплатить штраф");}
    if (speed <= 60){
    System.out.println("Если скорость " + speed + " , то можно есздить спокойно");}
    }

    private static void task4() {
    System.out.println("Задание 4");
    int age = 17;
    if (age >= 2 && age <= 6){
    System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад!");
    }else if(age >= 7 && age <= 18){
    System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу!");
    }else if(age > 18 && age <= 24){
    System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет!");
    }else if(age > 24){
    System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу!");}
    }

    private static void task5() {
    System.out.println("Задание 5");
    int age = 4;
    if (age <= 5) {
    System.out.println("Если возраст ребенка равен " + age + " , то он не может кататься на атракционах.");
    }else if(age > 5 && age < 14) {
    System.out.println("Если возраст ребенка равен " + age + " , то он может кататься на атракционах в сопровождении со взрослыми. Если взрослых нет, то кататься нельзя!");
    }else if(age > 14){
    System.out.println("Если возраст ребенка равен " + age + " , то он может кататься без сопровождения взрослых.");}
    }

    private static void task6() {
    System.out.println("задание 6");
    int train = 102; //всего мест
    int seating = 60; //сидячие места
    int standingPlaces = train - seating; // стоячие места

    int numberSeating = 60; //занято сидячих мест
    int namberStandingPlaces = 13; // занято стоячих мест
    if(numberSeating < seating){
    System.out.println("Свободно сидячих мест в автобусе: " + (seating - numberSeating));
    }else if(seating == numberSeating){
    System.out.println("Сидячих мест нет: 0");}
    if (namberStandingPlaces < standingPlaces) {
    System.out.println("Свободных стоячих мест в автобусе: " + (standingPlaces - namberStandingPlaces));
    }else if(standingPlaces == namberStandingPlaces) {
    System.out.println("Стоячих мест нет: 0");}
    boolean fullTrain = numberSeating == 60 && namberStandingPlaces == 42;
    if (fullTrain){
    System.out.println("Вагон полностью занят.");}
    }


    private static void task7() {
    System.out.println("задание 7");
    int one = 7;
    int two = 5;
    int three = 6;
    if (one > two) {
    if (one > three) {
    System.out.println("Наибольшее число: " + one);
    }else{
    System.out.println("Максимальное число: " + three);}
    }else if(two > one){
    if (two > three){
    System.out.println("Наибольшее число: "+ two);}
    else {System.out.println("Наибольшее число: "+ three);}
    }else{
    if (one>three){
    System.out.println("наибольшее число: "+ one);}
    else if(three> one){
    System.out.println("наибольшее число: "+ three);}
    }
    }
    }


