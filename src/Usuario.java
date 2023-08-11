public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        System.out.println("Ligada : " +smartTv.ligada);
        System.out.println("canal atual : " +smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.canalAcima();
        smartTv.canalAcima();
        smartTv.canalAcima();
        System.out.println("Canal atual é : " + smartTv.canal);

        smartTv.canalAbaixo();
        smartTv.canalAbaixo();
        smartTv.canalAbaixo();
        smartTv.canalAbaixo();
        smartTv.canalAbaixo();
        System.out.println("Canal atual é : " + smartTv.canal);

        smartTv.mudarCanal(100);


    }
}
