package com.day11.design;

public abstract class Squeak implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("삑삑");
    }
}
