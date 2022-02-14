import java.util.ArrayList;
import java.util.Random;

public class Diccionario {

private ArrayList<String> diccionario= new ArrayList<String>();
private modelWord mandarPalabra= new modelWord();
public Diccionario(){
    FileManager fileManager= new FileManager();
    diccionario=fileManager.lecturaFile();
}

public String getFrase(){
    Random aleatorio= new Random();



    String palabraAsalir=diccionario.get(aleatorio.nextInt(diccionario.size()));
    mandarPalabra.setPalabrasEnNivel(palabraAsalir);
    return palabraAsalir;


}
}
