package lessonSeven;

public class SimilarString {

    char[] chars;
    public SimilarString(char[] chars){
        this.chars=chars;
    }

    public SimilarString(String s){
        this.chars= s.toCharArray();
    }

    boolean equals(char[] mass){
        if(chars.length!= mass.length)return false;
        for (int i = 0; i < chars.length; i++) {
            if(mass[i]!=chars[i]) return false;
        }
        return true;
    }
    boolean equals(char[] mass, boolean ignoreCase){
        if(chars.length!= mass.length)return false;
        if (!ignoreCase){
           return equals(mass);
        }else{
            for (int i = 0; i < mass.length; i++) {
                if(Character.toUpperCase(mass[i])!=Character.toUpperCase(chars[i])) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String a = "Android";
        String b = "android";
        SimilarString similarString = new SimilarString(a.toCharArray());
        System.out.println(similarString.equals(b.toCharArray(), false));
    }
    char[] subString(int startIndex){
        char[] newLine = new char[chars.length-startIndex];
        int countIndex = 0;
        for (int i =startIndex; i < chars.length  ; i++) newLine[countIndex++] = chars[i];
        return newLine;
    }
    char[] subString(int startIndex,int endIndex ){
        char[] newLine = new char[endIndex-startIndex];
        int countIndex = 0;
        for (int i =startIndex; i < endIndex  ; i++) newLine[countIndex++] = chars[i];
        return newLine;
    }

}
