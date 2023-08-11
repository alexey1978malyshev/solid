package homework.sys;

public class Syst {
    private final String name;
    private final String version;

    public Syst(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }
}
