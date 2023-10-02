public class Lobo extends Canino{
    private Integer numCamada;
    private String especieLobo;


    public Lobo(String habitat, float altura, float peso, float largo, String nombreCientifico, String color, Float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, peso, largo, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    public String comer(){
        return "Lobos Grises son carnivoros – quiere dicir que comen carne. Lobos casan en grupos grandes para comida grande como ciervos, alces, ovejas, cabras, caribúes, bisontes, y muskox. Lobos también comen roedores, los castores, peces, y aves \n";
    }

    public String dormir(){
        return " 8H";
    }

    public String correr(){
        return "12km/h";
    }

    public String comunicarse(){
        return "Lobos Grises se comunican entre ellos con aullidos, lenguaje del cuerpo, y aroma. Aullar se usa para semblar el grupo, comunicar entre ellos mismos, y para proteger sus territorios. \n";
    }
}
