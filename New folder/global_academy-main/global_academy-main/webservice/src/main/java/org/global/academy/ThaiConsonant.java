package org.global.academy;
public class ThaiConsonant  extends Flashcard{

public ThaiConsonant(String symbol, String thaiReading, String romanized, String toneClass) {

    super(
            "<html><center>" + symbol + "<br>" + thaiReading + "</center></html>", // Front of card
            "<html><center>" + romanized + "<br>Tone: " + toneClass + "</center></html>"  // Back of card
        );
}

}
