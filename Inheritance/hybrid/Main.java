package Inheritance.hybrid;
class Hewan {
    void hidup() {
        System.out.println("Hewan hidup");
    }
}

class Mamalia extends Hewan {
    void menyusui() {
        System.out.println("Mamalia menyusui anaknya");
    }
}

interface Karnivora {
    void berburu();
}

class Singa extends Mamalia implements Karnivora {
    public void berburu() {
        System.out.println("Singa berburu mangsa");
    }
}

public class Main {
    public static void main(String[] args) {
        Singa s = new Singa();
        s.hidup();      // dari Hewan
        s.menyusui();   // dari Mamalia
        s.berburu();    // dari Karnivora
    }
}
