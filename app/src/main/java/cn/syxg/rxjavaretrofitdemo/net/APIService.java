package cn.syxg.rxjavaretrofitdemo.net;

import cn.syxg.rxjavaretrofitdemo.Translation;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/7/4.
 */

public interface APIService {


    @GET("ajax.php?a=fy&f=auto&t=auto&w=hi%20world")
    Observable<BaseEntity<Translation>> getCall();

}
