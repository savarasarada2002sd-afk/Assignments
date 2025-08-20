package typesofoperators;

public class ternary {

	public static void main(String[] args) {
	int a=25,b=40,c=15,d=60;
	int greatest =(a>b)
			?((a>c)
					?((a>d)? a:d)
							:((c>d)? c:d))
							:((b>c))
							?((b>d)? b:d)
									:((c>d)?c:d);
	System.out.println("Greatest number is:"+ greatest);
		
		

	}

}
