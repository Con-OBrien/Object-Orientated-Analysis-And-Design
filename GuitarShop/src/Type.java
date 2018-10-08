public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ELECTRIC: return "ELECTRIC";
            case ACOUSTIC: return "ACCOUSTIC";
            default: return "";
        }
    }
}
