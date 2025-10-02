package Inheritance.singel;

class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan...");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meong!");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.makan();  // dari parent
        k.suara();  // dari child
    }
}
