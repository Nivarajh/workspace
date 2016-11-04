package exoAmende;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b5545af0-2593-11e2-9612-0800270b393c")
public class Amende {
    @objid ("b5545ae9-2593-11e2-9612-0800270b393c")
    private String categorie;


    @objid ("698f37c5-2595-11e2-9612-0800270b393c")
    public Amende() {
    }

    @objid ("086b9165-2597-11e2-9612-0800270b393c")
    public String getCategorie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.categorie;
    }

    @objid ("08f082b5-2597-11e2-9612-0800270b393c")
    public void setCategorie(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.categorie = value;
    }

}
