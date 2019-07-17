/**
 * Punisseur
 */
public abstract class Punisseur {

    protected int minimum = 10;
    protected Punisseur suivant;

    public void setSuivant(Punisseur punisseurSuivant) {
        this.suivant = punisseurSuivant;
    }

    public abstract void traiterRequest(PunitionRequest pRequest) throws PunisseurNotFoundException;
}