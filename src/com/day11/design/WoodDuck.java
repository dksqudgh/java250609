package com.day11.design;

public class WoodDuck extends Duck{
    public WoodDuck(){
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("나무오리");
    }
}
