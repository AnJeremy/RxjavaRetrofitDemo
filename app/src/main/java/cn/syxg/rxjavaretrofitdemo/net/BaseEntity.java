package cn.syxg.rxjavaretrofitdemo.net;

/**
 * Created by Administrator on 2018/7/5.
 */

public class BaseEntity<T> {

    private int status;
    private T content;

    public int getStatus() {
        return status;
    }

    public T getData() {
        return content;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setData(T data) {
        this.content = data;
    }

    /*private static int SUCCESS_CODE=42440;//成功的code
    private int code;
    private String msg;
    private T data;


    public boolean isSuccess(){
        return getCode()==SUCCESS_CODE;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }*/

}

