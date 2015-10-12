package org.ensh.core.model.impl;

import org.ensh.core.model.Gene;
import org.ensh.core.model.RegulatoryFactorCoding;
import org.ensh.core.model.Transcript;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 09:54:46<br>
 */
public class RegulatoryFactorCodingImpl extends RegulatoryFactorImpl implements RegulatoryFactorCoding {

    private Transcript transcript;
    private Gene gene;

    @Testable
    public Transcript getTranscript() {
        return transcript;
    }

    @Testable
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    @Testable
    public Gene getGene() {
        return gene;
    }

    @Testable
    public void setGene(Gene gene) {
        this.gene = gene;
    }
}
