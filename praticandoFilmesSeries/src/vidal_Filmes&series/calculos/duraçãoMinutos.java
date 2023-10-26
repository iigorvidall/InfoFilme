package ScreeMatch.calculos;

import ScreeMatch.classes.Titulo;

public class duraçãoMinutos {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    public void calculatempo (Titulo t){
        tempoTotal += t.getDuraçãoMinutos();
    }

}
