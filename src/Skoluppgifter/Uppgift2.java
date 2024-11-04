public class Uppgift2 {
    public static void main(String[] args) {
        // Definiera grundlön och provision
        double Grundlön = 8000;
        double Provision = 0.09;
        double Försäljning = 545411;


        // Beräkna provisionslön beräknat på försäljningssumma (100000)
        double Provisionslön = Försäljning * Provision;

        //Räkna ut totallön
        double totalLön = Grundlön + Provisionslön;

        // Skriv ut resultatet
        System.out.println("Total lön med provision är: " + totalLön + " kr");
    }
}
