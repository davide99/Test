import java.awt.*;
import javax.swing.*;

public class DomandaPanel extends JPanel {
	private JRadioButton[] r;
	private JCheckBox[] c;
	private Domanda d;

	public DomandaPanel(Domanda d, Color col) {
		super(new GridLayout(d.getNRisp() + 1, 1));
		super.add(new JLabel(d.getTesto()));
		super.setBackground(col);
		
		this.d = d;

		if (d.isRispSing()) {
			r = new JRadioButton[d.getNRisp()];
			ButtonGroup bg = new ButtonGroup();

			for (int i = 0; i < d.getNRisp(); i++) {
				r[i] = new JRadioButton(d.getRisposte()[i]);
				r[i].setOpaque(false);
				bg.add(r[i]);
				super.add(r[i]);
			}
		} else {
			c = new JCheckBox[d.getNRisp()];

			for (int i = 0; i < d.getNRisp(); i++) {
				c[i] = new JCheckBox(d.getRisposte()[i]);
				c[i].setOpaque(false);
				super.add(c[i]);
			}
		}
	}

	public boolean isCorretta() {
		boolean[] corrette = new boolean[d.getNRisp()];

		if (d.isRispSing())
			for (int i = 0; i < d.getNRisp(); i++)
				corrette[i] = r[i].isSelected();
		else
			for (int i = 0; i < d.getNRisp(); i++)
				corrette[i] = c[i].isSelected();

		return d.isCorretta(corrette);
	}

}
