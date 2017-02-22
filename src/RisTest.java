
public class RisTest {
	private String dataS;
	private int punti;
	private String materia;
	private Studente stud;

	public RisTest(String dataS, int punti, String materia, Studente stud) {
		this.dataS = dataS;
		this.punti = punti;
		this.materia = materia;
		this.stud = stud;
	}
	
	public String getDataS(){
		return dataS;
	}
	
	public int getPunti(){
		return punti;
	}
	
	public String getMateria(){
		return materia;
	}
	
	public Studente getStudente(){
		return stud;
	}
}