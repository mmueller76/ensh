package uk.ac.ebi.ensh.module.model.impl;

import uk.ac.ebi.ensh.core.model.Transcript;
import uk.ac.ebi.ensh.module.model.Component;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 20-Nov-2007<br/>
 * Time: 19:33:22<br/>
 */
public class ComponentImpl<O>  extends AbstractComponent<O> implements Component<O> {

    public ComponentImpl() {
    }

    public ComponentImpl(O object) {
        super(object);
    }
}
