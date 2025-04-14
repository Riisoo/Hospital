package hôpital;

public class Patientreport {
   private int PatientID;
   private String Symptome;
   private String Diagnostic;
   private String Medicaments;
   private String ServiceReq;
   private String TypeSer;
   private String PatientNom;

    public Patientreport() {
    }

    public Patientreport(int PatientID, String Symptome, String Diagnostic, String Medicaments, String ServiceReq, String TypeSer, String PatientNom) {
        this.PatientID = PatientID;
        this.Symptome = Symptome;
        this.Diagnostic = Diagnostic;
        this.Medicaments = Medicaments;
        this.ServiceReq = ServiceReq;
        this.TypeSer = TypeSer;
        this.PatientNom = PatientNom;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getSymptome() {
        return Symptome;
    }

    public void setSymptome(String Symptome) {
        this.Symptome = Symptome;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }

    public void setDiagnostic(String Diagnostic) {
        this.Diagnostic = Diagnostic;
    }

    public String getMedicaments() {
        return Medicaments;
    }

    public void setMedicaments(String Medicaments) {
        this.Medicaments = Medicaments;
    }

    public String getServiceReq() {
        return ServiceReq;
    }

    public void setServiceReq(String ServiceReq) {
        this.ServiceReq = ServiceReq;
    }

    public String getTypeSer() {
        return TypeSer;
    }

    public void setTypeSer(String TypeSer) {
        this.TypeSer = TypeSer;
    }

    public String getPatientNom() {
        return PatientNom;
    }

    public void setPatientNom(String PatientNom) {
        this.PatientNom = PatientNom;
    }
   
}
