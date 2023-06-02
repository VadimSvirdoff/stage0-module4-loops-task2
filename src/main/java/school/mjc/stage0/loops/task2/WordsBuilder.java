package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int length = chars.length;
        int index = 0;
        String phrase = "";

        while (index < length) {
            phrase += chars[index];
            index++;
        }

        System.out.println(phrase);
    }
}
