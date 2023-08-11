package homework.sys;

import homework.Reportable;

public class SystemReporter  implements Reportable {
    private Syst system;

    public SystemReporter(Syst system) {
        this.system = system;
    }

    @Override
    public void report() {
        System.out.printf("Report for system: %s, version: %s", system.getName(), system.getVersion());
    }
}
