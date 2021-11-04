import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFacade {
    private static int choice;
    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("========= Car Shop ============ \n");
            System.out.print("            1. Camion.              \n");
            System.out.print("            2. Bus.              \n");
            System.out.print("            3. Monospace.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Entrez votre choix pour voir les informations: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            FacadeVehicule fv = new FacadeVehicule();

            switch (choice) {
            case 1: { fv.voirInfosCamion(); }
                break;
            case 2: { fv.voirInfosBus(); }
                break;
            case 3: { fv.voirInfosMonospace(); }
                break;
            default: { System.out.println("Votre choix ne figure pas sur la liste"); }
                return;
            }

        } while (choice != 4);
    }
}