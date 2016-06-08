package com.metelyoff.solutions;

public class ArrayOfIntegers
{
	private int[] currentArray;
	private int sizeOfCurrentArray;
	private int[] newArray;
	private int sizeOfNewArray;
	private int tempIndex;
	private int startCopyFromIndex;
	private int moveIndexOn;
	
	ArrayOfIntegers(int[] array){
		this.currentArray=array;
		this.sizeOfCurrentArray=currentArray.length;
		this.newArray=currentArray;
		this.sizeOfNewArray=newArray.length;
		this.tempIndex=0;
		this.startCopyFromIndex=0;
		this.moveIndexOn=0;
	}
	
	public boolean searchValue(int value){
		boolean found=false;
		for(int items:currentArray){
			if(items==value){
				found=true;
				break;
			}else{
				found=false;
			}
		}
		System.out.println("searchValue = "+found);
		return found;
	}
	
	public boolean searchIndex(int index){
		boolean foundIndex=false;
		for(int i=0;i<sizeOfCurrentArray;i++){
			if(i==index){
				foundIndex=true;
				break;
			}else{
				foundIndex=false;
			}
		}
		return foundIndex;
	}
	
	public int getValueByIndex(int index){
		int value=0;
		for(int i=0;i<sizeOfCurrentArray;i++){
			if(i==index){
				value=newArray[i];
				break;
			}
		}
		return value;
	}
	
	public int getIndexByValue(int value){
		int indexOfValue=0;
		for(int index=0;index<sizeOfCurrentArray;index++){//sizeOfNewArray
			if(newArray[index]==value){
				indexOfValue=index;
				break;
			}else{
				indexOfValue=-1;
			}
		}
		return indexOfValue;
	}
	
	private void copyElementsBeforeIndexOfCurrentArray(){
		for(int i=0;i<tempIndex;i++){
			newArray[i]=currentArray[i];
		}
	}
	
	private void copyElementsAfterIndexOfCurrentArray(){
		for(int i=startCopyFromIndex;i<sizeOfNewArray;i++){
			int indexOfCurrentArray=i+moveIndexOn;
			newArray[i]=currentArray[indexOfCurrentArray];
		}
	}

	private void inicializationArrayForInsert(){
		sizeOfNewArray+=1;
		newArray=new int[sizeOfNewArray];
		moveIndexOn-=1;
		startCopyFromIndex=tempIndex+1;
	}
	
	public void insertValueByIndex(int index, int value){
		tempIndex=index;
		inicializationArrayForInsert();
		if(searchIndex(index)){
			copyElementsBeforeIndexOfCurrentArray();
			newArray[index]=value;
			copyElementsAfterIndexOfCurrentArray();
		}else{
			newArray=currentArray;
		}
		setDefaultValues();
	}

	private void inicializationArrayForDelete(){
		sizeOfNewArray-=1;
		newArray=new int[sizeOfNewArray];
		moveIndexOn+=1;
		startCopyFromIndex=tempIndex;
	}
	
	public void deleteByValue(int value){
		tempIndex=getIndexByValue(value);
		inicializationArrayForDelete();
		if(searchIndex(tempIndex)){
			copyElementsBeforeIndexOfCurrentArray();
			copyElementsAfterIndexOfCurrentArray();
		}else{
			newArray=currentArray;
		}
		setDefaultValues();
	}
	
	private void setDefaultValues(){
		currentArray=newArray;
		startCopyFromIndex=0;
		moveIndexOn=0;
		sizeOfCurrentArray=currentArray.length;
	}
	
	public void displayItems(){
		for(int items:newArray){
			System.out.print(items+" ");
		}
	}

	public String toString(){
		String description="";
		description+="current array length = "+sizeOfCurrentArray;
		description+="\nnew array length = "+sizeOfNewArray;
		description+="\ntemp of index = "+tempIndex;
		description+="\nsearch index in array = "+searchIndex(tempIndex);
		return description;
	}
}
