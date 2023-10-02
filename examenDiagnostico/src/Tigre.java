public class Tigre extends Felino{
    private String especieTigre;

    //Tigre
    public Tigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    //Felino
    public Tigre(float tamanoGarras, Integer velocidad, String especieTigre) {
        super(tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    //Mamifero
    public Tigre(String habitat, float altura, float peso, float largo, String nombreCientifico, float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, peso, largo, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    public String comer(){
        return "Los tigres son carnívoros y cazan desde pavos reales hasta búfalos asiáticos y gaures \n";
    }

    public String dormir(){
        return "El tigre pasa durmiendo casi 16 horas diarias, con la particularidad de que duerme durante el día y caza por la noche. \n";
    }

    public String correr(){
        return "A pesar de su gran tamaño, los tigres pueden alcanzar velocidades de hasta 90 km/h \n";
    }

    public String comunicarse(){
        return "Hay un cierto número de vocalizaciones, tales como ronroneos y gruñidos, y el tigre también se comunica con señales olfativas y visuales como orina, heces fecales y marcas de expresión del estado anímico \n";
    }
}
