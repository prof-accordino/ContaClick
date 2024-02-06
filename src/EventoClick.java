import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class EventoClick implements ActionListener 
{
	JLabel label;
	int contatore;
	
	public EventoClick(JLabel label)
	{
		this.label = label;
		this.contatore = 0;
	}	

	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		contatore ++;
		label.setText("Numero click: " + contatore);
	}

}
