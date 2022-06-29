import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String name = "Himneesh Goyal";
        name= name.replace(' ', '_');
        System.out.println(name);

       String letter = "Dear <|name|> , Thanks a lot! ";
        letter = letter.replace("<|name|>", "Himneesh");
        System.out.println(letter);

        String name1 = "  My  name  is    Himneesh   ";
        System.out.println(name1.indexOf("  "));
        System.out.println(name1.indexOf("   "));


    }
}
