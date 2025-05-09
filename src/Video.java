public class Video extends ElementoMulti implements Riproducibile{


    private int volume;
    private int durata;
    private int luminosità;


    public Video(String titolo, int volume, int durata, int luminosità) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosità = luminosità;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Video{" +
                "luminosità=" + luminosità +
                '}';
    }

    @Override
    public void play() {

        for (int i = 0; i < durata; i++) {

            System.out.println(getTitolo() + "!".repeat(volume) + "*".repeat(luminosità));

        }
    }



    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    public int aumentaLuminosità(){
        luminosità++;
        return luminosità;
    }

    public int diminuisciLuminosità(){
        if(luminosità > 0) {
            luminosità--;
        }
        return luminosità;
    }


}
