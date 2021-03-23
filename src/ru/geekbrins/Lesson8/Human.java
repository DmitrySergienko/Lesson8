package ru.geekbrins.Lesson8;

public class Human implements Competition {
    private String name;
    private int runAbility;
    private int jumpAbility;
    private int count = 0;

    public Human(String name, int runAbility, int jumpAbility) {
        this.name = name;
        this.runAbility = runAbility;
        this.jumpAbility = jumpAbility;
    }

    @Override
    public void run(Treadmill t) {
        t.achieveRun(runAbility);
        if(count > 0){
            return;
        }
        else if (runAbility >= t.length) {
            System.out.println(name + " Пробежал дистанцию! Переходит к следующему заданию!");
            return;
        }
        System.out.println(name + " Не смог пробежать дистанцию и выбыл из соревнований!");
        count++;
        return;
    }

    @Override
    public void jump(Wall w) {
        w.overcome(jumpAbility);
        if(jumpAbility > w.height && count != 0 || jumpAbility < w.height && count != 0){
            return;
        }
        if (jumpAbility > w.height && count != 1){
            System.out.println(name + " Перепрыгнул препятствие!");
            return;
        }
        System.out.println(name + " Не смог перепрыгнуть препятствие и выбыл из соревнований!");
        return;
    }
}
