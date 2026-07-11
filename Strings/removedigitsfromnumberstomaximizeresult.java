package Strings;

public class removedigitsfromnumberstomaximizeresult {
    public static String removeDigit(String number, char digit) {
        int last=-1;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                last=i;
                if(i<number.length()-1 && number.charAt(i+1)>digit){
                    return number.substring(0,i) + number.substring(i+1);
                }
            }
        }
        return number.substring(0,last)+number.substring(last+1);
    }
    public static void main(String[] args) {
        String number="1321";
        char digit=1;
        System.out.print(removeDigit(number, digit));
    }
}
