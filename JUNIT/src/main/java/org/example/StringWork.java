package org.example;

public class StringWork {
    private String str;

    public StringWork(String str) {
        this.str = str;
    }

    public String palindrom(){
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String pal = buffer.toString();
        return pal;
    }

    private static boolean isVowel(char c){
        return "aeiou".indexOf(c) != -1;
    }
    private static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }

    public int countVowels(){
        if(str == null){
            return 0;
        }
        int count = 0;
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char c = lowerStr.charAt(i);
            if (isVowel(c)){
                count++;
            }
        }
        return count;
    }
    public int countConsonant(){
        if(str == null){
            return 0;
        }
        int count = 0;
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char c = lowerStr.charAt(i);
            if (isConsonant(c)){
                count++;
            }
        }
        return count;
    }

    public int countOccurrences(String word){
        if(str.isEmpty() || word.isEmpty()){
            return 0;
        }

        String[] words = str.split("\\ss+");

        int count = 0;
        for (String w: words) {
            if (w.equals(word))
                count++;
        }
        return count;
    }
}
