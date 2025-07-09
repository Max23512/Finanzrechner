package backend;

import java.util.List;

public class ErgebnisDTO {
    private List<Double> startkapital;
    private List<Double> endkapital;
    private List<Double> renditen;

    public List<Double> getStartkapital() { return startkapital; }
    public void setStartkapital(List<Double> startkapital) { this.startkapital = startkapital; }

    public List<Double> getEndkapital() { return endkapital; }
    public void setEndkapital(List<Double> endkapital) { this.endkapital = endkapital; }

    public List<Double> getRenditen() { return renditen; }
    public void setRenditen(List<Double> renditen) { this.renditen = renditen; }
}
