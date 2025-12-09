class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", размер хора: " + choirSize + " человек (Опера)";
    }
}