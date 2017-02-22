public class Domanda {

	private String testo;
	private boolean[] corrette;
	private String[] risposte;

	public Domanda(String testo, int n) {
		this.testo = testo;
		risposte = new String[n];
		corrette = new boolean[n];
	}

	public String getTesto(){
		return testo;
	}

	public void setCorrette(int i) {
		corrette[i] = true;
	}
	
	public int getNRisp(){
		return risposte.length;
	}

	public void setRisp(String risp) {
		for (int i = 0; i < risposte.length; i++)
			if (risposte[i] == null) {
				risposte[i] = risp;
				break;
			}
	}

	public boolean isRispSing() {
		int n = 0;

		for (int i = 0; i < corrette.length; i++)
			if (corrette[i])
				n++;

		return (n == 1);
	}
	
	public String[] getRisposte(){
		return risposte;
	}
	
	public boolean isCorretta(boolean risp[]) {
		for(int i=0;i<risp.length;i++)
			if(risp[i]^corrette[i])
				return false;
		
		return true;
	}
}
