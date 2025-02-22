import java.util.ArrayList;
import java.util.List;

public class Array_1832{
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static public boolean checkIfPangram(String sentence) {
        List<Character> pangram = new ArrayList<>();
   
        for(int i = 0;i< sentence.length();i++){
           if(pangram.contains(sentence.charAt(i))) {
            continue;
        }
           else {
            pangram.add(sentence.charAt(i));
           }
        }
   
        if(pangram.size() == 26){
           return true;
        }
        
        return false;
       }
}