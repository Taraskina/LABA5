package excep;

public class NeTaCommandException extends Exception {
    public NeTaCommandException(String cmd) {
        super(cmd);
    }
}
