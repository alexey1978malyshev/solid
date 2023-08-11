package dip1.model;

import dip1.model.ReportItem;
import dip1.model.Reportable;

import java.util.List;

public class ReportManager {
    private final Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void printReport(List<ReportItem> items){
        reportable.output(items);
    }

}

