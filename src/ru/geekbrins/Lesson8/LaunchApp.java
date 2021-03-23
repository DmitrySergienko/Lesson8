package ru.geekbrins.Lesson8;

public class LaunchApp {

    public static void main(String[] args) {
	Treadmill treadmill  = new Treadmill(10);
    Wall wall = new Wall(2);

        treadmill.treadInfo();
        wall.wallInfo();
        overAchive();
    }
    public static void overAchive(){
        Competition[] competitions = new Competition[3];
        competitions[0] = new Human("Саша", 42, 10);
        competitions[1] = new Cat("Мурзик", 5, 20);
        competitions[2] = new Robot("ВасяРобот", 10, 15);

        Obstacle[] obstacles = new Obstacle[2];
        Obstacle t = new Treadmill(10);
        Obstacle w = new Wall(2);
        obstacles[0] = t;
        obstacles[1] = w;

        for(int i = 0; i < competitions.length; i++) {
            for(int j = 0; j < obstacles.length; j++) {

                if (obstacles[j] instanceof Wall) {
                     competitions[i].jump((Wall) obstacles[j]);
                }
                if (obstacles[j] instanceof Treadmill) {
                    competitions[i].run((Treadmill) obstacles[j]);
               }
            }
        }
    }
 }
