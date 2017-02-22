
public class Test {
	private Domanda[] domande;

	public Test(int num) {
		domande = new Domanda[num];
	}

	public void addDomanda(Domanda d) {
		for (int i = 0; i < domande.length; i++)
			if (domande[i] == null) {
				domande[i] = d;
				break;
			}
	}

	public Domanda getDomanda(int pos) {
		try {
			return domande[pos];
		} catch (Exception e) {
			return null;
		}
	}

	public int getNum() {
		return domande.length;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < domande.length; i++)
			s += domande[i].toString() + "\n\n";
		
		return s;
	}
}
