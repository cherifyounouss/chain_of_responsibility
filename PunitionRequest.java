/**
 * PunitionRequest
 */
public class PunitionRequest {

    private double montant;

    /**
     * @return the montant
     */
    public double getMontant() {
        return montant;
    }

    /**
     * @param montant the montant to set
     */
    public void setMontant(double montant) {
        this.montant = montant;
    }

    public PunitionRequest (double montant) {
        setMontant(montant);
    }
}