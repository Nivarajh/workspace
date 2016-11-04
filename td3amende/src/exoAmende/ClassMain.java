package exoAmende;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a240e2a5-2595-11e2-9612-0800270b393c")
public class ClassMain {

    @objid ("afe17bb5-2595-11e2-9612-0800270b393c")
    public static void main(final String[] arg) {
        Ministere m = new Ministere();
        StatCommissariat s = new StatCommissariat();
        Commissariat c = new Commissariat(m, s);
        Smartphone sm = new Smartphone(c);
        sm.executer();
    }

}
