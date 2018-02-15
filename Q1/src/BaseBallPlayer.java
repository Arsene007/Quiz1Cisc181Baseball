
public class BaseBallPlayer {
	
	
	private String firstname;
	private String lastname;
	private int Hits;
	private int AB;
	private int BB;
	private int HBP;
	private int runs;
	private int dbl; 
	private int triple;
	private int HR;

	
	

	public BaseBallPlayer(String firstname, String lastname, int hits, int aB, int bB, int hBP, int runs, int dbl,
			int triple, int hR) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		Hits = hits;
		AB = aB;
		BB = bB;
		HBP = hBP;
		this.runs = runs;
		this.dbl = dbl;
		this.triple = triple;
		HR = hR;
	}

	public double BattingAverage(){
		return Double.valueOf(Hits) / Double.valueOf(AB);
		
				
	}
	
	public double OnBasePercentage() {
		return  Double.valueOf(Hits + BB + HBP)/Double.valueOf(AB + BB + HBP);
		
	}
	
	public double TotalBases() {
		return  (1*Singles()) + (2*dbl) + (3*triple) + (4*HR);
	}
	
	public double SluggingPercentage() {
		return  TotalBases()/AB;
		
	}
	
	public double OnBS() {
		return  OnBasePercentage() + SluggingPercentage();
		
	}
	
	
	public double Singles() {
		return  Hits - (dbl + triple + HR);
			}
	
			
	}