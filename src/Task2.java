public class Task2 {
    public static void main(String[] args) {

        String string1 = "Bowers & Wilkins (B&W) ";
        String string2 = "частная британская компания, производитель ";    // створили 3 Стрінгових змінних
        String string3 = "акустических систем высокого класса, наушников и аудиосистем для автомобилей.";

        long longS = System.nanoTime();         //  відобразимо скльки часу буде компілюватись код
        System.out.println(string1 + string2 + string3);     // Провели конкатенацію 3х змінних класичним методом через опертор +
        long longF = System.nanoTime();
        System.out.println("Час компіляції при + " + (longF - longS) + " ms.");

        System.out.println();

        long longS1 = System.nanoTime();   //  відобразимо скльки часу буде компілюватись код
        System.out.println(string1.concat(string2).concat(string3));   // Провели конкатенацію 3х змінних через метод .concat()
        long longF1 = System.nanoTime();
        System.out.println("Час компіляції при методі .concat() " + (longF1 - longS1) + " ms.");

        System.out.println();

        long longS2 = System.nanoTime();   //  відобразимо скльки часу буде компілюватись код
        String StringAppend = new StringBuilder().append(string1).append(string2).append(string3).toString();    // Провели конкатенацію 3х змінних через метод .append()
        System.out.println(StringAppend);
        long longF2 = System.nanoTime();
        System.out.println("Час компіляції при методі .append() " + (longF2 - longS2) + " ms.");
    }
}
