import java.util.Objects;
public class Scrabble {
    private String word;
    private int score = 0;
    private final int[] scoreKey = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    private boolean doubleWord;
    private boolean tripleWord;

    private Character[] character1;
    private Character[] character2;

    public Scrabble(String word) {

        if (word == null) {
            this.word = "";
        } else {
            this.word = word.toUpperCase();
        }
    }

    public Scrabble(String word, Character[] character1, Character[] character2, boolean doubleWord, boolean tripleWord) {
        if (word == null) {
            this.word = "";
        } else {
            this.word = word.toUpperCase();
        }
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;
        this.character1 = character1;
        this.character2 = character2;
    }

    public int score() {
        for (int i = 0, n = word.length(); i < n; i++) {
            int index = word.charAt(i) - 65;
            score += this.scoreKey[index];
        }
        isDouble();
        isTriple();
        isCharacter1();
        isCharacter2();
        return score;
    }

    public void isDouble() {
        if(doubleWord) {
            score *= 2;
        }
    }

    public void isTriple() {
        if(tripleWord) {
            score *= 3;
        }
    }

    public void isCharacter1() {
        if (character1 == null) {;}
        else if (character1.length == 0) {;}
        else {score += 1;}
    }

    public void isCharacter2() {
        if (character2 == null) {;}
        else if (character2.length == 0) {;}
        else {score += 2;}
    }
}