import java.sql.SQLOutput;
import java.util.Scanner;

public class SmartTv {
    boolean ligada = false;
    int canal = 30;
    int volume = 25;

    /*LIGAR E DESLIGAR TV*/

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    /*
    * AREA DE VOLUME*/
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume : " + volume);
    }
    public void diminuirVolume(){
    volume--;
        System.out.println("Volume : " + volume);
    }
    /*Area de canal*/


    public void canalAcima(){
        canal++;
        System.out.println("Canal atual : " + canal);
    }
    public void canalAbaixo(){
        canal--;
        System.out.println("Canal atual : " + canal);
    }
    public void mudarCanal(int novoCanal){
      canal = novoCanal;
    }


}
