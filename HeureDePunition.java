import java.util.Scanner;

/**
 * HeureDePunition
 */
public class HeureDePunition {
    public static void main(String[] args) {
        
        // Configuration...

        GrandMerePunisseur grandMa = new GrandMerePunisseur();
        MamanPunisseur maman = new MamanPunisseur();
        PapaPunisseur papa = new PapaPunisseur();
        SuperTontonPunisseur sTontonPunisseur = new SuperTontonPunisseur();
        // Grand Mere voit si elle peut punir, si elle ne peut pas elle passe la punition a maman
        grandMa.setSuivant(maman);
        // Si maman ne peut pas punir c'est papa qui le fera
        maman.setSuivant(papa);
        // Si papa ne peut pas punir c'est super tonton punisseur qui le fera
        papa.setSuivant(sTontonPunisseur);

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("        ----------PROGRAMME DE PUNITION----------");
        System.out.println("        -----------------------------------------");
        System.out.println();
        // On recupere le montant des degats
        System.out.print("Entrer le montant des degats causes par votre enfant: ");
        double montant = input.nextDouble();

        // Envoie de la requete
        try {
            grandMa.traiterRequest(new PunitionRequest(montant));
        } catch (PunisseurNotFoundException e) {
            System.out.println(e);
        }
    }
}