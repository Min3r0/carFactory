public class Usine {
    public static void main(String[] args) {
        Marque fiat = new Marque("Fiat", 1899, "Italia");
        Marque ford = new Marque("Ford",1903, "USA");
        Marque peugeot = new Marque("Peugeot",1896,"France");
        Moteur Mmustang = new Moteur(8,4736,422,320, 12);
        Moteur Mchiron = new Moteur(16,7993, 1600, 1600, 25);
        Moteur M106 = new Moteur(4,1124, 94, 60, 7);
        Voiture Mustang = new Voiture(Mmustang, ford, 1969, 180, 48, 60, 3, "Yellow");
        Voiture Peugeot106 = new Voiture(M106, peugeot, 2002,76000,15, 45,3,"Grey");
        Voiture Milletipla = new Voiture(Mchiron, fiat, 2023, 25, 12, 63,2,"Red");

    }
}