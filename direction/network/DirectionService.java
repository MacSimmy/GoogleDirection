package horseman.four.com.unite.screens.map.direction.network;

import horseman.four.com.unite.screens.map.direction.constant.DirectionUrl;
import horseman.four.com.unite.screens.map.direction.model.Direction;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Mahendra Chhimwal on 17/1/17.
 */
public interface DirectionService {

    @GET(DirectionUrl.DIRECTION_API_URL)
    Call<Direction> getDirection(@Query("origin") String origin,
                                 @Query("destination") String destination,
                                 @Query("waypoints") String waypoints,
                                 @Query("mode") String transportMode,
                                 @Query("departure_time") String departureTime,
                                 @Query("language") String language,
                                 @Query("units") String units,
                                 @Query("avoid") String avoid,
                                 @Query("transit_mode") String transitMode,
                                 @Query("alternatives") boolean alternatives,
                                 @Query("key") String apiKey);
}
