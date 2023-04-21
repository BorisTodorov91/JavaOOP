package Lab.P03inheritance.Animal;

public class Feliade { // latin word for "CAT"

    private boolean male;

    public Feliade(){
        this(true);
    }

    public Feliade(boolean male) {
        setMale(male);
    }

    public boolean isMale() {
        return male;
    }

    private void setMale(boolean male) {
        this.male = male;
    }
}
