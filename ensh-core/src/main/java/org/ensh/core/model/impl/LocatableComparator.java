package org.ensh.core.model.impl;

import org.ensh.core.model.Locatable;

import java.util.Comparator;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 16:33:59<br>
 */
public class LocatableComparator implements Comparator<Locatable> {

    @Testable
    public int compare(Locatable locatable1, Locatable locatable2) {
        return locatable1.getLocation().compareTo(locatable2.getLocation());
    }
}
