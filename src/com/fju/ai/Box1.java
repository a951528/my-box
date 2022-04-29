package com.fju.ai;

public class Box1 extends Box{

    public Box1() {  //建構子的名稱要跟類別名一樣==
        /*this.length = 10;
        this.width = 10;
        this.height = 10;*/
        super(10,10,10);
    }

    //??為啥這樣可以
    public String toString(){
        return "Box1";
    }

}
