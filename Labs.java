public class Labs {
	
	public static void main(String[] args) {
		String a = "sathya";
		String b = "thyasa";
		String c = "";
		String ac ="";
		int len = a.length();
		c = a.substring(len-2, len) + a.substring(0, len-2);
		ac = a.substring(2, len) + a.substring(0, 2);
		System.out.println(c);
		System.out.println(ac);
		if(b.equals(c) || b.equals(ac)) {
			System.out.println("String b can be obtained");
		} else {
			System.out.println("String b cannot be obtained");
		}
	}	
		
	}