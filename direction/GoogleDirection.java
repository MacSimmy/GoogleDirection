package horseman.four.com.unite.screens.map.direction;

import horseman.four.com.unite.screens.map.direction.request.DirectionOriginRequest;

/**
 * Created by Mahendra Chhimwal on 17/1/17.
 */
public class GoogleDirection {
    public static DirectionOriginRequest withServerKey(String apiKey) {
        return new DirectionOriginRequest(apiKey);
    }
}
