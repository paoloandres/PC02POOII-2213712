import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ejercicio9 {
    
    Map<String, List<String>> user = new HashMap<>();
user.put("Carolina", Arrays.asList("051-922-977234",
"051-998-92223"));
user.put("Bertha", Arrays.asList("051-991-927204",
"051-991-96263"));
user.put("Marco", Arrays.asList("051-931-977003",
"051-961-98861"));
List<String> names = user.keySet().stream()
.map(String::toUpperCase)
.collect(Collectors.toList());
System.out.print(names);
List<String> phones = user.values().stream()
.flatMap(Collection::stream)
.collect(Collectors.toList());
System.out.println(phones);
}
