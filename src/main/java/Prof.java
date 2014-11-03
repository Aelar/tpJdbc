import java.io.Serializable;

/**
 * Created by p13003270 on 03/11/14.
 */
public class Prof implements Serializable
{
    int numProf;
    String nomProf;
    String prenomProf;
    String adrProf;
    String cpProf;
    String villeProf;

    public Module getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Module specialite) {
        this.specialite = specialite;
    }

    Module specialite;

    public Prof()
    {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Prof{" +
                "numProf=" + numProf +
                ", nomProf='" + nomProf + '\'' +
                ", prenomProf='" + prenomProf + '\'' +
                ", adrProf='" + adrProf + '\'' +
                ", cpProf='" + cpProf + '\'' +
                ", villeProf='" + villeProf + '\'' +
                '}';
    }

    public int getNumProf() {
        return numProf;
    }

    public void setNumProf(int numProf) {
        this.numProf = numProf;
    }

    public String getNomProf() {
        return nomProf;
    }

    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public String getPrenomProf() {
        return prenomProf;
    }

    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }

    public String getAdrProf() {
        return adrProf;
    }

    public void setAdrProf(String adrProf) {
        this.adrProf = adrProf;
    }

    public String getCpProf() {
        return cpProf;
    }

    public void setCpProf(String cpProf) {
        this.cpProf = cpProf;
    }

    public String getVilleProf() {
        return villeProf;
    }

    public void setVilleProf(String villeProf) {
        this.villeProf = villeProf;
    }
}
