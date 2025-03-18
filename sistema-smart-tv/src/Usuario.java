public class Usuario {
    
    public static void main(String[] args) throws Exception {
       
        SmartTV smartTv = new SmartTV();

        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirvolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("Canal Atual: " + smartTv.canal);


    }
}
