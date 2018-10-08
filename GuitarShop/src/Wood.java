public enum Wood {
    ALDER, CEDAR, MAHOGANY;

    public String toString() {
     switch (this) {
         case ALDER: return "ALDER";
         case MAHOGANY: return "Mahogany";
         case CEDAR: return "CEDAR";
         default: return "";
     }
    }
}
