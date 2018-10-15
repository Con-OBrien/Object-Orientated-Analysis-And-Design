public enum Strings {
    SIX, TWELVE;

    public String toString() {
        switch (this) {
            case SIX: return "SIX";
            case TWELVE: return "TWELVE";
            default: return "";
        }
    }
}
