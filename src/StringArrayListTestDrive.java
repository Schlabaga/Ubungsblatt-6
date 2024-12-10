import com.example.main.StringArrayList;

public class StringArrayListTestDrive {

    public static void main(String[] args) {
        // Test 1: Erstellen eines ArrayList und Überprüfung der Größe
        StringArrayList array1 = new StringArrayList();
        System.out.println(array1.size()); // Soll ausgeben: 0

        // Test 2: Test von set() und get() mit gültigen Indizes
        array1.add("Hello");
        System.out.println(array1.get(0)); // Soll ausgeben: "Hello"

        // Test 3: Test für den Zugriff auf einen ungültigen Index
        System.out.println(array1.get(4)); // Soll ausgeben: "Get(4): Index out of range"
        array1.set(4, "Invalid");          // Soll ausgeben: "4: Index not valid!"

        // Test 4: Test der remove()-Methode
        array1.add("ToRemove");
        System.out.println(array1.get(1)); // Soll ausgeben: "ToRemove"
        array1.remove(1);
        System.out.println(array1.get(1)); // Soll ausgeben: null

        // Test 5: Test für das Vergrößern der ArrayList
        StringArrayList array2 = new StringArrayList();
        array2.add("Element1");
        array2.add("Element2");
        array2.add("Element3");
        array2.add("Element4");            // ArrayList vergrößert sich automatisch
        System.out.println(array2.size());

        // Test 6: Test der add()-Methode
        int index = array2.add("NewElement");
        System.out.println(array2.get(index)); // Soll ausgeben: "NewElement"

        // Test 7: Test mit einem vollständig gefüllten ArrayList
        StringArrayList array3 = new StringArrayList();
        array3.add("Item1");
        array3.add("Item2");
        array3.add("Item3");               // ArrayList vergrößert sich automatisch
        System.out.println(array3.size());  // Soll eine Größe >= 3 ausgeben

        // Test 8: Test der size()-Methode
        System.out.println(array3.size());  // Soll die aktuelle Größe ausgeben

        // Test 9: Test mit einem leeren ArrayList (Größe 0)
        StringArrayList array4 = new StringArrayList();
        array4.add("FirstItem");           // ArrayList wächst automatisch
        System.out.println(array4.get(0)); // Soll ausgeben: "FirstItem"

        // Test 10: Test mit einem teilweise gefüllten ArrayList
        StringArrayList array5 = new StringArrayList();
        array5.add("Part1");
        array5.add("Part2");
        array5.remove(1);
        array5.add("Part3");               // Füllt den freien Platz
        System.out.println(array5.get(1)); // Soll ausgeben: "Part3"
    }
}