import java.util.ArrayList;
import java.util.Random;

public class Diccionario {

private ArrayList<String> diccionario= new ArrayList<String>();
private modelWord mandarPalabra= new modelWord();
private ArrayList<String> palabrasHanSalido= new ArrayList<String>();

public Diccionario(){
    FileManager fileManager= new FileManager();
    diccionario=fileManager.lecturaFile();
}

public String getFrase(){
    Random aleatorio= new Random();
    String palabraAsalir=diccionario.get(aleatorio.nextInt(diccionario.size()));
    System.out.println(palabraAsalir);


    if(setPalabrasHansalido(palabraAsalir,palabrasHanSalido)){
        getFrase();
    }else{
        if(setPalabrasHansalido(palabraAsalir,palabrasHanSalido)==false){

            mandarPalabra.setPalabrasEnNivel(palabraAsalir);
            palabrasHanSalido.add(palabraAsalir);


        }

    }
    return palabraAsalir;
}

public boolean setPalabrasHansalido(String palabraQueSalio,ArrayList<String> palabrasHanSalidos){
    boolean var=false;
    for (int i=0;i<palabrasHanSalidos.size();i++){
        if(palabrasHanSalidos.get(i).equals(palabraQueSalio)){

            var=true;
        }else{
            var=false;
        }
    }

    return var;
}
}
