package horseman.four.com.unite.screens.map.direction.request;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Mahendra Chhimwal on 17/1/17.
 */
public class DirectionOriginRequest {
    private String apiKey;

    public DirectionOriginRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public DirectionDestinationRequest from(LatLng origin) {
        return new DirectionDestinationRequest(apiKey, origin);
    }
}
