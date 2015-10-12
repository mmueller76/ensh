package org.ensh.core.model.impl;

import org.ensh.core.model.RegulatoryFactor;
import org.ensh.core.model.RegulatoryFeatureObject;
import test.Testable;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 10:05:53<br>
 */
public class RegulatoryFeature extends AbstractStrandedFeature {

    private String name;
    private RegulatoryFactor regulatoryFactor;
    private Set<RegulatoryFeatureObject> objects;

    @Testable
    public String getName() {
        return name;
    }

    @Testable
    public void setName(String name) {
        this.name = name;
    }

    @Testable
    public RegulatoryFactor getRegulatoryFactor() {
        return regulatoryFactor;
    }

    @Testable
    public void setRegulatoryFactor(RegulatoryFactor regulatoryFactor) {
        this.regulatoryFactor = regulatoryFactor;
    }

    @Testable
    public Set<RegulatoryFeatureObject> getObjects() {
        return objects;
    }

    @Testable
    public void setObjects(Set<RegulatoryFeatureObject> objects) {
        this.objects = objects;
    }


    public String toString() {
        return "RegulatoryFeature{" +
                "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
