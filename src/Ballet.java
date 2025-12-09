class Ballet extends MusicalShow {
    private final Person choreographer;

    public Ballet(String title, int duration, Director director,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    @Override
    public String toString() {
        return super.toString() + ", хореограф: " + choreographer + " (Балет)";
    }
}