import java.util.Scanner;

public class AlphabetorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		char ch=sc.next().charAt(0);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
		{
			System.out.println("alphabet");
		}
		else {
			System.out.println("not alphabet");
		}

	}

}
