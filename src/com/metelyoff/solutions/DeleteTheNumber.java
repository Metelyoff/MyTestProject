package com.metelyoff.solutions;

public class DeleteTheNumber {
	
	public boolean searchNumber(int[] array, int searchNumber){
		boolean found=false;
		for(int item:array){
			if(item==searchNumber){
				found=true;
				break;
			}else{
				found=false;
			}
		}
		return found;
	}
	
	public int[] removeNumFromArray(int[] array, int deleteNum) {
		int sizeOfNewArray = array.length - 1;
		int sizeOfOldArray=array.length;
		//boolean isFound=searchNumber(array,deleteNum);
		int[] newArray = new int[sizeOfNewArray];
		int tempIndexOfArray = 0;
		for (int i=0; i < sizeOfOldArray; i++) {
			if (array[i] != deleteNum) {
				if (i == sizeOfNewArray){
					return array;
				}else{
					newArray[i] = array[i];
				}
			} else {
				tempIndexOfArray=i;
				break;
			}
		}
		System.err.println(tempIndexOfArray);
		for (int next = tempIndexOfArray; next < sizeOfNewArray; next++){
			newArray[next] = array[next + 1];
			}
		return newArray;
	}

	public int[] insertNumInArray(int[] array, int numOfIndex, int insertNum) {
		int sizeOfNewArray = array.length + 1;
		int[] newArray = new int[sizeOfNewArray];
		int tempIndex = 0;
		for (int i=0; i < sizeOfNewArray; i++) {
			if (i != numOfIndex){
				if (i == array.length){
					return array;
				}else{
					newArray[i] = array[i];
					}
			}else {
				newArray[numOfIndex] = insertNum;
				tempIndex=i;
				break;
			}
		}
		System.out.println("tempIndex="+tempIndex);
		for(int next=tempIndex+1;next<sizeOfNewArray;next++){
			newArray[next]=array[next]; 
		}
		return newArray;
	}

	public static void main(String args[]) {
		DeleteTheNumber del = new DeleteTheNumber();
		int[] testArray = { 1, 2, 3, 4, 5, 6, 7 };
		int[] delArray = del.removeNumFromArray(testArray, 3);
		int[] insArray = del.insertNumInArray(delArray, 6, 99);
		System.out.println("array before any manipulation:");
		for (int t : testArray)
			System.out.print(t + " ");
		System.out.println("\n" + "new array after removing the element from array");
		for (int a : delArray)
			System.out.print(a + " ");
		System.out.println("\n" + "new array after inserting the element to the array");
		for (int i : insArray)
			System.out.print(i + " ");
	}
}
