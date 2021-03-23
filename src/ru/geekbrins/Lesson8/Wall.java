package ru.geekbrins.Lesson8;

public class Wall implements Obstacle{
    public int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(int h){

    }

    public void wallInfo(){
        System.out.println("Высота стены: " + height + " метров. \nНа старт! Внимание! Марш!\n___________________________________");
    }

    @Override
    public void achieveRun(int l) {
    }

    @Override
    public void treadInfo() {
    }

}
