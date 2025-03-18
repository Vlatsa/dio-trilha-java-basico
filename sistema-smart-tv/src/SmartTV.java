public class SmartTV {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
    canal = novoCanal;
    System.err.println("Mudando Canal para: " + canal);
    }

    public void aumentarCanal() {
    canal++;
    System.err.println("Aumentando Canal para: " + canal);
    }

    public void diminuirCanal() {
    canal--;
    System.err.println("Diminuindo Canal para: " + canal);
    }

    public void aumentarvolume() {
    volume++;
    System.err.println("Aumentando Volume para: " + volume);
    }

    public void diminuirvolume() {
    volume--;
    System.err.println("Diminuindo Volume para: " + volume);
    }

    public void ligar() {
    ligada = true;
    }

    public void desligar() {
    ligada = false;
    }
    
    //public boolean isLigada() {
    //   return ligada;
    //}
    
    //public int getVolume() {
    //    return volume;
    //}

    //public int getCanal() {
    //    return canal;
    //}
}