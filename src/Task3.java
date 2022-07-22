public class Task3 {
    public static void main(String[] args) {

        String test = "Bowers & Wilkins (B&W) — частная британская компания, производитель : акустических систем высокого класса, наушников и аудиосистем для автомобилей.";
        System.out.println(test);

        String[] split = test.split(":");
        for (String Split : split) {
            System.out.println(Split);
        }
        System.out.println();

    }
}
