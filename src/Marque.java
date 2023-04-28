import java.security.PrivateKey;

public class Marque {
    private String name;
    private int creationDate;
    private String origin;
    public Marque(String name, int creationDate, String origin){
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
