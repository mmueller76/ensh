package uk.ac.ebi.ensh.module.model.impl;

import uk.ac.ebi.ensh.module.model.Component;
import uk.ac.ebi.ensh.module.model.Module;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 21-Dec-2007<br/>
 * Time: 15:46:02<br/>
 */
public class ModuleComponent extends ComponentImpl<Module> implements Component<Module> {

    public ModuleComponent() {
    }

    public ModuleComponent(Module object) {
        super(object);
    }
    
}
