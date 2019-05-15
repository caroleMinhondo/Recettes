package fr.afcepf.al33.dto;

import java.io.Serializable;
import java.util.List;

public class RecetteSelectionnee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nom;
	private String imageMini;
	private List<IngredientSelectionnee> IngredientSelectionnees;
	private List<EtapeRecetteSelectionnee> EtapeRecetteSelectionnees;
	
	public RecetteSelectionnee() {
		super();
	}

	public RecetteSelectionnee(Integer id, String nom, String imageMini,
			List<IngredientSelectionnee> ingredientSelectionnees,
			List<EtapeRecetteSelectionnee> etapeRecetteSelectionnees) {
		super();
		this.id = id;
		this.nom = nom;
		this.imageMini = imageMini;
		IngredientSelectionnees = ingredientSelectionnees;
		EtapeRecetteSelectionnees = etapeRecetteSelectionnees;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getImageMini() {
		return imageMini;
	}

	public void setImageMini(String imageMini) {
		this.imageMini = imageMini;
	}

	public List<IngredientSelectionnee> getIngredientSelectionnees() {
		return IngredientSelectionnees;
	}

	public void setIngredientSelectionnees(List<IngredientSelectionnee> ingredientSelectionnees) {
		IngredientSelectionnees = ingredientSelectionnees;
	}

	public List<EtapeRecetteSelectionnee> getEtapeRecetteSelectionnees() {
		return EtapeRecetteSelectionnees;
	}

	public void setEtapeRecetteSelectionnees(List<EtapeRecetteSelectionnee> etapeRecetteSelectionnees) {
		EtapeRecetteSelectionnees = etapeRecetteSelectionnees;
	}

	@Override
	public String toString() {
		return "RecetteSelectionnee [id=" + id + ", nom=" + nom + ", imageMini=" + imageMini + ", IngredientSelectionnees="
				+ IngredientSelectionnees + ", EtapeRecetteSelectionnees=" + EtapeRecetteSelectionnees + "]";
	}

	
	
}
