package dip1.model;

import dip1.model.ReportItem;

import java.util.List;

public interface Reportable {
    public void output(List<ReportItem> items);

}
