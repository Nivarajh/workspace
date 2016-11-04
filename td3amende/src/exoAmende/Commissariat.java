package exoAmende;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b5545af1-2593-11e2-9612-0800270b393c")
public class Commissariat {
    @objid ("b5545afc-2593-11e2-9612-0800270b393c")
    private StatCommissariat monStat;

    @objid ("b5545af7-2593-11e2-9612-0800270b393c")
    private Ministere leMinistere;


    @objid ("b5545aec-2593-11e2-9612-0800270b393c")
    public void enregistrer(final Amende uneAmende) {
        //codage rapide pour tester
        monStat.setCptCatA(1);
        leMinistere. consulter(monStat);
    }

    @objid ("ad5c8115-2594-11e2-9612-0800270b393c")
    public Commissariat(final Ministere ministere, final StatCommissariat stat) {
        leMinistere = ministere;
        monStat = stat;
    }

}
