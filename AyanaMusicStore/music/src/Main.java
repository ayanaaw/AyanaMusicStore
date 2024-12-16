public class Main {
    public static void main(String[] args) {

        Genre genre1 = new Genre("Reggae", "A genre known for its rhythmic beats and laid-back style, originating from Jamaica");
        Genre genre2 = new Genre("Blues", "A genre characterized by melancholic melodies and soulful guitar riffs");
        Genre genre3 = new Genre("Country", "A genre rooted in folk music with a blend of western, southern, and rural influences");

        Author author1 = new Author("Mark", "Johnson", 34, "USA");
        Author author2 = new Author("Ava", "Li", 25, "China");
        Author author3 = new Author("Diego", "Fernandez", 38, "Argentina");

        Music music1 = new Music("Island Vibes", author1, genre1, 240, 3.19, 2020, "A reggae track that brings the island rhythm to life");
        Music music2 = new Music("Heartache Blues", author2, genre2, 210, 2.99, 2017, "A melancholic blues track filled with soulful guitar and heartfelt lyrics");
        Music music3 = new Music("Wild West Journey", author3, genre3, 280, 4.49, 2019, "A country ballad that tells a story of the open road and the western frontier");

        User user1 = new User("Liam", 28, "liam@example.com", "Premium");
        User user2 = new User("Olivia", 16, "olivia@example.com", "Basic");
        User user3 = new User("Ethan", 40, "ethan@example.com", "Premium");


        System.out.println(music1);
        System.out.println(music2);
        System.out.println(music3);

        user1.listenMusic(music1);
        user2.listenMusic(music2);
        user3.listenMusic(music3);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("Listens: " + music1.getListens());
        System.out.println("Listens: " + music2.getListens());
        System.out.println("Listens: " + music3.getListens());
    }
}
