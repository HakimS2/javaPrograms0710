package CommonTestPrograms;

public class PrintConsonantFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vowels -a, e, i, o, u
		
		String name = "Hakim";
		String consOnly = "" ;
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
			{
				consOnly =consOnly+ch;
			}
		}
		System.out.println("Consonants in strings are :"+consOnly);
		
	}

}
