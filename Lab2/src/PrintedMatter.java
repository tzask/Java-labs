class PrintedMatter {
    private int yearOfPublishing;
    public void setYearOfPublishing(int year) {
        yearOfPublishing = year;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    PrintedMatter() {
        yearOfPublishing = 1900;
    }
    PrintedMatter(int year) {
        yearOfPublishing = year;
    }
}