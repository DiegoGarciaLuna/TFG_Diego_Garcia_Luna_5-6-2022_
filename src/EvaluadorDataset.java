
public class EvaluadorDataset {
	
	private int Legal;
	private int Acces;
	private int Technical;
	private int Standar;
	private int Geo;
	private int Freq;
	private int Dissemination;
	private int Reputation;
	
	
	
	
	




	public EvaluadorDataset(int legal, int acces, int technical, int standar, int geo, 
			int freq, int dissemination,int reputation) {
		super();
		this.Legal = legal;
		this.Acces = acces;
		this.Technical = technical;
		this.Standar = standar;
		this.Geo = geo;
		this.Freq = freq;
		this.Dissemination = dissemination;
		this.Reputation = reputation;
	}









	public void run() {
		
		int Leg =0;
		int Acc=0;
		int Tech=0;
		int Std=0;
		int G=0;
		int Fr=0;
		int dis =0;
		int Rep =0;
		
		
		int ContL=this.Legal;
		int ContA=this.Acces;
		int ContT=this.Technical;
		int ContS=this.Standar;
		int ContG=this.Geo;
		int ContF=this.Freq;
		int ContD=this.Dissemination;
		int ContR=this.Reputation;
		
		
		int Total =0;
		
		while(ContL !=0) {
			Leg=Leg+ContL;
			ContL--;
		}
		
		while(ContA !=0) {
		Acc=Acc+ContA;
		ContA--;
	}
		
		while(ContT !=0) {
		Tech=Tech+ContT;
		ContT--;
	}
		
		while(ContS !=0) {
		Std=Std+ContS;
		ContS--;
	}
		
		while(ContG !=0) {
		G=G+ContG;
		ContG--;
	}
		
		while(ContF !=0) {
		Fr=Fr+ContF;
		ContF--;
	}
		
		while(ContD !=0) {
		dis=dis+ContD;
		ContD--;
	}
		
		while(ContR !=0) {
		Rep=Rep+ContR;
		ContR--;
	}
		
		
	
		Total= Leg+Acc+Tech+Std+G+Fr+dis+Rep;
		
		
		System.out.println("El valor de Meloda 5 es:" +Total);
		if(Total<24) {
			System.out.println("El conjunto de datos tiene un nivel INADECUADO");
		}else if(Total<48) {
			System.out.println("El conjunto de datos tiene un nivel BÁSICO");
		}else {
			System.out.println("El conjunto de datos un nivel AVANZADO");
		}
		
	
	}
	
	

}
