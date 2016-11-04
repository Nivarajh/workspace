package exoAmende;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b5545afd-2593-11e2-9612-0800270b393c")
public class Smartphone {
    @objid ("b5545ae8-2593-11e2-9612-0800270b393c")
    private List<Amende> mesAmendes = new ArrayList<Amende> ();

    @objid ("b5545aee-2593-11e2-9612-0800270b393c")
    private Commissariat monCommissariat;


    @objid ("46eeb795-2594-11e2-9612-0800270b393c")
    public Smartphone(final Commissariat comm) {
        monCommissariat = comm;
    }

    @objid ("819410c5-2594-11e2-9612-0800270b393c")
    public void executer() {
        Amende a = new Amende();
        a.setCategorie("A");
        mesAmendes.add(a);
        monCommissariat.enregistrer(a);
        System.out.println("FIN");
    }

}
