import java.util.Date;
public class MethodsFile {
    public String greeter(String name) {
        return "Hello," + name;
    }
    public String greeter(String name, Integer age) {
        return "Hello," + name + " you are " + age + " years old";
    }

    public String theDateToday() {
        Date date = new Date();
        return "Current date is" + date;
    }
}
