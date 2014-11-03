import org.w3c.dom.Notation;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by p13003270 on 03/11/14.
 */
public class AssosiationNotation {

    Set <Lien> liens= new HashSet<Lien>();
    AssosiationNotation instance;

    public:

    public AssosiationNotation getInstance() {
        return instance;
    }

    public void setInstance(AssosiationNotation instance) {
        this.instance = instance;
    }

    public Set<Lien> getLiens() {
        return liens;
    }

    public void setLiens(Set <Lien> liens) {
        this.liens = liens;
    }

    public void creerLien(Module mod,Etudiants Et,Notation N)
    {
        Lien Li = new Lien(mod,Et);
        Li.setNote(N);

        liens.add(Li);
    }

    public void supprimerLien(Module mod,Etudiants Et)
    {
        liens.remove(new Lien(mod,Et));
    }

    public void supprimerLien(Lien Li)
    {
        liens.remove(Li);
    }

    Lien getLien(Module mod,Etudiants Et)
    {
        Lien ret=new Lien(new Module(),new Etudiants());
        for (Lien Li : liens)
        {
            if(mod == Li.getModule() && Et == Li.getEtudiant())
            {
                ret=Li;
            }
        }
        return ret;
    }

    Set<Lien> getLiens(Etudiants Et)
    {
        Set <Lien> ret= new HashSet<Lien>();
        for (Lien Li : liens)
        {
            if(Li.getEtudiant() == Et)
            {
                ret.add(Li);
            }
        }
        return ret;
    }

    Set<Lien> getLiens(Module mod)
    {
        Set <Lien> ret= new HashSet<Lien>();
        for (Lien Li : liens)
        {
            if(Li.getModule() == mod)
            {
                ret.add(Li);
            }
        }
        return ret;
    }

    Set<Module> getModules(Etudiants Et)
    {
        Set <Module> ret = new HashSet<Module>();

        for (Lien Li : liens)
        {
            if(Li.getEtudiant() == Et)
            {
                ret.add(Li.getModule());
            }
        }
        return ret;
    }

    Set<Etudiants> getEtudiants(Module mod)
    {
        Set <Etudiants> ret = new HashSet<Etudiants>();

        for (Lien Li : liens)
        {
            if(Li.getModule() == Et)
            {
                ret.add(Li.getEtudiant());
            }
        }
        return ret;
    }


}
