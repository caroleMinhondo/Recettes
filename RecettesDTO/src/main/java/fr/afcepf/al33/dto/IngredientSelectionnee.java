package fr.afcepf.al33.dto;

import java.io.Serializable;

public class IngredientSelectionnee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private int quantite;
	private String unite;
	private String nom;
	
	public IngredientSelectionnee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IngredientSelectionnee(Integer id, int quantite, String unite, String nom) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.unite = unite;
		this.nom = nom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "IngredientSelectionnee [id=" + id + ", quantite=" + quantite + ", unite=" + unite + ", nom=" + nom
				+ "]";
	}
	
	
	
	
}
