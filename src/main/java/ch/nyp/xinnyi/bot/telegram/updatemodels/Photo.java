package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Photo {
    private String file_id;
    private String file_unique_id;
    private int file_size;
    private int width;
    private int height;

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

    public int getFile_size() {
        return file_size;
    }

    public Photo setFile_size(int file_size) {
        this.file_size = file_size;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Photo setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Photo setHeight(int height) {
        this.height = height;
        return this;
    }
}
