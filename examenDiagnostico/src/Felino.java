public class Felino extends Mamifero{
    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felino() {
    }

    public Felino(float tamanoGarras, Integer velocidad) {
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felino(String habitat, float altura, float peso, float largo, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, peso, largo, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }


}
