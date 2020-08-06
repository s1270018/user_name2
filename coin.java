import java.util.Random;
import java.util.Scanner;
public class coin{

	public static void main(String[] args) {
		Random Ran=new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Who are you?");
		System.out.print(">");
		String str = scan.next();
		System.out.println("Hello, "+str+"!");
		int i,w=0,l=0;
		for(i=1;i<=3;i++) {
			System.out.print("Round "+i+": ");
			if(Ran.nextInt(2)==1) {
				System.out.println("Heads");
				w++;
			}else {
				System.out.println("Tails");
				l++;
			}
		}
		System.out.println("Heads: "+w+", Tails: "+l);
		if(w>l){System.out.println("you"+" won!");
		}else{System.out.println("you"+" lost!");}
	}

}
