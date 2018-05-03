package ca.cess.Reseau0305.Reseau0305;

import java.util.*;

public class Utilisateur extends Personne implements Relation {

	/**
	 * Les attribiuts sont en private, si on souhaite les modifier dasn une autre
	 * classe, c'est cette classe qui en prendra la "responsabilité" en lesmodifiant
	 * via les methodes publiques de la première classe Ainsi, les valeurs de base
	 * des attributs ne seront jamais exposées à des changements
	 */
	private static int userId = 0;
	ArrayList<String> users = new ArrayList<String>();
	private String nom;
	private String prenom;
	private String pays;
	private String dateNaissance;

	// TODO Auto-generated method stub

	/**
	 * constructeur de classe tous les new auront ces caractéristiques constructeur
	 * n'a pas de type de retour + même nom que classe Constructeur par défaut,
	 * chaque new user devra avoir ces infos
	 */
	public Utilisateur() {

	}

	public void setUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre nom");
		nom = sc.nextLine();
		users.add(nom);

		System.out.println("Entrez votre prénom");
		prenom = sc.nextLine();
		users.add(prenom);

		System.out.println("Entrez votre pays de résidence");
		pays = sc.nextLine();
		users.add(pays);

		System.out.println("Entrez votre date de naissance");
		dateNaissance = sc.nextLine();
		users.add(dateNaissance);

		userId++;
	}

	public ArrayList<String> getUsers() {
		return this.users;
	}

	public boolean isModerateur() {
		return false;
	}

	public void ajouterAmi() {

	}

}
