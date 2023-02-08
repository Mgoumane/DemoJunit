package debut;

public class Recipient {
	private int quantite;
	private int espaceLibre;
	/**
	 * Initialise un rÃ©cipient de quantitÃ© quantite et de capacitÃ© capacite.
	 * <br>Requiert quantite >= 0; quantite &lt;= capacite; 
	 * @param quantite quantitÃ©. Doit Ãªtre >= 0
	 * @param capacite capacitÃ©. Doit Ãªtre >= quantite
	 */
	public Recipient(int quantite, int capacite) {
		this.quantite = quantite;
		this.espaceLibre = capacite - quantite;
	}

	/**
	 * Nombre d'Ã©lÃ©ments dans le rÃ©cipient.
	 * <br>est >= 0; est &lt;< getCapacite()
	 * @return
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * Nombre maximal d'Ã©lÃ©ments que peut contenir le rÃ©cipient
	 * <br>est >= getQuantite()
	 * @return
	 */
	public int getCapacite() {
		return quantite + espaceLibre;
	}

	/**
	 * Nombre d'emplacements pas occupÃ©s dans le rÃ©cipient
	 * (capacitÃ© - quantitÃ©)
	 * @return
	 */
	public int getEspaceLibre() {
		return espaceLibre;
	}
	
	public boolean isPlein() {
		throw new UnsupportedOperationException("not yet implemented");
	}

	public boolean isVide() {
		throw new UnsupportedOperationException("not yet implemented");
	}

	/**
	 * DÃ©place un Ã©lÃ©ment du rÃ©cipient dans autre.
	 * <br>Requiert !isVide(); !autre.isPlein()
	 * <br>Garantit getQuantite() == old getQuantite() -1;
	 * autre.getQuantite() == old autre.getQuantite() + 1
	 * @param autre rÃ©cipient cible
	 */
	public void mettreUnDans(Recipient autre) {
		throw new UnsupportedOperationException("not yet implemented");
	}

	/** Remplit autre.
	 * <br>Requiert getQuantite() >= autre.getEspaceLibre()
	 * <br>Garantit autre.isPlein(); 
	 * getQuantite() == old getQuantite() - old autre.getEspaceLibre(); 
	 * @param autre
	 */
	public void remplir(Recipient autre) {
		throw new UnsupportedOperationException("not yet implemented");
	}

	/**
	 * Vider dans autre
	 * <br>Requiert getQuantite() &lt;= autre.getEspaceLibre()
	 * <br>Garantit isVide();
	 * autre.getQuantite() == old autre.getQuantite() + old espaceLibre()
	 * @param autre
	 */
	public void viderDans(Recipient autre) {
		throw new UnsupportedOperationException("not yet implemented");
	}

	/** Ce qui doit Ãªtre vÃ©rifiÃ© Ã  tout moment par l'instanc est-il ok ?
	 *  
	 * @return
	 */
	public boolean isInvariantOk() {
		assert getCapacite() == getQuantite() + getEspaceLibre();
		assert isPlein() == (getQuantite() == getCapacite());
		assert isVide() == (getQuantite() == 0);
		return true;
	}
};
