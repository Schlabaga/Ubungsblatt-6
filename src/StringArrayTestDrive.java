public class StringArrayTestDrive {

    public static void main(String[] args) {

        StringArray stringArray = new StringArray(3);

        // Test of set method
        stringArray.set(2,"Test");

        // Test of get method (if empty returns null)
        System.out.println(stringArray.get(2));

        // Test for size() method
        System.out.println(stringArray.size());

        // Test for remove method
        System.out.println("Alte Wert: " + stringArray.get(2));
        stringArray.remove(2);
        System.out.println("Neue Wert: " + stringArray.get(2));

        // Test of add method
        System.out.println(stringArray.add("NewTest"));


    }

}
