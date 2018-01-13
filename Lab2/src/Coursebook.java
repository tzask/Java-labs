
class Coursebook extends Book {
    private String schoolSubject;
    public void setSchoolSubject(String subjectName) {
        schoolSubject = subjectName;
    }
    public String getSchoolSubject() {
        return schoolSubject;
    }
    Coursebook() {
        super();
        schoolSubject = "none";
    }
    Coursebook(String subjectName) {
        super();
        schoolSubject = subjectName;
    }
    Coursebook(int ISBNcode, String subjectName) {
        super(ISBNcode);
        schoolSubject = subjectName;
    }
    Coursebook (int year, int ISBNcode, String subjectName) {
        super(year, ISBNcode);
        schoolSubject = subjectName;
    }
}
