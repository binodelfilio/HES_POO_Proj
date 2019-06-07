package src.models;

public class MyImage {
    private String path;
    private String name;
    private String creation_date;
    private String modification_date;

    public MyImage(String path,String name,String creation_date,String modification_date) {
        this.path=path;
        this.name=name;
        this.creation_date=creation_date;
        this.modification_date=modification_date;
    }
    public String getName() { return this.name; }
    public String getPath() { return this.path; }
    public String getCreation_date() { return this.creation_date; }
    public String getModification_date() { return this.modification_date; }


}