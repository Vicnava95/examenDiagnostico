public class Mamifero {
    protected String habitat;
    protected Float altura;
    protected Float peso;
    protected Float largo;
    protected String nombreCientifico;

    public Mamifero(){

    }

    public Mamifero(String habitat, float altura, float peso, float largo, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.largo = largo;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String toString(){
        return "Nombre cientifico: " + nombreCientifico + "\n" +
                "Habitat: " + habitat + "\n" +
                "Altura: " + altura + "\n" +
                "Largo: " + largo + "\n" +
                "Peso: " + peso + "\n";
    }

    public String comer(){
        return "";
    }

    public String dormir(){
        return "";
    }

    public String correr(){
        return "";
    }

    public String comunicarse(){
        return "";
    }
}
