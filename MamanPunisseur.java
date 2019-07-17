/**
 * MamanPunisseur
 */
public class MamanPunisseur extends Punisseur {

    private int tolerance = minimum * 50;

	@Override
	public void traiterRequest(PunitionRequest pRequest) throws PunisseurNotFoundException{
        // Si le montant des degats est en dessous de la tolerance de GrandMere
        if(pRequest.getMontant() < tolerance)
            System.out.printf("Le montant des degats est %.2f fcfa, la punition de Maman sera severe petit !\n\n", pRequest.getMontant());
        else
            if (suivant != null)
                suivant.traiterRequest(pRequest);
            else
                throw new PunisseurNotFoundException(pRequest.getMontant());
	}
}