public class FacadeVehicule {
    private Vehicule camion;
    private Vehicule bus;
    private Vehicule monospace;

    public FacadeVehicule() {
        camion = new Camion();
        bus = new Bus();
        monospace = new Monospace();
    }

    public void voirInfosCamion() {
        camion.modelNo();
        camion.price();
        camion.couleur();
        camion.energie();
        camion.vitess();
        camion.kilometrage();
        camion.garantie();

    }

    public void voirInfosBus() {
        bus.couleur();
        bus.energie();
        bus.vitess();
        bus.kilometrage();
        bus.garantie();
        bus.modelNo();
        bus.price();
    }

    public void voirInfosMonospace() {
        monospace.couleur();
        monospace.energie();
        monospace.vitess();
        monospace.kilometrage();
        monospace.garantie();
        monospace.modelNo();
        monospace.price();
    }
}