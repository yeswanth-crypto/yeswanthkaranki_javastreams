import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListStrings {
    public List<String> calculate(List<String> a){
        List<String> result =  check(a,(String s) -> palindrome(s));
        return result;
    }

    private List<String> check(List<String> a, Predicate<String> predicate){
        List<String> result= new  ArrayList<>();
        for(String s : a){
            if (predicate.test(s)){
                result.add(s);
            }
        }
        return result;
    }
    private boolean palindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}