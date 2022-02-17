import java.util.ArrayList;
import java.util.Random;

public class Diccionario {

private ArrayList<String> diccionario= new ArrayList<String>();
private modelWord mandarPalabra= new modelWord();
private ArrayList<String> palabrasHanSalido= new ArrayList<String>();
private String pal;
public Diccionario(){
    FileManager fileManager= new FileManager();
    diccionario=fileManager.lecturaFile();
}

public String getFrase(){
    Random aleatorio= new Random();

pal=diccionario.get(aleatorio.nextInt(diccionario.size()));
while(palabrasHanSalido.contains(pal)){
pal=diccionario.get(aleatorio.nextInt(diccionario.size()));
}
palabrasHanSalido.add(pal);
mandarPalabra.setPalabrasEnNivel(pal);
    return pal;

}

}
