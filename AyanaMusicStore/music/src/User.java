class User {
    private String name;
    private double money;
    private String email;
    private String subscriptionType;

    public User(String name, double money, String email, String subscriptionType) {
        this.name = name;
        this.money = money;
        this.email = email;
        this.subscriptionType = subscriptionType;
    }

    public void listenMusic(Music music) {
        if (money >= music.getPrice()) {
            music.listen();
            money -= music.getPrice();
        } else {
            System.out.println("Not enough money to listen to " + music);
        }
    }

    public String getEmail() {
        return email;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    @Override
    public String toString() {
        return "User: " + name + ", Balance: $" + String.format("%.2f", money) + ", Email: " + email + ", Subscription: " + subscriptionType;
    }
}
