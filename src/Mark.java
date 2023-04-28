import java.security.PrivateKey;

public class Mark {
    private final String name;
    private final int creationDate;
    private final String origin;
    public Mark(String name, int creationDate, String origin){
        this.name = name;
        this.creationDate = creationDate;
        this.origin = origin;
    }

    public String getMarkName() {
        return name;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public String getOrigin() {
        return origin;
    }
}
