public class RodinnyDum {
    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOken;

    RodinnyDum (){
        System.out.println("Ted se vola konstruktor");
    }

    public float vypocetCenyDomu (int cenaZaMetr, String jmenoRodiny){
        float cena = rozloha * cenaZaMetr * pocetPoschodi;
        System.out.println(jmenoRodiny + " " + cena);
        return cena;


    }


}
