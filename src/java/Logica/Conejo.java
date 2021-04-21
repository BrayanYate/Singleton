package Logica;

import java.util.Random;

public class Conejo extends Animal{
       
//----------------------Objetos--------------------------//

    static private Conejo singleton = null;

//-----------------------Aleatorios---------------------------//    
    
    String[] Genero = new String[]{"Masculino","Femenino"};
    Random r = new Random();
    int posicion = r.nextInt(Genero.length);
    
    String[] Color = new String[]{"Gris con manchas negras","Naranja con manchas negras",
                                  "Negra con manchas blancas","Negro","blanco","Naranja"};
    Random c = new Random();
    int posicion2 = c.nextInt(Color.length);
        
//------------------Constructor------------------------------//
    
    private Conejo(){
        super();
        this.comportamiento ="Los conejos son animales muy curiosos y les encanta explorar "
             + "todo lo que hay a su alrededor.Puede jugar a perseguir a otros conejos o "
             + "al mismo propietario corriendo detrás de él";
        this.genero = Genero[posicion];
        this.habitat = "Lugares amplios";        
        this.color = Color[posicion2];
        this.img = "conejo";
    }
    
//------------------Metodos------------------------------//    
    
    static public Conejo getSingleton() {
        if (singleton == null) {
            singleton = new Conejo();
        }   
        return singleton;
    }
}