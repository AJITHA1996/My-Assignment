package week1;

public class fibonacciSeries {

	public static void main(String[] args) {
		int range=8, firstNum=0, secNum=1;
		
		
		for (int i = 1; i <=range; i++) {
			System.out.print(firstNum +",");
			int sum =firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
		}
	}

}


