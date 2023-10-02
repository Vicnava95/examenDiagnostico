public class Canino extends Mamifero{
    protected String color;
    protected Float tamanoColmillos;

    public Canino(String color, Float tamanoColmillos) {
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public Canino(String habitat, float altura, float peso, float largo, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, peso, largo, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(Float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }
}
