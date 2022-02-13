

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private FileReader fileReader;
    private BufferedReader input;
    private FileWriter fileWriter;
    private BufferedWriter output;
    public  static boolean  registrado;



    public ArrayList<String>lecturaFile() {
        ArrayList <String>frases=new ArrayList<>();

        try {
            fileReader = new FileReader("src/files/fileText.txt");
            input = new BufferedReader(fileReader);
            String line = input.readLine();
            while(line!=null){
                frases.add(line);

                line=input.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return frases;
    }

    public ArrayList<String>lecturaUsuario() {
        ArrayList <String>Nombres=new ArrayList<>();

        try {
            fileReader = new FileReader("src/files/Usuarios.txt");
            input = new BufferedReader(fileReader);
            String line = input.readLine();
            while(line!=null){
                Nombres.add(line);
                line=input.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Nombres;
    }


    public void escribirUsuario(String linea) throws IOException {
        ArrayList<String> nombreUsuario= new ArrayList<String>();
        nombreUsuario=lecturaUsuario();


     //   Boolean var = nombreUsuario.contains(linea);
        String usuarioBuscado="";
        for (int i = 0; i < nombreUsuario.size(); i++) {
            String thisUser = nombreUsuario.get(i).substring(0, nombreUsuario.get(i).lastIndexOf(";"));
            if (thisUser.equals(linea)) {

                usuarioBuscado= thisUser;
                break;
            }

        }
        if(usuarioBuscado==linea){

        }else{
            try {

                fileWriter = new FileWriter("src/files/Usuarios.txt",true);
                output = new BufferedWriter(fileWriter);
                output.write(linea+";"+1);
                output.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public int buscarUsuario() {

        ArrayList<String> nombreUsuario = new ArrayList<String>();

        int posicion = 0;

        for (int i = 0; i < nombreUsuario.size(); i++) {
            String thisUser = nombreUsuario.get(i).substring(0, nombreUsuario.get(i).lastIndexOf(";"));
            if (thisUser.equals(nombreUsuario)) {
                posicion = i;
                break;
            }

        }
        return posicion;
    }

    public int buscarNivelUsuario(String nombreUsuarioRecibido){

        ArrayList<String> nombrseUsuarios= new ArrayList<String>();
        nombrseUsuarios=lecturaUsuario();

        String nivelBuscado="";
        for (int i = 0; i < nombrseUsuarios.size(); i++) {
            String thisUser = nombrseUsuarios.get(i).substring(0, nombrseUsuarios.get(i).lastIndexOf(";"));
            if (thisUser.equals(nombreUsuarioRecibido)) {

                nivelBuscado= nombrseUsuarios.get(i).substring(nombrseUsuarios.get(i).lastIndexOf(";")+1);
                break;
            }

        }
        System.out.println(nivelBuscado);
       return Integer.parseInt(nivelBuscado);

       }


}