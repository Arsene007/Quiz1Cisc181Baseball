import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
Scanner doit = new Scanner(System.in);
		
		System.out.println("What is Player's First Name?");
		
		String FirstName = doit.nextLine();
				
		System.out.println("What is Player's Last Name?");
		
		String LastName = doit.nextLine();
		
		System.out.println("How many hits does " + FirstName + " " + LastName +" have?");
		
		int Hits = doit.nextInt();
		
		System.out.println("How many at bats has " + FirstName + " " + LastName + " had?");
		
		int AB = doit.nextInt();

		System.out.println("How many doubles does " + FirstName + " " + LastName + " have?");
		
		int dbl = doit.nextInt();
		
		System.out.println("How many triples does " + FirstName + " " + LastName + " have?");
		
		int triple = doit.nextInt();
		
		System.out.println("How many home runs does " + FirstName + " " + LastName + " have?");
		
		int HR = doit.nextInt();
		
		System.out.println("How many runs does " + FirstName + " " + LastName + " have?");
		
		int runs = doit.nextInt();
		
		System.out.println("How many walks does " + FirstName + " " + LastName + " have?");
		
		int BB = doit.nextInt();
		
		System.out.println("How many HBP");
		
		int HBP = doit.nextInt();
		
		BaseBallPlayer Him = new BaseBallPlayer(FirstName, LastName, Hits, AB, BB, HBP, runs, dbl, triple, HR);

		
		
		System.out.println("Batting Average: " + Him.BattingAverage());
		
		System.out.println("On Base Percentage: " + Him.OnBasePercentage());
		
		System.out.println("Slugging Percentage: " + Him.SluggingPercentage());
		
		System.out.println("OBS:  " + Him.OnBS());
		
		System.out.println("Total Bases: " + Him.TotalBases());
	

}}
