
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Input path:");

        // usage of buffer I/O streams
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String p_file = reader.readLine();

        List<String> lines = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(p_file))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // sample of sorting
        Comparator<String> comparator = (a, b) -> a.compareTo(b);
        comparator.thenComparing((a, b) -> a.compareTo(b));
        Stream<String> stream = lines.stream().sorted(comparator);

        stream.sorted(comparator);//сортируем
        Collections.sort(lines, comparator); //сортируем
    }

}