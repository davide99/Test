import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestFrame extends JFrame implements ActionListener {
	private JButton invia;
	private Test t;
	private JPanel pC;
	private DomandaPanel[] dp;

	public TestFrame() {
		super("Test");

		Container c = super.getContentPane();
		pC = new JPanel();
		c.add(pC);

		invia = new JButton("Invia");
		invia.addActionListener(this);
		c.add(invia, "South");

		pC = new JPanel();
		c.add(pC);

		t = new Test(4);

		Domanda d1 = new Domanda("Domanda 1", 4);
		d1.setRisp("Risposta 1");
		d1.setRisp("Risposta 2");
		d1.setRisp("Risposta 3");
		d1.setRisp("Risposta 4");
		d1.setCorrette(2);
		t.addDomanda(d1);

		Domanda d2 = new Domanda("Domanda 2", 4);
		d2.setRisp("Risposta 1");
		d2.setRisp("Risposta 2");
		d2.setRisp("Risposta 3");
		d2.setRisp("Risposta 4");
		d2.setCorrette(2);
		d2.setCorrette(3);
		t.addDomanda(d2);

		Domanda d3 = new Domanda("Domanda 3", 4);
		d3.setRisp("Risposta 1");
		d3.setRisp("Risposta 2");
		d3.setRisp("Risposta 3");
		d3.setRisp("Risposta 4");
		d3.setCorrette(0);
		t.addDomanda(d3);

		Domanda d4 = new Domanda("Domanda 4", 4);
		d4.setRisp("Risposta 1");
		d4.setRisp("Risposta 2");
		d4.setRisp("Risposta 3");
		d4.setRisp("Risposta 4");
		d4.setCorrette(2);
		d4.setCorrette(3);
		t.addDomanda(d4);

		dp = new DomandaPanel[t.getNum()];
		for(int i=0;i<dp.length;i++){
			dp[i] = new DomandaPanel(t.getDomanda(i),Color.white);
			pC.add(dp[i]);
		}

		super.setLocation(200, 200);
		super.setSize(400, 400);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int punti = 0;
		for(int i=0;i<dp.length;i++)
			if(dp[i].isCorretta())
				punti++;
		
		System.out.println(punti);
	}

	public static void main(String[] args) {
		new TestFrame();

	}

}
