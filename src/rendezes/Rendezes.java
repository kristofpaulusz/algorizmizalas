package rendezes;

import java.util.Random;

public class Rendezes {
       static final int HOSSZ = 15;
       static final int MAX = 30;
       static final int MIN = 2;
       public static int[] lista = new int[HOSSZ];
    public static void main(String[] args) {
        
        lista = new int[HOSSZ];
        Random rnd = new Random();
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rnd.nextInt(MIN, MAX);
            System.out.print(lista[i]+", ");
        }
        System.out.println("");
        
        
        lista = beszuros(lista);
        
    }

    public Rendezes() {
        lista = new int[HOSSZ];
        Random rnd = new Random();
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rnd.nextInt(MIN, MAX);
            System.out.print(lista[i]+", ");
        }
        System.out.println("");
    }

    public int[] getLista() {
        return lista;
    }
    public static int[] beszuros(int[] tomb) {
        for (int i = 1; i < tomb.length; i++) {
            int j = i - 1;
            while (j >= 0 && tomb[j] > tomb[j+1]) {                
                int tmp = tomb[j];
                tomb[j] = tomb[j+1];
                tomb[j+1] = tmp;
                
                j -= 1; 
            }
        }
        return tomb;
    };
    public static void kiiaras(int[] tomb) {
    for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+", ");
        }
            System.out.println("");
    }
}
