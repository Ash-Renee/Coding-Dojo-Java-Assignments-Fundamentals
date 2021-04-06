public class StringManipulator{
    public String trimAndConcat(String str1, String str2) {
        String newString = str1.trim() + str2.trim();
        return newString;
    }
    public Integer getIndexOrNull(String aStr, char aChar){
        Integer value = aStr.indexOf(aChar);
        return value;
    }
    public Integer getIndexOrNull(String bStr, String otherString){
        Integer value= bStr.indexOf(otherString);
        return value;
    }
    public String concatSubString(String str1, int int1, int int2, String str2){
        String str3 = str1.substring(int1, int2);
        String lastString = str3 + str2;
        return lastString;
    }
}