import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass 
{
    public static void main(String[] args) 
    {
    	
    	// Creo una finestra
    	JFrame frame = new JFrame("Contaclick");	
    	// Ci aggiungo un pannello (per mettere più oggetti)
    	JPanel panel = new JPanel();	
    	// Creiamo un'etichetta
        JLabel label = new JLabel("Numero di click: 0");      
        // E un bottone
        JButton button = new JButton("Incrementa");     
        // Istanzo la classe che si occupa dell'evento
        EventoClick evento = new EventoClick(label);
        
        
    	// Imposto la dimensione della finestra
    	frame.setSize(300, 200);    	
    	// Il programma deve chiudersi quando chiudo la finestra
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        // "contentPane" è il contenitore degli oggetti
        frame.add(panel);
        panel.add(button);
        panel.add(label);
        

        // aggiunge un l'evento al bottone
        button.addActionListener(evento);     
        
        frame.setVisible(true);
    }

}