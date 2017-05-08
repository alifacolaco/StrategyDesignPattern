package com.math;

/**
 * Created by SG0227814 on 5/3/2017.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
