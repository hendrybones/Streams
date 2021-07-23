package com.pluralsight.calcengine;

import java.math.BigInteger;

public class HexDecimal extends BinaryCalculator implements BinaryInterface{
    private  MiddlePerson person;



    public HexDecimal() {

        this.person = new MiddlePerson();

    }


    @Override
    public String toString() {
        return "HexDecimal{" +
                "a='" +this.person.getA() + '\'' +
                ", b='" +this.person.getB() + '\'' +
                '}';
    }

    // calculate methods
    @Override
    public String add(String a, String b) {
       int num1=Integer.parseInt(a,16);
       int num2=Integer.parseInt(b, 16);
       int sum=num1 + num2;
        return Integer.toHexString(sum);
    }

    @Override
    public String subTract(String a, String b) {
//        BigInteger number1= new BigInteger(String.valueOf(a),16);
//        BigInteger number2= new BigInteger(String.valueOf(b),16);
//        BigInteger sum=number2.subtract(number1);
//        return Double.parseDouble(sum.toString((2)));
        int num1=Integer.parseInt(a,16);
        int num2=Integer.parseInt(b, 16);
        int sum=num1 - num2;
        return Integer.toHexString(sum);

    }

    @Override
    public String multi(String a, String b) {
        int num1=Integer.parseInt(a,16);
        int num2=Integer.parseInt(b, 16);
        int sum=num1 * num2;
        return Integer.toHexString(sum);
    }

    @Override
    public String divide(String a, String b) {
     int num1=Integer.parseInt(a,16);
       int num2=Integer.parseInt(b, 16);
       int sum=num1 / num2;
       return Integer.toHexString(sum);


    }
}