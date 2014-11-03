/**
 * Created by p13003270 on 03/11/14.
 */

import java.io.Serializable;

public class Module implements Serializable {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Module{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", hCoursPrev=" + hCoursPrev +
                ", hCoursRea=" + hCoursRea +
                ", hTpPrev=" + hTpPrev +
                ", hTpRea=" + hTpRea +
                ", discipline='" + discipline + '\'' +
                ", coefTest=" + coefTest +
                ", coefCc=" + coefCc +
                '}';
    }

    String code;
    String libelle;
    int hCoursPrev;
    int hCoursRea;
    int hTpPrev;
    int hTpRea;
    String discipline;
    int coefTest;
    int coefCc;
    int Resp;
    String CodPere;

    public String getCodPere() {
        return CodPere;
    }

    public void setCodPere(String codPere) {
        CodPere = codPere;
    }



    public int getResp() {
        return Resp;
    }

    public void setResp(int resp) {
        Resp = resp;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int gethCoursPrev() {
        return hCoursPrev;
    }

    public void sethCoursPrev(int hCoursPrev) {
        this.hCoursPrev = hCoursPrev;
    }

    public int gethCoursRea() {
        return hCoursRea;
    }

    public void sethCoursRea(int hCoursRea) {
        this.hCoursRea = hCoursRea;
    }

    public int gethTpPrev() {
        return hTpPrev;
    }

    public void sethTpPrev(int hTpPrev) {
        this.hTpPrev = hTpPrev;
    }

    public int gethTpRea() {
        return hTpRea;
    }

    public void sethTpRea(int hTpRea) {
        this.hTpRea = hTpRea;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getCoefTest() {
        return coefTest;
    }

    public void setCoefTest(int coefTest) {
        this.coefTest = coefTest;
    }

    public int getCoefCc() {
        return coefCc;
    }

    public void setCoefCc(int coefCc) {
        this.coefCc = coefCc;
    }
}
