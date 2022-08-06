import java.lang.reflect.Method;

public class Test {
    public static void main(String[] arg) {
        String ninja = "Coding Dojo is great!";
        int length = ninja.length();
        System.out.println("string length is : " + length);

        //concatenate strings
        String string1 = "Hello my name is, ";
        String string2 = "Adrian";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        //Format 
        String formatingggg = String.format("Hi %s, you owe me $%.2f!", "Jack", 25.0);
        System.out.println(formatingggg);

        //IndexOf
        String trial = "Welcome to Coding Dojo!";
        int a = trial.indexOf("Coding");
        int b = trial.indexOf("to");
        int c = trial.indexOf("elco");
        int d = trial.indexOf("pizza");
        System.out.println(a + " " + b + " " + c + " " + d + " ");

        //Trim
        //what this does is remove all the space from the beginning and the end of the string.. nothing in the middle
        String sentence = "   Spaces really everywhere!!      ";
        System.out.println(sentence.trim());

        String y = "HELLO";
        String z = "world";
        System.out.println(y.toLowerCase() + z.toUpperCase());

        System.out.println("------------");
        // using == and .equals()

        String w = "same string";
        String x = "same string";
        System.out.println( w == x);
        System.out.println("------------");

        w = new String("same letters");
        x = new String("same letters");
        System.out.println(w == x); // this returns false because they are not the same object in memory
        System.out.println(w.equals(x)); // this returns true because they are have to same characters
        System.out.println("------------");

        String n = new String("Dojo");
        System.out.println( n == "Dojo");
        System.out.println("------------");

        MethodsFile testing = new MethodsFile();
        System.out.println(testing.greeter("Potato"));
        System.out.println(testing.greeter("Smiley",22));

        String dateMessage = testing.theDateToday();
        System.out.println(dateMessage);
    }
}