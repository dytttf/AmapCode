package com.autonavi.minimap.drive.overlay;

public class RouteCarResultEndPointOverlay extends RouteCarResultPointOverlay {
    public int getCollideType() {
        return 6;
    }

    public RouteCarResultEndPointOverlay(bty bty) {
        super(bty);
    }

    public void onUpdateDirection(int i, int i2) {
        boolean z = false;
        boolean z2 = i2 != -1;
        if (i2 != -1) {
            z = true;
        }
        setPointItemVisble(i, z2, z);
    }
}
