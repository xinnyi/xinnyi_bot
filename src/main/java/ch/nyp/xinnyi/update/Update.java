package ch.nyp.xinnyi.update;

public class Update {


    // https://core.telegram.org/type/Update

    private long update_id;


    public long getUpdate_id() {
        return update_id;
    }

    public Update setUpdate_id(long update_id) {
        this.update_id = update_id;
        return this;
    }


}
