public class RegistrazioneAudio extends ElementoMulti implements Riproducibile{


    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio{" +
                "durata=" + durata +
                ", volume=" + volume +
                '}';
    }

    @Override
    public void play() {

        for (int i = 0; i < durata; i++) {

            System.out.println(getTitolo() + "!".repeat(volume));

        }

    }

    public int alzaVolume(){
        volume ++;
        return volume;
    }

    public int abbassaVolume(){

        if(volume > 0){
            volume--;
        }
        return volume;
    }



}
