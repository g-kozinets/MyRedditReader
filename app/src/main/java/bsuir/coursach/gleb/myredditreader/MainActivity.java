package bsuir.coursach.gleb.myredditreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import bsuir.coursach.gleb.myredditreader.model.Feed;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

   private static final String baseUrl = "https://www.reddit.com/r/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        ReddirRssApi redditApi = retrofit.create(ReddirRssApi.class);

        Call<Feed> call = redditApi.getFeed();

        call.enqueue(new Callback<Feed>() {
            @Override
            public void onResponse(Call<Feed> call, Response<Feed> response) {
                Log.d(TAG, "onResponse: " + response.body().toString());
                Log.d(TAG, "onResponse: HTTP " + response.toString());

            }

            @Override
            public void onFailure(Call<Feed> call, Throwable t) {
                Log.e(TAG, "onFailure: Can not get data from rss" + t.getMessage());
                Toast.makeText(MainActivity.this, "Can not get data from rss", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
