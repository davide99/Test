
public class Studente {
	private String nome, cognome, classe, dataN;

	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getDataN() {
		return dataN;
	}

	public void setDataN(String dataN) {
		this.dataN = dataN;
	}

	public String toString() {
		String s = "*Studente*\n";
		s += "Nome: " + nome + "\n";
		s += "Cognome: " + cognome + "\n";
		s += "Classe: " + classe + "\n";
		s += "Data di nascita: " + dataN;

		return s;
	}

}
