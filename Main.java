

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.addListener("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.addListener("save", new EmailNotificationListener("admin@example.com"));
        editor.addListener("save", new SmsNotificationListener("+55 83 9999-9999"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

