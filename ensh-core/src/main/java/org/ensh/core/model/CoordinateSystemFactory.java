package org.ensh.core.model;

import org.ensh.core.model.impl.CoordinateSystemImpl;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Michael Mueller
 * Date: 06-Aug-2009
 * Time: 10:32:18
 */
public class CoordinateSystemFactory {

    private static CoordinateSystemFactory ourInstance = new CoordinateSystemFactory();

    private static Map<String, CoordinateSystem> coordinateSystems = new HashMap<String, CoordinateSystem>();

    public static CoordinateSystemFactory getInstance() {
        return ourInstance;
    }

    private CoordinateSystemFactory() {
    }

    public CoordinateSystem createCoordinateSystem(String coordinateSystemName, String coordinateSystemVersion){

        String key = coordinateSystemName+ "_" + coordinateSystemVersion;
        CoordinateSystem retVal;
        if(coordinateSystems.containsKey(key)){
            retVal = coordinateSystems.get(key);
        } else {
            retVal = new CoordinateSystemImpl();
            retVal.setName(coordinateSystemName);
            retVal.setVersion(coordinateSystemVersion);
            coordinateSystems.put(key, retVal);
        }

        return retVal;

    }

}
