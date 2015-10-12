/**
 * Created by IntelliJ IDEA.
 * User: Michael Mueller
 * Date: 30-Jul-2009
 * Time: 16:16:04
 */
package org.ensh.core.model;

import org.ensh.core.model.impl.LocationImpl;
import org.ensh.core.model.impl.StrandedLocationImpl;

public class LocationFactory {

    private static LocationFactory ourInstance = new LocationFactory();

    private static CoordinateSystemFactory coordinateSystemFactory = CoordinateSystemFactory.getInstance();
    private static SequenceRegionFactory sequenceRegionFactory = SequenceRegionFactory.getInstance();

    public static LocationFactory getInstance() {
        return ourInstance;
    }

    private LocationFactory() {
    }

    public Location createLocation(String coordinateSystemName,
                                   String coordinateSystemVersion,
                                   String sequenceRegionName,
                                   int sequenceRegionLength,
                                   int sequenceRegionStart,
                                   int sequenceRegionEnd){

        CoordinateSystem coordinateSystem = coordinateSystemFactory.createCoordinateSystem(coordinateSystemName, coordinateSystemVersion);
        SequenceRegion sequenceRegion = sequenceRegionFactory.createSequenceRegion(coordinateSystem, sequenceRegionName, sequenceRegionLength);

        Location retVal = new LocationImpl();

        retVal.setSequenceRegion(sequenceRegion);
        retVal.setSequenceRegionStart(sequenceRegionStart);
        retVal.setSequenceRegionEnd(sequenceRegionEnd);

        return retVal;

    }

    public StrandedLocation createLocation(String coordinateSystemName,
                                   String coordinateSystemVersion,
                                   String sequenceRegionName,
                                   int sequenceRegionLength,
                                   int sequenceRegionStart,
                                   int sequenceRegionEnd,
                                   int strand){

        CoordinateSystem coordinateSystem = coordinateSystemFactory.createCoordinateSystem(coordinateSystemName, coordinateSystemVersion);
        SequenceRegion sequenceRegion = sequenceRegionFactory.createSequenceRegion(coordinateSystem, sequenceRegionName, sequenceRegionLength);

        StrandedLocation retVal = new StrandedLocationImpl();

        retVal.setSequenceRegion(sequenceRegion);
        retVal.setSequenceRegionStart(sequenceRegionStart);
        retVal.setSequenceRegionEnd(sequenceRegionEnd);
        retVal.setSequenceRegionStrand(strand);

        return retVal;

    }


}
