
import java.util.Scanner;
public class odev2 {
	
	public static boolean occursIn(String pattern, String str) {
		String abc="";
		int say=0;
		
		for(int i=0; i<pattern.length();i++)
		{
			if(pattern.charAt(i) != '*' ) {
				abc=abc+pattern.charAt(i);
			}
		}
		
		for(int j=0; j<abc.length(); j++) {
			for(int k=0; k<str.length(); k++) {
				if(abc.charAt(j) == str.charAt(k)) {
				say++;	
				}
			}
		}
		if(say>=abc.length()) {
			return true;
			
			}
		else {
			return false;
			}
		
	}
	
	
	
	 public static void main(String[] args) {
		 boolean snc=false;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("desen giriniz: ");
		 String dsn=sc.nextLine();
		 
		 while(true) {
			 System.out.print("Kelime veya cümle giriniz : ");
			 String k = sc.nextLine();
			 if (k.equals("exit")) {
				 System.out.println("Hoşçakal");
				 break;
				 }
			 else{
				 snc=occursIn(dsn,k);
				 if(snc==true) {
					 System.out.println(dsn +" occurs in " +k);
				 	}
				 else {
					 System.out.println(dsn +" does NOT occur in "+k);
				 	}
			 	}
		 	}		 
		 
	 }
}

