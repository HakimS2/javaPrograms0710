package CommonTestPrograms;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {10,20,20,30,40,50,50,60,60};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("found duplicate :" + arr[i]);
				}
			}
		}
	}

}
