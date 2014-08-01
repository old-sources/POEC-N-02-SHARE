package fr.imie.testunitaire;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.imie.test.Jeu;
import fr.imie.test.Joueur;

public class TennisTest {

	@Test
	public void testInitialisationNouveauJeu() {
		new Jeu();
	}
	
	@Test
	public void testAfficherScoreDebutDePartie() {
		Jeu jeu = new Jeu();
		assertEquals("0-0", jeu.score());
	}
	
	public void testJoueurMarquePoint(){
		Jeu jeu = new Jeu();
		Joueur joueur = new Joueur();
		joueur.scored();
		assertEquals("15-0", joueur.scored());		
		
		
	}

}
