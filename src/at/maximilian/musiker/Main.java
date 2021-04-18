package at.maximilian.musiker;


public class Main {

    public static void main(String[] args) {
        Saenger saenger = new Saenger();
        Gitarrist gitarrist = new Gitarrist();
        Bassist bassist = new Bassist();
        Trompeter trompeter = new Trompeter();
        BackgroundSaengerin backgroundSaengerin = new BackgroundSaengerin();
        machtMusik(saenger, gitarrist, bassist, trompeter, backgroundSaengerin);
    }
    public static void machtMusik(Musiker... gruppe)
    {
        for (Musiker musiker : gruppe) {
            musiker.musizieren();
        }
    }
}
