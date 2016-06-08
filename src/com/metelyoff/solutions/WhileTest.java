package com.metelyoff.solutions;

class WhileTest{

	int putGet(boolean s,int n){
		System.out.println("Stop while number is: "+n);
		int i=0;
		while(s=true){
			if(i==n){
				s=false;
			}
			else{
			System.out.println(i++);
			}
		}
		return i;
	}

    public static void main(String[] args){
    	WhileTest wt=new WhileTest();
		wt.putGet(false,12);
    }
}
