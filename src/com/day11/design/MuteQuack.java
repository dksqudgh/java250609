package com.day11.design;
//QuackBehavior qb = new MuteQuack();
//API활용 능력
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("무음");
    }
}
