package Inheritance.multilevel;

class Hewan {
    void hidup() {
        System.out.println("Hewan hidup");
    }
}

class Mamalia extends Hewan {
    void berdarahPanas() {
        System.out.println("Mamalia berdarah panas");
    }
}

class Anjing extends Mamalia {
    void suara() {
        System.out.println("Guk guk!");
    }
}
public class Main {
    public static void main(String[] args) {
        Anjing a = new Anjing();
        a.hidup();
        a.berdarahPanas();
        a.suara();
    }
}
