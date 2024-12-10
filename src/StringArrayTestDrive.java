public class StringArrayTestDrive {

    public static void main(String[] args) {

        StringArray StringArray = new StringArray(4);

        // Test of set method
        StringArray.set(0,"Periódico De Ayer");
        StringArray.set(1,"Fuego En El 23");
        StringArray.set(2,"Pedro Navaja");
        StringArray.set(3,"Vivir Mi Vida");


        // Test of add method

        System.out.println(StringArray.add("Sin Salsa No Hay Paraíso"));

        // StringArray.printArray();


        // Test of get method (if empty returns null)

        // Test for size() method
        System.out.println("Size of the Array:" + StringArray.size());

        // Test for remove method
        System.out.println("Alte Wert: " + StringArray.get(2));
        StringArray.remove(2);
        System.out.println("Neue Wert: " + StringArray.get(2));

        // 1.3.1

        // Feste GröBe nicht verändbar (tailel fixe pas modifiable)
        // Keinen Integrate Methoden

        // Unterschieden zwischen Klassik und Objekt
        // Mit Objeckt muss man Methoden zu benutzen um, die Daten zu manipulieren

        // Wir haben Methoden (add, remove, resize und validate indexs) gemacht

        // Die Automatik resize würde ich gern nativ von Java implementiert sehen.

        /*
        Um Fehler zu melden, kann der Wrapper Ausnahmen erheben (IndexOutOfBoundsException) oder bestimmte Werte
        zurückgeben (null oder ein Boolean). Methoden wie get könnten anstelle von Meldungen Ausnahmen erheben und
        remove einen Boolean zurückgeben, um den Erfolg anzuzeigen. Methoden wie contains, isEmpty oder indexOf würden
         den Benutzern helfen, Fehler zu vermeiden, indem sie den Zustand des Arrays überprüfen, bevor sie handeln.
         */

    }

}
