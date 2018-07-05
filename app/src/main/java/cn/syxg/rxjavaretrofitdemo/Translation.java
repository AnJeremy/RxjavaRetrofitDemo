package cn.syxg.rxjavaretrofitdemo;

/**
 * Created by Administrator on 2018/6/27.
 */

public class Translation {

   /* private int status;

    private content content;
    private static class content {
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;
    }

    //定义 输出返回数据 的方法
    public void show() {
        Log.d("RxJava", content.out );
    }*/
    private String from;
    private String to;
    private String vendor;
    private String out;
    private int errNo;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getVendor() {
        return vendor;
    }

    public String getOut() {
        return out;
    }

    public int getErrNo() {
        return errNo;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public void setErrNo(int errNo) {
        this.errNo = errNo;
    }
}
