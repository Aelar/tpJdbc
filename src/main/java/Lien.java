import org.w3c.dom.Notation;

/**
 * Created by p13003270 on 03/11/14.
 */
public class Lien {
    Module module;
    Etudiants etudiant;

    public Notation getNote() {
        return note;
    }

    public void setNote(Notation note) {
        this.note = note;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }

    Notation note;

    public Lien(Module module, Etudiants etudiant) {
        this.module = module;
        this.etudiant = etudiant;
    }
}
