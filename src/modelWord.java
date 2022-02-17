import java.util.ArrayList;
import java.util.List;

public class modelWord {
    private int nivelActual,palabrasEnNivel;
    private Double porcentajeAciertos;
    ArrayList<String> palabrasNivel= new ArrayList<>() ;
    ArrayList<String> palabrasCiertas= new ArrayList<>() ;
    ArrayList<String> palabrastotalesNivel= new ArrayList<>() ;



    public void setPalabrasEnNivel(String palabrarecibida){

        palabrasNivel.add(palabrarecibida);
System.out.println(palabrasNivel);
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

        for(int i=0;i<palabrasNivel.size();i++){
            if(palabrasNivel.get(i).equalsIgnoreCase(palabraEscrita)) {
                if(i>=cantidadTotal){
                }else{
                    palabrasNivel.remove(i);
                    fallo= false;
                }
            }
        }
        return fallo;
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
