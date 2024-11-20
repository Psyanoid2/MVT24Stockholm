package InlamningIntroduktionTillProgrammering;

public class CommandStatistics {
    private int antalTecken;
    private int antalRader;
    private int antalOrd;
    private String langstaOrd;

    public CommandStatistics() {
        this.antalTecken = 0;
        this.antalRader = 0;
        this.antalOrd = 0;
        this.langstaOrd = "";
    }

    //Metod uppdatera statistik
    public void laggTillRad(String rad) {
        antalTecken += rad.length();
        antalRader++;

        // Dela upp raden i ord baserat på mellanslag
        String[] ordArray = rad.split("\\s+");
        antalOrd += ordArray.length;

        // Kontrollera längden på varje ord för att hitta det längsta
        for (String ord : ordArray) {
            if (ord.length() > langstaOrd.length()) {
                langstaOrd = ord;
            }
        }
    }

    // Metod kontrollera "STOPP"
    public boolean isSTOPP(String rad) {
        return rad.equalsIgnoreCase("STOPP");
    }

    //Metod hämta antal tecken
    public int getAntalTecken(){
        return antalTecken;
    }

    //metod hämta antal rader
    public int getAntalRader(){
        return antalRader;
    }

    // Metod för att hämta antalet ord
    public int getAntalOrd() {
        return antalOrd;
    }

    // Metod för att hämta det längsta ordet
    public String getLangstaOrd() {
        return langstaOrd;
    }
}
