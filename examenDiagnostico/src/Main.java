public class Main {
    public static void main(String[] args) {
        Mamifero tigre1 = new Tigre("Selva",120,120,120,"Tigre",150,1,"salvaje");
        Mamifero leon1 = new Leon("Selva",120,120,120,"leon",25,25,2,150);
        Mamifero guepardo1 = new Guepardo("Selva",120,120,120,"Guepardo",25,2);
        Mamifero lobo1 = new Lobo("Selva",120,120,120,"Lobo","Negro",25F,2,"kkaj");
        Mamifero perro = new Perro("Hogar",120,120,120,"Perro","Cafe",12F,2);
        //System.out.println(tigre1.comer());

        Mamifero[] mamiferos = new Mamifero[5];
        mamiferos[0] = tigre1;
        mamiferos[1] = leon1;
        mamiferos[2] = guepardo1;
        mamiferos[3] = lobo1;
        mamiferos[4] = perro;

        for(Mamifero mamifero : mamiferos){
            System.out.println(mamifero.getHabitat());
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
        }

    }
}