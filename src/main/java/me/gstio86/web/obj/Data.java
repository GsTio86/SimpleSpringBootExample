package me.gstio86.web.obj;

import java.util.List;

public class Data {
    private List<Integer> nums;

    public List<Integer> getNums() {
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }

    public int getSum(){
        int sum = 0;
        for (int i : getNums()) {
            sum+=i;
        }
        return sum;
    }

    public String getSum2Json() {
        return "{\"sum\":" + getSum() + "}";
    }

}
