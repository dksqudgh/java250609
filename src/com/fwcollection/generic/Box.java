package com.fwcollection.generic;

import com.week1.ViewChange;

//제네릭이 없는 경우(Object)
public class Box {
    private Object item;
    public void set (Object item){
        this.item = item;
    }
    public Object get(){
        return item;
    }
}
