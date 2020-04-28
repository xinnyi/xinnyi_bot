package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Photo {
    private String file_id;
    private String file_unique_id;
    private long file_size;
    private long width;
    private long height;

    public String getFile_id() {
        return file_id;
    }

    public Photo setFile_id(String file_id) {
        this.file_id = file_id;
        return this;
    }

    public String getFile_unique_id() {
        return file_unique_id;
    }

    public Photo setFile_unique_id(String file_unique_id) {
        this.file_unique_id = file_unique_id;
        return this;
    }

    public long getFile_size() {
        return file_size;
    }

    public Photo setFile_size(long file_size) {
        this.file_size = file_size;
        return this;
    }

    public long getWidth() {
        return width;
    }

    public Photo setWidth(long width) {
        this.width = width;
        return this;
    }

    public long getHeight() {
        return height;
    }

    public Photo setHeight(long height) {
        this.height = height;
        return this;
    }
}
