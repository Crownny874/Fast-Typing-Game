import java.util.*;
import java.time.*;
public class FPS {
	
	public static void main(String[] args) throws Exception{
		
	   List<String> list = new ArrayList<>();
	   list.add("Hell");
	   list.add("Rhinoceros");
	   list.add("Dinosaurs");
	   list.add("Motherfucker");
	   list.add("Wong");
	   list.add("Envelope");
	   list.add("Dre");
	   list.add("Rex");
	   list.add("Dragon");
	   list.add("ElectroDragon");
	   
	   Random r = new Random();
	   Collections.shuffle(list,r);
	  
	   
	for(int i = 3; i >= 1; i--) {
		 System.out.println(i);
		Thread.sleep(1000);
		if(i == 1) {
		 System.out.println("GO!!!");
		}
	 }
	  
	   for(String a : list) {
		   System.out.print(a+" ");
	   }
	   System.out.println();
	   System.out.println("To Play Game Enter The Given Output Above");
	  Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Input:");
	    String str =  sc.nextLine();
		
		int secs = LocalTime.now().getSecond();
		int len = str.length();
		int overall = len/secs;
		int wpm = overall*60;

		System.out.println("Your WPM is: "+wpm);
		} 
	}
