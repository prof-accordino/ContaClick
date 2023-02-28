import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass extends JFrame implements ActionListener
{
	// contatore dei click
    static int count = 0; 
	// etichetta
    static JLabel label;    
    // crea il bottone
    static JButton b1 = new JButton("Incrementa");        
    // crea il bottone
    static JButton b2 = new JButton("Decrementa");
    
    public MainClass() 
    {
    	// Imposta le proprietà della finestra
        super.setTitle("Contatore di click");
        //super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(300, 200);
        super.setLocationRelativeTo(null); // centra la finestra

        // aggiunge un listener al bottone
       
        // Crea la label
        label = new JLabel("Hai cliccato " + count + " volte");
        label.setHorizontalAlignment(JLabel.CENTER);

        // aggiunge un listener al bottone
        b1.addActionListener(this); 
        b2.addActionListener(this);  
        
        // "contentPane" è il contenitore degli oggetti
        Container contentPane = super.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(b1, BorderLayout.NORTH);
        contentPane.add(b2, BorderLayout.CENTER);
        contentPane.add(label, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
    
    public static void main(String[] args) 
    {
    	/* 
    	 * Creo un'istanza, non ho bisogno di fare altro
    	 * perché la classe "JFrame" ha già dei metodi interni
    	 * che mantengono il programma in esecuzione in un
    	 * ciclo infinito
    	 */
    	
        new MainClass();
    }


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1)
			count++;
		else if(e.getSource() == b2)
			count--;
		
		label.setText("Hai cliccato " + count + " volte");
	}
}