package org.ensh.core.model.impl;

import org.ensh.core.model.StrandedLocation;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 17:36:28<br>
 */
public class RegulatorySearchRegion extends AbstractStrandedFeature {

    private int id;
    private String name;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getName() {
        return name;
    }

    @Testable
    public void setName(String name) {
        this.name = name;
    }

    @Testable
    public void setLocation(StrandedLocation location) {
        this.location = location;
    }

    @Testable
    public void setAnalysis(AnalysisImpl analysis) {
        this.analysis = analysis;
    }
}
