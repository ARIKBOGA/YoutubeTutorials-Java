
import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("pink");
        colors.add("red");


        System.out.println(colors);
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.containsAll(List.of("pink","red")));
    }
}
