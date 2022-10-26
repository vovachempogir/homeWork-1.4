public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println(" Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        }
        if (age < 18) {
            System.out.println("Ты не можешь водить");
        }
        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Ты можешь водить");
        }
        if (age1 < 18) {
            System.out.println("Ты не можешь водить");
        }
        //Задача 2
        System.out.println(" Задача 2");
        int agePeople = 26;
        if (agePeople >= 7 && agePeople < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (agePeople >= 18 && agePeople < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        if (agePeople >= 24) {
            System.out.println("Человек закончил университет и пора искать первую работу");
        }
        //Задача 3
        System.out.println(" Задача 3");
        int seatPlace = 100;
        if (seatPlace >= 60) {
            System.out.println("Сидячие места есть");
        }
        if (seatPlace < 61 && seatPlace <= 102) {
            System.out.println("Сидячих мест нет");
        }
        //Задача 5
        System.out.println(" Задача 4");
        int age2 = 19;
        if (age2 >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            if (age2 < 18)
                System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        int age3 = 17;
        if (age3 >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            if (age3 < 18)
                System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        // Задача 6
        System.out.println(" Задача 6");
        int agePeople2 = 40;
        if (agePeople2 >= 7 && agePeople2 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else {
            if (agePeople2 >= 18 && agePeople2 < 24) {
            } else {
                if (agePeople2 >= 24) {
                    System.out.println("человек окончил университет и ему пора искать первую работу");
                }
            }
        }
        //Задача 7
        System.out.println(" Задача 7");
        int allSeat = 106;
        if (allSeat <= 60) {
            System.out.println("сидячие места");
        } else {
            if (allSeat < 61 && allSeat < 102) {
                System.out.println(" Сидячих мест нет");
            } else {
                if (allSeat >= 102) {
                    System.out.println("Мест нет");
                }
            }
        }
        //Задача 8
        System.out.println(" Задача 8");
        int years = 15;
        boolean goToKindergarten = years >= 2 && years <= 6;
        boolean goToSchool = years >= 7 && years <= 18;
        boolean goToUniversity = years >= 19 && years <= 24;
        boolean goToWork = years >= 25;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад");
        } else {
            if (goToSchool) {
                System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу");
            } else {
                if (goToUniversity) {
                    System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в университет");
                } else {
                    if (goToWork) {
                        System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить на работу");
                    }
                }
            }
        }
        //Задача 9
        System.out.println(" Задача 9");
        int year = 9;
        boolean cantRide = year < 5;
        boolean rideWithAdult = year > 5 && year < 14;
        boolean canRide = year > 14;
        if (cantRide) {
            System.out.println("Не может кататься");
        }else{
            if (rideWithAdult) {
                System.out.println("Может кататься со взрослыми");
            }else {
                if (canRide) {
                    System.out.println("Может кататься");
                }
            }
        }
        //Задача 10
        System.out.println(" Задача 10");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two){
            System.out.println("Второе значение больше");
        }else{
            if(two < three) {
                System.out.println("третье значеиние больше");
                }
        }
    }
}