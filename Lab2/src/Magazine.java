class Magazine extends PrintedMatter {
    private String publicationFrequency;
    public void setPublicationFrequency(String frequency) {
        publicationFrequency = frequency;
    }
    public String getPublicationFrequency() {
        return publicationFrequency;
    }
    Magazine() {
        super();
        publicationFrequency = "once per month";
    }
    Magazine(String frequency) {
        super();
        publicationFrequency = frequency;
    }
    Magazine(int year, String frequency) {
        super(year);
        publicationFrequency = frequency;
    }
}