package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Voice {
    private int duration;
    private String mime_type;
    private String file_id;
    private String file_unique_id;
    private int file_size;

    public int getDuration() {
        return duration;
    }

    public Voice setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public String getMime_type() {
        return mime_type;
    }

    public Voice setMime_type(String mime_type) {
        this.mime_type = mime_type;
        return this;
    }

    public String getFile_id() {
        return file_id;
    }

    public Voice setFile_id(String file_id) {
        this.file_id = file_id;
        return this;
    }

    public String getFile_unique_id() {
        return file_unique_id;
    }

    public Voice setFile_unique_id(String file_unique_id) {
        this.file_unique_id = file_unique_id;
        return this;
    }

    public int getFile_size() {
        return file_size;
    }

    public Voice setFile_size(int file_size) {
        this.file_size = file_size;
        return this;
    }
}
