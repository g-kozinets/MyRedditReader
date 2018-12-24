package bsuir.coursach.gleb.myredditreader;

import bsuir.coursach.gleb.myredditreader.model.Feed;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ReddirRssApi {

    String baseUrl = "https://www.reddit.com/r/";

    @GET("anime/.rss")
    Call<Feed> getFeed();
}
