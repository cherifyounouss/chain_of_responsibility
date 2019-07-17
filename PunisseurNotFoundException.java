/**
 * PunisseurNotFoundException
 */
public class PunisseurNotFoundException extends Exception{

    double montant;

    public PunisseurNotFoundException(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Pas de punisseur pour le montant " + this.montant;
    }
}