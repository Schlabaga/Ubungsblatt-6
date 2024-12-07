public class StringArray {

    private String[] array;

    // Make a constructor
    public StringArray(int size) {
        this.array = new String[size];
    }

    // Verify if index is valid.
    boolean isValidIndex(int index){
        if(index >= 0 && index <  this.array.length - 1){
            return true;
        }
        System.out.println("Index out of range");
        return false;
    }

    // Getter method
    public String get(int index){
        if(isValidIndex(index)){
            return array[index];
        }
        return "Index out of range";
    }

    // Setter method
    public void set(int index, String value){
        if(isValidIndex(index)){
            array[index] = value;
        }
    }

    // Size method
    public int size(){
        return this.array.length;
    }

    // Remove method
    public void remove(int index){
        if (isValidIndex(index)) {
            this.array[index] = null;
        }
    }


    public boolean isFullArray(){
        int count = 0;
        for(String i : this.array){
            if(i != null){
                count ++;
            }
        }
        if(count >= this.array.length ){
            return true;
        }
        return false;
    }

    // Check if array is full. If yes resize it with 50% of the size
    void resizeArray(){

        if(isFullArray()){
            String[] newArray = new String[this.array.length + this.array.length / 2];

            for(int i = 0 ; i < this.array.length; i++){
                newArray[i] = this.array[i];
            }

            this.array = newArray;

        }
    }

    public int add(String value){
        this.resizeArray();
        int index = 0;

        for(int i = 0; i < this.array.length; i++){
            if(this.array[i] == null){
                this.array[i] = value;
                index = i;
                break;
            }
        }
        return index;
    }
}
