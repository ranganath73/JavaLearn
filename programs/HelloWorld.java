import lib.FileResource;

public class HelloWorld {
    public void runHello() {
        FileResource f;
        f = new FileResource("file.txt");
        for (String lines : f.lines()) {
            System.out.println(lines);
        }
    }
}