package random;
import java.util.*;

class NumberOfCellsException extends Exception{
	
	private int detailNumber;
	
	NumberOfCellsException(int detailNumber){
		this.detailNumber=detailNumber;
	}

	@Override
	public String toString() {
		return "Number of cells must be between from 1 to 4! Your number is "+detailNumber;
	}
}

class NumberRangeOfValuesException extends Exception{
	
	private int detailNumber;
	
	NumberRangeOfValuesException(int detailNumber){
		this.detailNumber=detailNumber;
	}

	@Override
	public String toString() {
		return "Number of range of the values must be between from 1 to 10! Your number is "+detailNumber;
	}
}

class GeneratorOfNums
{
	private int size;
	private int numberOfCells;
	private int rangeOfValues;
	private HashSet<String> codeNumbers;
	
	GeneratorOfNums(){
		this.numberOfCells=1;
		this.rangeOfValues=1;
		this.setSize();
	}
	
	GeneratorOfNums(int numberOfCells,int rangeOfValues) throws NumberOfCellsException, NumberRangeOfValuesException{
		this.setNumberOfCells(numberOfCells);
		this.setRangeOfValues(rangeOfValues);
		this.setSize();
	}

	private void setSize() {
		this.size=1;
		for(int i=0;i<numberOfCells;i++){
			size*=rangeOfValues;
		}
	}

	public int getSize() {
		return size;
	}
	
	public void setNumberOfCells(int numberOfCells) throws NumberOfCellsException {
		if(numberOfCells>=1&&numberOfCells<=4){
			this.numberOfCells = numberOfCells;
		}else{
			throw new NumberOfCellsException(numberOfCells);
		}
	}

	public int getNumberOfCells() {
		return numberOfCells;
	}

	public void setRangeOfValues(int rangeOfValues) throws NumberRangeOfValuesException {
		if(rangeOfValues>=1&&rangeOfValues<=10){
			this.rangeOfValues = rangeOfValues;
		}else{
			throw new NumberRangeOfValuesException(rangeOfValues);
		}
	}

	public int getRangeOfValues() {
		return rangeOfValues;
	}
	
	private boolean isContainCode(String checkCode){
		return codeNumbers.contains(checkCode);
	}
	
	private String generateCode(){
		StringBuilder code=new StringBuilder();
		for(int i=0;i<numberOfCells;i++){
			code.append(generateOne());
		}
		return code.toString();
	}
	
	private int generateOne(){
		return new Random().nextInt(rangeOfValues);
		//return (1 + (int)(Math.random() * 9));
	}
	
	private void addCodeToHashSet(){
		String tempCode=generateCode();
		while(codeNumbers.size()<size){
			if(!isContainCode(tempCode)){
				codeNumbers.add(tempCode);
			}else{
				tempCode=generateCode();
			}
		}
	}
	
	//public HashSet<String> generate(){
	public void generate(){
		codeNumbers=new HashSet<>(size);
		addCodeToHashSet();
		//return codeNumbers;
	}
	
	public String toString(){
		String result="";
		if(codeNumbers==null){
			result+="null";
		}else{
			for(String out:codeNumbers){
				result+=out+"\n";
			}
		}
		return result;
	}
}

public class GeneratorOfNumsDemoApp{
	public static void main(String... args){
		try {
			GeneratorOfNums testGenerator= new GeneratorOfNums(4, 10);
			System.out.println("The number of the values="+testGenerator.getSize());
			System.out.println("The number of cells="+testGenerator.getNumberOfCells());
			System.out.println("The range of values="+testGenerator.getRangeOfValues());
			testGenerator.generate();
			System.out.println(testGenerator.toString());
		}
		catch(NumberOfCellsException e) {
			System.err.println(e);
		}
		catch(NumberRangeOfValuesException e) {
			System.err.println(e);
		}
	}
}
