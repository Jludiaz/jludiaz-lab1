public class Rotor {

    private String rotorValues;
    private char startChar;
    private int currentIndex = 0;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    public boolean rotate(){
        //TODO
        if (startChar =  rotorValues.charAt(currentIndex++)){
            return true;
        }

        return false;
    }

    public int indexOf(char c){
        //TODO
        int index = rotorValues.indexOf(c);
        return index;
    }

    public char charAt(int idx){
        //TODO
        char character = rotorValues.charAt(idx);
        return character;
    }
}
    
