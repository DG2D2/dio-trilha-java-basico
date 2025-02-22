public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        smartTv.ligar ();
        System.out.println("Tv ligada? " + smartTv.ligada);    

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume + "\n");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume(); //23
        System.out.println("Volume atual: " + smartTv.volume + "\n");
        
        smartTv.mudarCanal(21);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal(); // 22
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar ();
        System.out.println("Tv ligada? " + smartTv.ligada);
        
        

    }
}
