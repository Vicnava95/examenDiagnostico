public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro(String habitat, float altura, float peso, float largo, String nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, peso, largo, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    public String comer(){
        return "Comida";
    }

    public String dormir(){
        return "8 horas";
    }

    public String correr(){
        return "10Km/H";
    }

    public String comunicarse(){
        return "Los perros se comunican con señales visuales como la postura del cuerpo, la posición de la cabeza, la posición de las orejas, la cola e incluso de su pelaje. También utilizan la vocalización, como ladrar o gruñir. \n";
    }
}
