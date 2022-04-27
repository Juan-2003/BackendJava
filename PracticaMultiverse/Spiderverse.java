package PracticaMultiverse;

import javax.swing.*;

abstract class Spiderman{
     Spiderman(){
         System.out.println("\nSe ha seleccionado un Nuevo Spiderman");
     }
     abstract void Ataques();
     abstract void colorTraje();
}

class SpidermanTobey extends Spiderman{
    SpidermanTobey(){
        System.out.println("\n- Spiderman de Tobey");
    }
    void Ataques(){
        System.out.println("\nVelocidad mejorada" +
                            "\nSentido aracnido" +
                            "\nFuerza aumentada"+
                            "\nTelaranas producidas natuaralmente "+
                            "\nSanacion mejorada"+
                            "\nTrepar muros");
    }

    void colorTraje(){
        System.out.println("Traje: Rojo y Azul");
    }
}

class SpiderHam extends Spiderman{
    SpiderHam(){
        System.out.println("\n- SpiderHam");
    }
    void Ataques(){
        System.out.println("\nVelocidad aumentada"+
                            "\nDetonadores Porker"+
                            "\nAguijon Electrico" +
                            "\nSinsentido Aracnido" +
                            "\nFuerza aumentada"+
                            "\nMartillo Animado"+
                            "\nTrepar muros"+
                            "\nLanzadores de telaranas");
    }

    void colorTraje(){
        System.out.println("Traje: Rojo y Azul");
    }
}

class MilesMorales extends Spiderman{
    MilesMorales(){
        System.out.println("\n- MilesMorales");
    }
    void Ataques(){
        System.out.println("\nSpider-camuflaje"+
                            "\nFuerza aumentada"+
                            "\nResistencia aumentada"+
                            "\nSanacion mejorada"+
                            "\nSentido Aracnido"+
                            "\nPicadura Veneno"+
                            "\nExplosion de Energia"+
                            "\nTrepar muros");
    }

    void colorTraje(){
        System.out.println("Traje: Rojo y Negro");
    }
}



public class Spiderverse {
    public static void main(String[] args) {
        Spiderman Tobey = new SpidermanTobey();
        Tobey.Ataques();
        Tobey.colorTraje();

        Spiderman SpiderHam = new SpiderHam();
        SpiderHam.Ataques();
        SpiderHam.colorTraje();

        Spiderman Miles = new MilesMorales();
        Miles.Ataques();
        Miles.colorTraje();
    }
}
