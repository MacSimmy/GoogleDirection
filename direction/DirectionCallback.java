package horseman.four.com.unite.screens.map.direction;


import horseman.four.com.unite.screens.map.direction.model.Direction;

/**
 * Created by Mahendra Chhimwal on 17/1/17.
 */
public interface DirectionCallback {
    void onDirectionSuccess(Direction direction, String rawBody);

    void onDirectionFailure(Throwable t);
}
