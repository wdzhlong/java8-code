package modernjavainaction.chap04;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @Description
 * @Author henry <henry.zheng@inmobi.com>
 * @Version V1.0.0
 * @Date 2022/1/24
 */
public class JsTest {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName( "JavaScript" );

        System.out.println(engine.getClass().getName());
        System.out.println( "Result:" + engine.eval( "function f() { return 1; }; f() + 1;" ) );
    }
}
