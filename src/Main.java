
public class Main {
    public static void main(String[] args) {

        SimpleParser simple = new SimpleParser();

        simple.parse(args);
        System.out.println(simple.getOutFile() + " " + simple.getInFile());
    }
}