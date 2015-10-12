package org.ensh.core.model.impl;

import org.ensh.core.model.AlignmentFeature;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 12:15:20<br>
 */
public class SupportingFeature {

    public AlignmentFeature alignmentFeature;

    @Testable
    public AlignmentFeature getAlignmentFeature() {
        return alignmentFeature;
    }

    @Testable
    public void setAlignmentFeature(AlignmentFeature alignmentFeature) {
        this.alignmentFeature = alignmentFeature;
    }
}
