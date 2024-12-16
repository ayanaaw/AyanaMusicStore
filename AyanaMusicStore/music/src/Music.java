class Music {
    private String name;
    private Author author;
    private Genre genre;
    private int duration; // продолжительность в секундах
    private double price;
    private int listens;
    private int releaseYear;
    private String description;

    public Music(String name, Author author, Genre genre, int duration, double price, int releaseYear, String description) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration = duration;
        this.price = price;
        this.listens = 0;
        this.releaseYear = releaseYear;
        this.description = description;
    }

    public void listen() {
        System.out.println(name + " playing⊹☾⋆⁺₊🎧✩°｡");
        listens++;
    }

    public int getListens() {
        return listens;
    }

    public double getPrice() {
        return price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + " by " + author + " in " + genre + " genre (" + releaseYear + ") - " + description;
    }
}