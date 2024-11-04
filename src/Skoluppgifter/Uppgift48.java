package Skoluppgifter;

public class Uppgift48 {
    public static void main(String[] args) {
        int fakultet = 5;
        int produkt = 1;
        for (int i = 1; i <= fakultet ; i++){
            produkt = produkt * i;
            System.out.print(""+ i);
            if (i < fakultet){
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + produkt);
    }
}
