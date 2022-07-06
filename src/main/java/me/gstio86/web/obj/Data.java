package me.gstio86.web.obj;

public class Data {
    private int one;
    private int two;

    public int getOne() {
        return one;
    }
    public int getTwo() {
        return two;
    }

    public int getSum(){
        return getOne() + getTwo();
    }

    public String getSum2Json() {
        return "{\"sum\":" + getSum() + "}";
    }

}
