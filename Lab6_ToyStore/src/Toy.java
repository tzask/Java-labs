class Toy {
    private String name;
    private int price;
    private int minAge;
    private int maxAge;
    private int additional;

    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice (int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setMinAge (int minAge) {
        this.minAge = minAge;
    }
    public int getMinAge() {
        return minAge;
    }

    public void setMaxAge (int maxAge) {
        this.maxAge = maxAge;
    }
    public int getMaxAge() {
        return maxAge;
    }

    public void setAdditional (int additional) {
        this.additional = additional;
    }
    public int getAdditional() {
        return additional;
    }

    Toy() {
        name = "no name";
        price = 0;
        minAge = 0;
        maxAge = 0;
        additional = 0;
    }
}