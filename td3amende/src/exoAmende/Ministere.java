package exoAmende;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b5545af4-2593-11e2-9612-0800270b393c")
public class Ministere {

    @objid ("b5545aed-2593-11e2-9612-0800270b393c")
    public void consulter(final StatCommissariat unStat) {
        System.out.println("nb catA = "+unStat.getCptCatA());
        System.out.println("nb catB = "+unStat.getCptCatB());   
        System.out.println("nb catC = "+unStat.getCptCatC());
    }

    @objid ("732e7a05-2595-11e2-9612-0800270b393c")
    public Ministere() {
    }

}
