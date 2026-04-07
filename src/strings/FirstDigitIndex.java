public class FirstDigitIndex {
    public static int indexOfFirstDigit(String text){
        for(int i = 0; i < text.length(); i++){
            if(Character.isDigit(text.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
