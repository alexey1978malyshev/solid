package homework.sys;

import homework.Persister;

public class SystPersister implements Persister {

    Syst system;

    public SystPersister(Syst system) {
        this.system = system;
    }

    @Override
    public void save() {
        System.out.printf("Save system: %s, ver: %s ",system.getName(),system.getVersion());
    }
}
