package horseman.four.com.unite.screens.map.direction.network;

import horseman.four.com.unite.screens.map.direction.constant.DirectionUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mahendra Chhimwal on 17/1/17.
 */
public class DirectionConnection {
    private static DirectionConnection connection;

    public static DirectionConnection getInstance() {
        if (connection == null) {
            connection = new DirectionConnection();
        }
        return connection;
    }

    private DirectionService service;

    public DirectionService createService() {
        if (service == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(getClient())
                    .baseUrl(DirectionUrl.MAPS_API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service = retrofit.create(DirectionService.class);
        }
        return service;
    }

    private OkHttpClient getClient() {
        return createDefaultClient();
    }

    private OkHttpClient createDefaultClient() {
        boolean setLogEnabled = true;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (setLogEnabled) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(interceptor);
        }
        return builder.build();
    }
}
