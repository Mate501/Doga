package hu.petrik.BejegyzesProject;

import java.time.LocalDateTime;

public class Bejegyzes {
     public String szerzo;
    String tartalom;
    int likeok = 0;
    LocalDateTime letrejott;
    LocalDateTime szerkeztve;

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkeztve() {
        return szerkeztve;
    }
    public void like()
    {
        likeok++;
    }
    public Bejegyzes(String szerzo, String tartalom) {

    }

    @Override
    public String toString() {
        return "Bejegyzes{" +
                "szerzo='" + szerzo + '-' +
                ", likeok=" + likeok + '-' +
                ", letrejott=" + letrejott + '\n' +
                ", Szerkeztve=" + szerkeztve + "szerkesztes" + '\n' +
                ", tartalom='" + tartalom +
                '}';
    }
}
