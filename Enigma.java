public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"
    };


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){        
        //TODO
        String decryptString = "";

        for(int i = 0;i < message.length();i++){
            char currentChar = message.charAt(i);

            currentChar = rotors[2].charAt(rotors[2].indexOf(currentChar));
            currentChar = rotors[1].charAt(rotors[1].indexOf(currentChar));
            currentChar = rotors[0].charAt(rotors[0].indexOf(currentChar));
 
            System.out.println(currentChar);
            decryptString += currentChar;

            rotate();
        }

        return decryptString;  
    }


    
    public String encrypt(String message){
        String encrypString = "";


        for(int i = 0;i < message.length();i++){
            char currentChar = message.charAt(i);

            currentChar = rotors[0].charAt(rotors[0].indexOf(currentChar));
            currentChar = rotors[1].charAt(rotors[1].indexOf(currentChar));
            currentChar = rotors[2].charAt(rotors[2].indexOf(currentChar));
 
            System.out.println(currentChar);
            encrypString += currentChar;

            rotate();
        }

        return encrypString;  
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
