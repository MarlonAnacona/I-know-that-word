import java.util.ArrayList;
import java.util.Random;

public class modelWord {
    private int nivelActual,palabrasEnNivel;
    private Double porcentajeAciertos;

    private ArrayList<String> palabrasQueHanSalido = new ArrayList<>() ;
    ArrayList<String> palabrasCiertas= new ArrayList<>() ;

    private static  ArrayList<String> palabrasCalificar2= new ArrayList<>() ;


    public void setPalabrasEnNivel(String palabrarecibida){

        palabrasQueHanSalido.add(palabrarecibida);
System.out.println(palabrasQueHanSalido);
    }


    public int setNivelActual(int nivel){
        nivelActual=nivel;;
        return nivelActual;
    }

    private void setPorcentajeAciertos(){
        switch (nivelActual){
            case 1, 2 : porcentajeAciertos=0.7;
                break;
            case 3 :porcentajeAciertos=0.75;
                break;
            case 4, 5  : porcentajeAciertos=0.8;
                break;
            case 6:  porcentajeAciertos=0.85;
                break;
            case 7, 8 : porcentajeAciertos=0.9;
                break;
            case 9 :  porcentajeAciertos=0.95;
                break;
            case 10 :porcentajeAciertos=1.0;
                break;
        }
    }
    private void setPalabrasEnNivel(){
        switch (nivelActual){
            case 1: palabrasEnNivel=20;
            break;
            case 2: palabrasEnNivel=40;
                break;
            case 3: palabrasEnNivel=50;
                break;
                case 4: palabrasEnNivel=60;
                    break;
                    case 5: palabrasEnNivel=70;
                        break;
                        case 6: palabrasEnNivel=80;
                            break;
                            case 7 : palabrasEnNivel=100;
                                break;
                                case 8 : palabrasEnNivel=120;
                                    break;
                                    case 9 :  palabrasEnNivel=140;
                                        break;
                                        case 10 :palabrasEnNivel=200;
                                            break;
        }
    }


    public boolean comparar(String palabraEscrita,int aciertos) {
        boolean fallo= true;
        int cantidadTotal = palabrasEnNivel-aciertos;

        for(int i = 0; i< palabrasQueHanSalido.size(); i++){
            if(palabrasQueHanSalido.get(i).equalsIgnoreCase(palabraEscrita)) {
                if(i>=cantidadTotal){
                }else{
                    palabrasQueHanSalido.remove(i);
                    fallo= false;
                }
            }
        }
        return fallo;
    }







}
