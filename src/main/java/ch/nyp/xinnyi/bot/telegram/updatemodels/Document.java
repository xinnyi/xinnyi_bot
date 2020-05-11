package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Document {
    private String file_name;
    private String mime_type;
    private String file_id;
    private String file_unique_id;
    private int file_size;

    public String getFile_name() {
        return file_name;
    }

    public Document setFile_name(String file_name) {
        this.file_name = file_name;
        return this;
    }

    public String getMime_type() {
        return mime_type;
    }

    public Document setMime_type(String mime_type) {
        this.mime_type = mime_type;
        return this;
    }

    public String getFile_id() {
        return file_id;
    }

    public Document setFile_id(String file_id) {
        this.file_id = file_id;
        return this;
    }

    public String getFile_unique_id() {
        return file_unique_id;
    }

    public Document setFile_unique_id(String file_unique_id) {
        this.file_unique_id = file_unique_id;
        return this;
    }

    public int getFile_size() {
        return file_size;
    }

    public Document setFile_size(int file_size) {
        this.file_size = file_size;
        return this;
    }
}
