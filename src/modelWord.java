import java.util.ArrayList;
import java.util.List;

public class modelWord {
    private int nivelActual,palabrasEnNivel;
    private Double porcentajeAciertos;
    ArrayList<String> palabrasNivel= new ArrayList<>() ;
    ArrayList<String> palabrasCiertas= new ArrayList<>() ;
   // ArrayList<String> palabrasCiertas= new ArrayList<>() ;

    private void setPorcentajeAciertos(){
        switch (nivelActual){
            case 1, 2 -> porcentajeAciertos=0.7;
            case 3-> porcentajeAciertos=0.75;
            case 4, 5 -> porcentajeAciertos=0.8;
            case 6-> porcentajeAciertos=0.85;
            case 7, 8 -> porcentajeAciertos=0.9;
            case 9-> porcentajeAciertos=0.95;
            case 10->porcentajeAciertos=1.0;
        }
    } private void setPalabrasEnNivel(){
        switch (nivelActual){
            case 1-> palabrasEnNivel=20;
            case 2-> palabrasEnNivel=40;
            case 3-> palabrasEnNivel=50;
            case 4-> palabrasEnNivel=60;
            case 5-> palabrasEnNivel=70;
            case 6-> palabrasEnNivel=80;
            case 7-> palabrasEnNivel=100;
            case 8-> palabrasEnNivel=120;
            case 9-> palabrasEnNivel=140;
            case 10->palabrasEnNivel=200;
        }
    }

    public void setPalabrasEnNivel(String palabrarecibida){

        palabrasNivel.add(palabrarecibida);
        System.out.println(palabrasNivel);
    }

   /* public String getPalabrasNivel(){
        if (flagNivel<palabrasNivel.size()){
            palabraAMostrar=palabrasNivel.get(flagNivel);
            flagNivel++;
        }else{
            setNivelesAprobados();
            palabraAMostrar="";
        }
        return palabraAMostrar;
    }
    public int  getAciertos(){
        return aciertos;
    }
    public int getNivelActual() {
        return nivelActual;
    }
    public int getPorcentajeNivel(){
        setPorcentajeAciertos();
        return (int) Math.ceil(palabrasEnNivel * porcentajeAciertos);
    }
    */

}
