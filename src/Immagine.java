public class Immagine extends ElementoMulti implements Riproducibile{


    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    @Override
    public void play() {

    }

    public void show(){
        System.out.println(getTitolo() + "*".repeat(luminosità));
    }

    public int aumentaLuminosità(){
        luminosità ++;
        return luminosità;
    }

    public int diminuisciLuminosità(){
        if(luminosità > 0){
            luminosità--;
        }
        return luminosità;
    }
}
