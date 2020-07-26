import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TypeofString {
    public List<String> calculate(List<String> a){
        Stream<String> result = a.stream()
                .filter(name -> ( name.startsWith("a") && name.length()==3 ));
        return  result.collect(Collectors.toList());
    }
}
