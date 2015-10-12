package org.ensh.core.model;

import org.ensh.core.model.impl.SequenceRegionImpl;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Michael Mueller
 * Date: 06-Aug-2009
 * Time: 10:45:07
 */
public class SequenceRegionFactory {

    private static SequenceRegionFactory ourInstance = new SequenceRegionFactory();

    private static Map<CoordinateSystem, Map<String, SequenceRegion>> coordinateSystem2SequenceRegions = new HashMap<CoordinateSystem, Map<String, SequenceRegion>>();

    public static SequenceRegionFactory getInstance() {
        return ourInstance;
    }

    private SequenceRegionFactory() {
    }

    public SequenceRegion createSequenceRegion(CoordinateSystem coordinateSystem, String sequenceRegionName, int sequenceRegionLength){

        SequenceRegion retVal;

        //String coordinateSystemKey =  coordinateSystem.getName() + "_" + coordinateSystem.getVersion();
        String sequenceRegionKey = sequenceRegionName + "_" + sequenceRegionLength;
        if(coordinateSystem2SequenceRegions.containsKey(coordinateSystem)){

            Map<String, SequenceRegion> sequenceRegions = coordinateSystem2SequenceRegions.get(coordinateSystem);
            if(sequenceRegions.containsKey(sequenceRegionKey)){

                retVal = sequenceRegions.get(sequenceRegionKey);

            } else {

                retVal = new SequenceRegionImpl();
                retVal.setName(sequenceRegionName);
                retVal.setLength(sequenceRegionLength);
                retVal.setCoordinateSystem(coordinateSystem);

                sequenceRegions.put(sequenceRegionKey, retVal);

            }

        } else {

            Map sequenceRegions = new HashMap<String, SequenceRegion>();

            retVal = new SequenceRegionImpl();
            retVal.setName(sequenceRegionName);
            retVal.setLength(sequenceRegionLength);
            retVal.setCoordinateSystem(coordinateSystem);

            sequenceRegions.put(sequenceRegionKey, retVal);

            coordinateSystem2SequenceRegions.put(coordinateSystem, sequenceRegions);

        }

        return retVal;

    }

}
