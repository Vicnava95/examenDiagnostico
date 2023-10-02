public class Guepardo extends Felino{

    //Guepardo
    public Guepardo() {
    }

    //Felino
    public Guepardo(float tamanoGarras, Integer velocidad) {
        super(tamanoGarras, velocidad);
    }

    //Mamifero
    public Guepardo(String habitat, float altura, float peso, float largo, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, peso, largo, nombreCientifico, tamanoGarras, velocidad);
    }

    public String comer(){
        return "Los guepardos son carnívoros especializados en presas medianas. Cazan diferentes especies de gacelas, como la gacela de Thomson \n";
    }

    public String dormir(){
        return "8H";
    }

    public String correr(){
        return "10Km/h";
    }

    public String comunicarse(){
        return "Los guepardos se comunican de muchas maneras diferentes. Algunas de ellas son a través de vocalizaciones como ronroneos, balidos, ladridos, gruñidos, silbidos y un característico chirrido agudo. \n";
    }
}
