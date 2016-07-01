package solutions;

public class TestReturn
{
	int returnMethod(){
		//return 1;
		try{
			return 2;
		}finally{
			return 3;
		}
		//return 0;
	}
}
