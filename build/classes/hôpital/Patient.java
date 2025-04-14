package hôpital;

public class Patient {
    private String idP;
    private String NomP ; 
    private String Tel; 
    private String Age ;
    private String Sexe ;
    private String Adresse ;
    private String GroupeSanguin;

    

    
    public Patient(String idP, String NomP, String Tel, String Age, String Sexe, String Adresse, String GroupeSanguin) {
        this.idP = idP;
        this.NomP = NomP;
        this.Tel = Tel;
        this.Age = Age;
        this.Sexe = Sexe;
        this.Adresse = Adresse;
        this.GroupeSanguin = GroupeSanguin;
    }

    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }

    public String getNomP() {
        return NomP;
    }

    public void setNomP(String NomP) {
        this.NomP = NomP;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getGroupeSanguin() {
        return GroupeSanguin;
    }

    public void setGroupeSanguin(String GroupeSanguin) {
        this.GroupeSanguin = GroupeSanguin;
    }
    
}
