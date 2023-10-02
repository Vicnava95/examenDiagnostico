public class Leon extends Felino{
    private Integer numManada;
    private Float potenciaRugidoDecibel;
    //Leon
    public Leon(Integer numManada, float potenciaRugidoDecibel) {
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    //Felino
    public Leon(float tamanoGarras, Integer velocidad, Integer numManada, float potenciaRugidoDecibel) {
        super(tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    //Mamifero
    public Leon(String habitat, float altura, float peso, float largo, String nombreCientifico, float tamanoGarras, Integer velocidad, Integer numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, peso, largo, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public String comer(){
        return "Alimentación: Carnívora; principalmente animales de mediano y gran tamaño como ñúes, impalas y otros antílopes, cebras, jirafas, búfalos y también carroña. \n";
    }

    public String dormir(){
        return "";
    }

    public String correr(){
        return "";
    }

    public String comunicarse(){
        return "Los leones tienden a rugir de manera muy característica, empezando con unos cuantos rugidos graves y largos, que conducen a una serie de rugidos más cortos. \n";
    }
}
