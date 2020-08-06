import java.util.Random;
public class coin{

	public static void main(String[] args) {
		Random Ran=new Random();
		
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
		
    
	}

}
