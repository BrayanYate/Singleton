package Logica;

import java.util.Random;


public class Gato extends Animal {

//----------------------Objetos--------------------------//
    
    static private Gato singleton = null;

//-----------------------Aleatorios---------------------------//
/*    
    String[] Genero = new String[]{"Masculino","Femenino"};
    Random r = new Random();
    int posicion = r.nextInt(Genero.length);
*/    
    String[] Color = new String[]{"Gris con manchas negras","Naranja con manchas negras",
                                  "Negra con manchas blancas","Negro","blanco","Naranja"};
    Random c = new Random();
    int posicion2 = c.nextInt(Color.length);

//------------------Constructor------------------------------//
    
    private Gato (){
        super();
        this.comportamiento ="El comportamientos comunes incluyen técnicas de caza y reacciones"
                            + " a ciertos eventos como interacciones con humanos u otros animales. ";
        this.genero = "Femenino";
        this.habitat = "Lugares altos";
        this.color = Color[posicion2];
        this.img = "gato";
        
    }

//------------------Metodos------------------------------//

    static public Gato getSingleton() {
        if (singleton == null) {
            singleton = new Gato();
        }   
        return singleton;
    }       
}
