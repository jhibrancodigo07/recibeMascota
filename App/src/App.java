import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<RecibeMascota> mascotas = new ArrayList<>(RecibeMascota);
        RecibeMascota huskMascota = new RecibeMascota(null, 0, null, 0, null);
        RecibeMascota dogMascota = new RecibeMascota(null, 0, null, 0, null);
        RecibeMascota hachMascota = new RecibeMascota(null, 0, null, 0, null);
        do {
            System.out.println("Ingresa una especie para agregarla a la lista");
            especie = sc.nextLine();
            animales.add(new Animal(especie));
            System.out.println("Quieres agregar otra especie? S/N");
            opt = sc.nextLine();
        } while (opt.equals("S"));

        System.out.println("La cantidad de animales es = " + animales.size());

        sc.close();
    }
}
