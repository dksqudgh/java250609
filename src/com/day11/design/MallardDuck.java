package com.day11.design;

public class MallardDuck extends Duck {
    //오리라는 추상클래스의 실제 구현체 클래스이다.
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("청둥오리");
    }
}
