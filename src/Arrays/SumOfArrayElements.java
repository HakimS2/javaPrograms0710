package Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Marks[] = {50,0};
		int count=0;
		
		for(int i=0;i<Marks.length;i++) {
			count=count + Marks[i];
		}
		System.out.println(count);
		
	}

}
