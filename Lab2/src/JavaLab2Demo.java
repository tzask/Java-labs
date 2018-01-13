public class JavaLab2Demo {
    public static void main (String args[]) {
        PrintedMatter prMatter = new PrintedMatter(2001);
        System.out.println("PrintedMatter (prMatter):");
        System.out.println("\tyearOfPublishing = " + prMatter.getYearOfPublishing());

        Magazine myMagazine = new Magazine(2017, "once per week");
        System.out.println("\nMagazine (myMagazine):");
        System.out.println("\tyearOfPublishing = " + myMagazine.getYearOfPublishing());
        System.out.println("\tpublicationFrequency = " + myMagazine.getPublicationFrequency());

        Book oldBook = new Book(77656223);
        System.out.println("\nBook (oldBook):");
        System.out.println("\tyearOfPublishing (default) = " + oldBook.getYearOfPublishing());
        System.out.println("\tISBN = " + oldBook.getISBN());

        Coursebook biologyCoursebook = new Coursebook(2010, 44059596, "Biology");
        System.out.println("\nCoursebook (biologyCoursebook):");
        System.out.println("\tyearOfPublishing (default) = " + biologyCoursebook.getYearOfPublishing());
        System.out.println("\tISBN = " + biologyCoursebook.getISBN());
        System.out.println("\tschoolSubject =" + biologyCoursebook.getSchoolSubject());
    }
}
