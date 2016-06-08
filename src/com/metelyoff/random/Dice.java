package com.metelyoff.random;

public class Dice{
     
public int getDiceOne(int rangeDiceOne){
int resultateOneDice= (int)(0+Math.random() * rangeDiceOne);
System.out.print("["+ resultateOneDice +"] ");
  return resultateOneDice;
}

public int getDiceTwo(int rangeDiceTwo){
int resultateTwoDice=(int)(1+Math.random() * rangeDiceTwo);
System.out.print(" ["+ resultateTwoDice +"]");
  return resultateTwoDice;
}
   
    public static void main(String[] args){
    Dice d=new Dice();
    d.getDiceOne(6);
    d.getDiceTwo(6);
    System.out.println(" ");
    }

}