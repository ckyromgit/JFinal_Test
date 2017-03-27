/**
 * Created by keyou.chen on 2017/3/24.
 */

import com.jfinal.core.Controller;

public class HelloController extends Controller {
    public void index(){
        renderText("hello JFinal!");
    }
    public void test(){
        renderText("Hello JFinal Test");
    }
}
