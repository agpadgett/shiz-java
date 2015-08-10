public class SnoopDog {
    public static void main(String[] args){}

    public String snoopWords(String words){
        String newWord = "";
        for (int i = 0; i < words.length(); i++) {
            if (i == 0){
                newWord += words.charAt(i);
                }
            else if (words.charAt(i-1) == ' '){
                newWord += words.charAt(i);
            }
            else if (words.charAt(i) == 's') {
                newWord += 'z';
            }
            else {
                newWord += words.charAt(i);
            }
        }
        return newWord;
    }
}
