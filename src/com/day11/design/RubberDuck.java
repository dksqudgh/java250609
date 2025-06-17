package com.day11.design;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("고무오리");
    }
}
