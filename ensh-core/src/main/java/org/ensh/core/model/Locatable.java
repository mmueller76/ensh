package org.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 15:44:41<br>
 */
public interface Locatable<L extends Location> {

    L getLocation();

    void setLocation(L location);

}
