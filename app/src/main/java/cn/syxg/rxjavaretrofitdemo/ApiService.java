package cn.syxg.rxjavaretrofitdemo;


import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/6/27.
 */

public interface ApiService {

    @GET("ajax.php?a=fy&f=auto&t=auto&w=hi%20world")
    Observable<Translation> getCall();

}
