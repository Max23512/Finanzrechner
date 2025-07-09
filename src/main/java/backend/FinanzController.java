package src.main.java.backend;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // React dev server port
@RequestMapping("/api")
public class FinanzController {

    @PostMapping("/berechne")
    public ErgebnisDTO berechne(@RequestBody AnfrageDTO anfrage) {
        ArrayList<Double> startkapital = new ArrayList<>();
        ArrayList<Anlageklassen> ausgewaehlt = new ArrayList<>();

        double betrag = anfrage.getBetrag();
        int laufzeit = anfrage.getLaufzeit();
        startkapital.add(betrag);

        if (anfrage.getAnlageklassen().get("aktien")) {
            ausgewaehlt.add(new Aktien());
        }
        if (anfrage.getAnlageklassen().get("anleihen")) {
            ausgewaehlt.add(new Anleihen());
        }
        if (anfrage.getAnlageklassen().get("immobilien")) {
            ausgewaehlt.add(new Immobilien());
        }

        Finanzrechner rechner = new Finanzrechner(startkapital, ausgewaehlt, laufzeit);
        rechner.berechne();

        ErgebnisDTO ergebnis = new ErgebnisDTO();
        ergebnis.setStartkapital(rechner.getstartkapital());
        ergebnis.setEndkapital(rechner.getendkapital());
        ergebnis.setRenditen(rechner.getakktuellerendite());

        return ergebnis;
    }
}