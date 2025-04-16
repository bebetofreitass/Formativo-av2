public class App {
    public static void main(String[] args) {
        Zoologico ani = new Zoologico();

        ani.addAnimal(new Cachorro("rex", 5));
        ani.addAnimal(new Cachorro("bela", 3));
        ani.addAnimal(new Gato("tom", 4));
        ani.addAnimal(new Gato("lili", 2));
        ani.addAnimal(new Leao("limba", 6));

        ani.listarAnimais();
        System.out.println();
        System.out.println();
        System.out.println();
        ani.mostrarSons();
    }
}
