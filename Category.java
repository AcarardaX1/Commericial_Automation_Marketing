public class Category {

    private int CAT_id;

    private String CAT_name;

    public Category() {}

    public Category(int CAT_id, String CAT_name) {
        super();
        this.CAT_id = CAT_id;  //Category id is written here to equalize that "this" will be able to modify the syntax
        this.CAT_name = CAT_name; //Likewise the above, it is the same here for CAT name
    }

    public int getCAT_id() {
        return this.CAT_id;
    }

    public void setCAT_id(int CAT_id) {
        this.CAT_id = CAT_id;
    }

    public String getCAT_name() {
        return this.CAT_name + "!";
    }

    public void setCAT_name(String CAT_name) {
        this.CAT_name = CAT_name;
    }
}
