package ru.geekbrins.Lesson8;

public class Treadmill implements Obstacle{
    public int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void achieveRun(int l) {


    }

    public void treadInfo(){
        System.out.println("___________________________________\nДлина дорожки: " + length + " метров.");
    }

    @Override
    public void overcome(int l) {
    }

    @Override
    public void wallInfo() {

    }
}
