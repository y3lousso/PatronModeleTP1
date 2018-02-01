package com.TP1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class QuizzMasterServiceV1 {

	private JFrame ecran;
	private JRadioButton [] lesBoutons;
	private QuizzMaster quizzMaster;

	public QuizzMasterServiceV1(QuizzMaster quizzMaster)
	{
		this.quizzMaster = quizzMaster;

		this.ecran = new JFrame();
		lesBoutons = new JRadioButton [4];
		ecran.setSize( 450, 200 );
		this.ecran.setTitle(this.quizzMaster.getType());

		// Fermeture de la fenètre
		ecran.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent we ) {
				QuizzMasterServiceV1.this.terminer();
			}
		} );

		// Le panneau central
		JPanel panneauCentral = new JPanel( new BorderLayout() );
		ecran.add( panneauCentral );
		ActionListener listener = e -> {
            AbstractButton aButton = (AbstractButton) e.getSource();
            String message=aButton.getText();
            if(message.equals(this.quizzMaster.getChoix(this.quizzMaster.getReponse())))
                JOptionPane.showMessageDialog( ecran, "bonne réponse" );
            else
                JOptionPane.showMessageDialog( ecran, "mauvaise réponse" );
        };

		JPanel panneauQuestion= new JPanel( new FlowLayout( FlowLayout.LEADING ) );
		panneauQuestion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
		JLabel monlabel=new JLabel(this.quizzMaster.getQuestion());
		panneauQuestion.add(monlabel);
		panneauCentral.add( panneauQuestion, BorderLayout.NORTH );
		JPanel panneauChoix = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
		ButtonGroup groupe = new ButtonGroup ();
		for(int i=0; i<4; i++)
		{
			lesBoutons[i] = new JRadioButton (this.quizzMaster.getChoix(i));
			groupe.add(lesBoutons[i]);
			panneauChoix.add(lesBoutons[i]);
			lesBoutons[i].addActionListener(listener);
		}
		panneauCentral.add( panneauChoix, BorderLayout.CENTER);
	}

	public void show() {
		ecran.setVisible( true );
	}

	private void terminer() {

		this.ecran.dispose();			
		System.exit( 0 );
	}
}
