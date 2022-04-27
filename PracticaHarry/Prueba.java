package PracticaHarry;

public class Prueba {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Personajes HarryPotter = new Personajes();
        HarryPotter.setNombre("Harry Potter");
        HarryPotter.setCasa("Gryffindor");
        HarryPotter.setGenero("Masculino");
        HarryPotter.setBoggart("Dementor");
        HarryPotter.setPatronus("Ciervo");
        String msg = "Nombre: "+HarryPotter.getNombre();
        msg += "\nCasa: "+HarryPotter.getCasa();
        msg += "\nGenero: "+HarryPotter.getGenero();
        msg += "\nBoggart: "+HarryPotter.getBoggart();
        msg += "\nPatronus: "+HarryPotter.getPatronus();

        Personajes Hermione = new Personajes();
        Hermione.setNombre("Hermione Jean Granger");
        Hermione.setCasa("Gryffindor");
        Hermione.setGenero("Femenino");
        Hermione.setBoggart("Fracaso");
        Hermione.setPatronus("Nutria");
        String msg2 = "\n\nNombre: "+Hermione.getNombre();
        msg2 += "\nCasa: "+Hermione.getCasa();
        msg2 += "\nGenero: "+Hermione.getGenero();
        msg2 += "\nBoggart: "+Hermione.getBoggart();
        msg2 += "\nPatronus: "+Hermione.getPatronus();

        Personajes Ron = new Personajes();
        Ron.setNombre("Ronald Bilius Weasley");
        Ron.setCasa("Gryffindor");
        Ron.setGenero("Masculino");
        Ron.setBoggart("Arana gigante");
        Ron.setPatronus("Jack Russell Terrier");
        String msg3 = "\n\nNombre: "+Ron.getNombre();
        msg3 += "\nCasa: "+Ron.getCasa();
        msg3 += "\nGenero: "+Ron.getGenero();
        msg3 += "\nBoggart: "+Ron.getBoggart();
        msg3 += "\nPatronus: "+Ron.getPatronus();

        Personajes DracoMalfoy = new Personajes();
        DracoMalfoy.setNombre("Draco Malfoy");
        DracoMalfoy.setCasa("Slytherin");
        DracoMalfoy.setGenero("Masculino");
        DracoMalfoy.setBoggart("El Bosque Prohibido");
        DracoMalfoy.setPatronus("Desconocido");
        String msg4 = "\n\nNombre: "+DracoMalfoy.getNombre();
        msg4 += "\nCasa: "+DracoMalfoy.getCasa();
        msg4 += "\nGenero: "+DracoMalfoy.getGenero();
        msg4 += "\nBoggart: "+DracoMalfoy.getBoggart();
        msg4 += "\nPatronus: "+DracoMalfoy.getPatronus();

        Personajes Neville = new Personajes();
        Neville.setNombre("Neville Longbottom");
        Neville.setCasa("Gryffindor");
        Neville.setGenero("Masculino");
        Neville.setBoggart("Severus Snape");
        Neville.setPatronus("No corporeo");
        String msg5 = "\n\nNombre: "+Neville.getNombre();
        msg5 += "\nCasa: "+Neville.getCasa();
        msg5 += "\nGenero: "+Neville.getGenero();
        msg5 += "\nBoggart: "+Neville.getBoggart();
        msg5 += "\nPatronus: "+Neville.getPatronus();

        System.out.print(msg + msg2 + msg3 + msg4 + msg5);


    }
}
