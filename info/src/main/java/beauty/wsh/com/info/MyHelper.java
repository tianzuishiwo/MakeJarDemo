package beauty.wsh.com.info;

import android.content.Context;
import android.os.Handler;
import android.widget.TextView;

/**
 * Created by wuShaoHua on 2016/10/4.
 */

public class MyHelper {
    private static MyHelper mInstance = new MyHelper();
    private MyHelper() {
    }
    public static MyHelper getmInstance(){
        return mInstance;
    }
    
    public void getContentFromNet(Context context, Handler handler, TextView tvContent){
        MyHttpGet instance = MyHttpGet.getmInstance();
        instance.init(context,handler,tvContent);
        instance.start();
    }
    
    public String getInfo(){
        String info = MyInfo.getInfo();
        return info;
    }
}
