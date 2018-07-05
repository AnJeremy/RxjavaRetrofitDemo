package cn.syxg.rxjavaretrofitdemo;


import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import cn.syxg.rxjavaretrofitdemo.net.BaseActivity;
import cn.syxg.rxjavaretrofitdemo.net.BaseEntity;
import cn.syxg.rxjavaretrofitdemo.net.BaseObserver;
import cn.syxg.rxjavaretrofitdemo.net.RetrofitFactory;

public class MainActivity extends BaseActivity {

    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("http://fy.iciba.com/ajax.php/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();

        ApiService apiService = retrofit.create(ApiService.class);
        Observable<Translation> call = apiService.getCall();
        call.repeatWhen(new Function<Observable<Object>, ObservableSource<?>>() {
            @Override
            public ObservableSource<?> apply(Observable<Object> objectObservable) throws Exception {
                return objectObservable.flatMap(new Function<Object, ObservableSource<?>>() {
                    @Override
                    public ObservableSource<?> apply(Object o) throws Exception {

                        if(i >3){

                            return Observable.error(new Throwable("结束"));

                        }

                        return Observable.just(1).delay(2, TimeUnit.SECONDS);
                    }
                });
            }
        }).subscribeOn(Schedulers.io())
          .subscribeOn(AndroidSchedulers.mainThread())
          .subscribe(new Observer<Translation>() {
              @Override
              public void onSubscribe(Disposable d) {

              }

              @Override
              public void onNext(Translation value) {
                    value.show();
                    i++;

              }

              @Override
              public void onError(Throwable e) {
                  Log.d("RxJava",e.getMessage()+"");
              }

              @Override
              public void onComplete() {

              }
          });*/


        RetrofitFactory.getInstence().API().getCall().compose(this.<BaseEntity<Translation>>setThread())
        .subscribe(new BaseObserver<Translation>() {
            @Override
            protected void onSuccess(BaseEntity<Translation> t) throws Exception {

                Toast.makeText(MainActivity.this,t.getData().getOut()+"",Toast.LENGTH_LONG).show();
                //t.getData().show();

            }

            @Override
            protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                Log.e("-----",e+" ");
            }


        });

    }



}
