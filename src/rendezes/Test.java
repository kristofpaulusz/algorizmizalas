package rendezes;

public class Test {
static int[] teszt = {1, 4 ,2};
public static void main(String[] args) {
//ellenoriz(tomb);
Rendezes rn = new Rendezes();
int[] rndlist = Rendezes.beszuros(rn.getLista());

rendezettE(rndlist);

Rendezes.kiiaras(rndlist);
//rendezettE(teszt);
}

public static boolean ellenoriz(int[] tomb) {
boolean rendezett = true;

for (int i = 0; i < tomb.length; i++) {
int min = tomb[i];
if (i + 1 != tomb.length) {
if (min > tomb[i + 1]) {
rendezett = false;
}
}

}

return rendezett;
}

public static void rendezettE(int[] tomb) {
boolean kapott = ellenoriz(tomb);
boolean vart = true;

assert kapott == vart: "nem rendezett";
}

}