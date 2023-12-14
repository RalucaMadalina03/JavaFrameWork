package StaticKeyword;

public class Elev {

    //Static este un keyword care are ca scop sa pastreze valoarea unei informatii pt toate instantele undei clase
    // static se poate aplica la variabile si metode

    private String numeElev;
    private String prenumeElev;
    private String scoala = "Liviu Rebreanu";
    private static Integer nrElevi=0;
    public Elev(String numeElev,String prenumeElev){
        this.numeElev = numeElev;
        this.prenumeElev = prenumeElev;
        nrElevi++;
    }
    
    public void prezentareElev(){
        System.out.println("Numele elevului este " + numeElev);
        System.out.println("Prenumele elevului este"+ prenumeElev);
        System.out.println("scoala elevului este " +scoala);
        System.out.println("Nr elevi inscrisi la scoala sun:"+nrElevi);
    }



}