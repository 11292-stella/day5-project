import java.util.Scanner;

public class PlayerMultiApp {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        ElementoMulti[] elementi = new ElementoMulti[5];

        elementi[0] = new RegistrazioneAudio("Primo audio",3,5);
        elementi[1] = new Video("Secondo Video",4,7,8);
        elementi[2] = new Immagine("Terza Immagine",8);
        elementi[3] = new RegistrazioneAudio("Secondo audio",3,6);
        elementi[4] = new Video("Terzo video",6,7,8);


        while(true){
            System.out.println("Scegli un numero da 1 a 5 per eseguire un elemento, o 0 per uscire:");
            int scelta = scanner.nextInt();
            if(scelta == 0){
                System.out.println("Uscita dal programma.");
                break;
            }

            if(scelta < 1 || scelta > 5){
                System.out.println("Scelta non valida. Riprova.");
            }

            ElementoMulti elemento = elementi[scelta - 1];

            if (elemento instanceof Riproducibile) {
                Riproducibile riproducibile = (Riproducibile) elemento;
                riproducibile.play();
            }
            else if (elemento instanceof Immagine) {
                Immagine immagine = (Immagine) elemento;
                immagine.show();
            }
        }


    }
}
