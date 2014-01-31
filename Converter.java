import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;



public class Converter extends JFrame {

	private JPanel contentPane;
	private JComboBox mesurDistaconvert;
	private JTextField distaconvert;
	private JLabel lLaDistanceDevient;
	private JTextField distconvertie;
	private JComboBox mesurDistconvertie;
	private JLabel errorLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter frame = new Converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Converter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{138, 0, 0, 76, 86, 52, 65, 0};
		gbl_panel.rowHeights = new int[]{23, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel Distancede = new JLabel("La distance de :");
		Distancede.setBackground(Color.CYAN);
		Distancede.setForeground(Color.RED);
		GridBagConstraints gbc_Distancede = new GridBagConstraints();
		gbc_Distancede.insets = new Insets(0, 0, 5, 5);
		gbc_Distancede.gridx = 0;
		gbc_Distancede.gridy = 0;
		panel.add(Distancede, gbc_Distancede);
		
		lLaDistanceDevient = new JLabel("Nous Donne :");
		GridBagConstraints gbc_lLaDistanceDevient = new GridBagConstraints();
		gbc_lLaDistanceDevient.anchor = GridBagConstraints.EAST;
		gbc_lLaDistanceDevient.insets = new Insets(0, 0, 0, 5);
		gbc_lLaDistanceDevient.gridx = 0;
		gbc_lLaDistanceDevient.gridy = 3;
		panel.add(lLaDistanceDevient, gbc_lLaDistanceDevient);
		
		errorLabel = new JLabel("New label");
		GridBagConstraints gbc_errorLabel = new GridBagConstraints();
		gbc_errorLabel.insets = new Insets(0, 0, 5, 5);
		gbc_errorLabel.gridx = 0;
		gbc_errorLabel.gridy = 2;
		panel.add(errorLabel, gbc_errorLabel);
		
		distaconvert = new JTextField();
		GridBagConstraints gbc_distaconvert = new GridBagConstraints();
		gbc_distaconvert.anchor = GridBagConstraints.WEST;
		gbc_distaconvert.insets = new Insets(0, 0, 5, 5);
		gbc_distaconvert.gridx = 1;
		gbc_distaconvert.gridy = 0;
		panel.add(distaconvert, gbc_distaconvert);
		distaconvert.setColumns(10);
		
		distconvertie = new JTextField();
		GridBagConstraints gbc_distconvertie = new GridBagConstraints();
		gbc_distconvertie.insets = new Insets(0, 0, 0, 5);
		gbc_distconvertie.fill = GridBagConstraints.HORIZONTAL;
		gbc_distconvertie.gridx = 1;
		gbc_distconvertie.gridy = 3;
		panel.add(distconvertie, gbc_distconvertie);
		distconvertie.setColumns(10);
		
		
		mesurDistaconvert = new JComboBox();
		mesurDistaconvert.setModel(new DefaultComboBoxModel(new String[] {"Km", "M", "Mm", "Miles", "Yards", "Feet"}));
		mesurDistaconvert.setBackground(Color.ORANGE);
		GridBagConstraints gbc_mesurDistaconvert = new GridBagConstraints();
		gbc_mesurDistaconvert.anchor = GridBagConstraints.WEST;
		gbc_mesurDistaconvert.insets = new Insets(0, 0, 5, 5);
		gbc_mesurDistaconvert.gridx = 2;
		gbc_mesurDistaconvert.gridy = 0;
		panel.add(mesurDistaconvert, gbc_mesurDistaconvert);
		
		mesurDistconvertie = new JComboBox();
		mesurDistconvertie.setModel(new DefaultComboBoxModel(new String[] {"Km", "M", "Mm", "Miles", "Yards", "Feet"}));
		GridBagConstraints gbc_mesurDistconvertie = new GridBagConstraints();
		gbc_mesurDistconvertie.insets = new Insets(0, 0, 0, 5);
		gbc_mesurDistconvertie.fill = GridBagConstraints.HORIZONTAL;
		gbc_mesurDistconvertie.gridx = 2;
		gbc_mesurDistconvertie.gridy = 3;
		panel.add(mesurDistconvertie, gbc_mesurDistconvertie);
		
			
		
JButton btnNewButton = new JButton("Converter");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (distaconvert.getText().isEmpty()){
					errorLabel.setText("Veuillez rentrer une distance à convertir");
				}
				else{ 
					String chaine1 = distaconvert.getText();				
					String chaine2 = (String) mesurDistaconvert.getSelectedItem();
					String chaine3 = (String) mesurDistconvertie.getSelectedItem();
					if (chaine2 == ("Km")&& (chaine3 ==("M")));
					//convert en Int
					int i = Integer.parseInt(chaine1);
					//calcul
					int resultat = i * 1000;
					//convertion en chaine avt affichage
					Integer res = new Integer (resultat);
					String chaineresultat = res.toString();
					// on affich resultat
					distconvertie.setText(chaineresultat);
					
			}}});
		
			/*mesurDistaconvert.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String input = (String) mesurDistaconvert.getSelectedItem();
					mesurDistconvertie.removeItem(input);
				}
				
		});*/
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panel.add(btnNewButton, gbc_btnNewButton);
				
	}
	

	public JComboBox getComboBox() {
		return mesurDistaconvert;
	}
}
/* for(int i=0;i<s.length();i++){ //on teste chaque caract de la chaine
				char c = s.charAt(i);
				if(!Character.isDigit(c))  //si le caract n'est pas numérique
					error = true;     // on a une erreur
					
			//jTextField1.setText("");  // on vide la zone texte
			
	double d=0;
						If 0=mesurDistconvertie.getSelectedIndex() then{
						switch(mesurDistaconvert.getSelectedIndex()){
						case 0:   // si conversion du Km vers Km
							//on affiche the same
							break;
						case 1:   // si conversion du Km vers m
							d=Double.parseDouble(jTextField1.getText())*1000;
						case 2:   // si conversion du km vers mile
							d=Double.parseDouble(jTextField1.getText())*0.62;
							break;
						case 3:   // si conversion du Km vers mm
							d= Double.parseDouble(jTextField1.getText()* 1000000 ;
							break;
						}
						d=(double) Math.round(d * 100) / 100; //on prend de chiffres aprÃ¨s la virgule
						distconvertie.setText(""+d);  // on affiche
					}	}
					else if 1 =	mesurDistconvertie.getSelectedIndex() then{	
					switch(mesurDistaconvert.getSelectedIndex()){
						case 0:   // si conversion du Km vers Km
							//on affiche the same
							break;
						case 1:   // si conversion du Km vers m
							d=Double.parseDouble(jTextField1.getText())*1000;
						case 2:   // si conversion du km vers mile
							d=Double.parseDouble(jTextField1.getText())*0.62;
							break;
						case 3:   // si conversion du Km vers mm
							d= Double.parseDouble(jTextField1.getText()* 1000000 ;
							break;
						}
						d=(double) Math.round(d * 100) / 100; //on prend de chiffres aprÃ¨s la virgule
						distconvertie.setText(""+d);  // on affiche
					}	
					else if 2 =	mesurDistconvertie.getSelectedIndex() then{	}
					else if 3 =	mesurDistconvertie.getSelectedIndex() then{	}
					else if 4 =	mesurDistconvertie.getSelectedIndex() then{	}
					else if 5 =	mesurDistconvertie.getSelectedIndex() then{	}
					else if 6 =	mesurDistconvertie.getSelectedIndex() then{	}
					
					}	
					*/
