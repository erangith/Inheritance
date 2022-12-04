import java.util.Date;

class Publication{
    protected String title;
    protected String journalName;;
    protected int journalId;
    protected Date date;
    
    public Publication(String title, String journalName, int journalId, Date date) {
         this.title = title;
         this.journalName = journalName;
         this.journalId = journalId;
         this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public int getJournalId() {
        return journalId;
    }

    public void setJournalId(int journalId) {
        this.journalId = journalId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String output;
        output=
                "Title=" + title +
                ", journalName=" + journalName  +
                ", journalId=" + journalId  +
                ", Date=" + date;
          return output;
    }
}