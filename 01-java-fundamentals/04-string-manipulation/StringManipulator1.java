public class StringManipulator1 {
    public String trimAndConcat(String name,String lastname){
        return name.trim().concat(lastname.trim());
    }
    public Integer getIndexOrNull(String stringg, char charecter) {
        Integer indexOrNull = stringg.indexOf(charecter);
        if(indexOrNull < 0) {
            indexOrNull = null;
        }
        return indexOrNull;
    }
    public Integer getIndexOrNull(String str1, String str2) {
        Integer indexOrNull = str1.indexOf(str2);
        if(indexOrNull < 0) {
            indexOrNull = null;
        }
        return indexOrNull;
    }
    public String concatSubstring(String substringMe, int start, int end, String concatMe) {
        concatMe = substringMe.substring(start, end) + concatMe;
        return concatMe;
    
    }

}

