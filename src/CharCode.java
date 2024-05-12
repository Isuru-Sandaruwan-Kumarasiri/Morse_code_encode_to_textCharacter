public class CharCode {
    private char letter;
    private String code;

    public CharCode(char letter, String code) {
        this.letter = letter;
        this.code = code;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
