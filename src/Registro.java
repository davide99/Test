import java.util.ArrayList;

public class Registro {
	private ArrayList<RisTest> vetRis;

	public Registro(int n) {
		vetRis = new ArrayList<RisTest>(n);
	}
	
	public RisTest getRisTest(int pos){
		return vetRis.get(pos);
	}
	
	public ArrayList<RisTest> getRisTest(Studente stud){
		ArrayList<RisTest> v = new ArrayList<RisTest>();
		
		for(int i=0;i<vetRis.size();i++)
			if(vetRis.get(i).getStudente() == stud)
				v.add(vetRis.get(i));
		
		return v;
	}
	
	public ArrayList<RisTest> getRisTest(String materia){
		ArrayList<RisTest> v = new ArrayList<RisTest>();
		
		for(int i=0;i<vetRis.size();i++)
			if(vetRis.get(i).getMateria().equalsIgnoreCase(materia))
				v.add(vetRis.get(i));
		
		return v;
	}
	
	public void addRisTest(RisTest r){
		vetRis.add(r);
	}

}
