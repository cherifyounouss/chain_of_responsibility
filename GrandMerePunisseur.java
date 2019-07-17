/**
 * GrandMerePunisseur
 */
public class GrandMerePunisseur extends Punisseur {

    private int tolerance = minimum * 10;

	@Override
	public void traiterRequest(PunitionRequest pRequest) throws PunisseurNotFoundException{
        // Si le montant des degats est en dessous de la tolerance de GrandMere
        if(pRequest.getMontant() < tolerance)
            System.out.printf("Le montant des degats est %.2f fcfa, t'as de la chance petit c'est Grand Mere qui va te punir !\n\n", pRequest.getMontant());
        else
            if (suivant != null)
                suivant.traiterRequest(pRequest);
            else
                throw new PunisseurNotFoundException(pRequest.getMontant());
	}
}