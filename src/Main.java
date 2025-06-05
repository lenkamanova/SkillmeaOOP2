import java.util.Random;

public class Main {
    public static void main(String[] args) {

       // Random nahCislo = new Random();

        RodinnyDum dumNovaku = new RodinnyDum();
        dumNovaku.pocetPoschodi = 4;
        dumNovaku.rozloha = 457f;
        dumNovaku.material = "mramor";
        dumNovaku.vypocetCenyDomu(300, "Novakovi");

        RodinnyDum dumZajicu = new RodinnyDum();
        dumZajicu.pocetPoschodi = 3;
        dumZajicu.rozloha = 646f;
        dumZajicu.vypocetCenyDomu(250, "Zajicovi");





        Random genCisel = new Random();
    }
}