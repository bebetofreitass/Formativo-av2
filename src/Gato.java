public class Gato extends Animal implements Som {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    
    public void mostrarSom() {
        System.out.println("O gato miou!");
    }
}
