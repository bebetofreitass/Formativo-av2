import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;

    public Zoologico() {
        animais = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animais.add(a);
    }

    public void listarAnimais() {
        for (Animal a : animais) {
            a.mostrarDados();
        }
    }

    public void mostrarSons() {
    for (Animal a : animais) {
        if (a instanceof Som) {
            Som s = (Som) a;
            s.mostrarSom();
            }
        }
    }
}
