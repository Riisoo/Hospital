package hôpital;

public class Receptionniste {
    private int idreceptionniste;
    private  String Nom_Recep;
    private String pwd;

    public Receptionniste(int idreceptionniste, String Nom_Recep, String pwd) {
        this.idreceptionniste = idreceptionniste;
        this.Nom_Recep = Nom_Recep;
        this.pwd = pwd;
    }

    public int getIdreceptionniste() {
        return idreceptionniste;
    }

    public void setIdreceptionniste(int idreceptionniste) {
        this.idreceptionniste = idreceptionniste;
    }

    public String getNom_Recep() {
        return Nom_Recep;
    }

    public void setNom_Recep(String Nom_Recep) {
        this.Nom_Recep = Nom_Recep;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
}
