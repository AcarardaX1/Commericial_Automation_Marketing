
public class object_orient_1 {

    public class object_orient {
        //Constructor Class



        private int id;
        private String currency;
        private double unitPrice;
        private double discount_rate;
        private String name;
        private String description;
        private String product_id_type;





    }

    public object_orient_1(String currency, int id,  String product_id_type, String name, double unitPrice, String description, double discount_rate, double discounted_price) {

         super();
         this.currency = currency;
         this.name = name;
         this.id = id;
         this.product_id_type = product_id_type;
         this.unitPrice = unitPrice;
         this.description = description;
         this.discount_rate = discount_rate;
         this.discounted_price = discounted_price;

    }


    String currency;
    int id;
    String product_id_type;
    String name;
    double unitPrice;
    String description;
    double discount_rate;
    double discounted_price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getProduct_id_type() {
        return product_id_type;
    }

    public void setProduct_id_type(String product_id_type) {
        this.product_id_type = product_id_type;
    }

    public String  getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public double getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(double discount_rate) {
        this.discount_rate = discount_rate;
    }
    public double getDiscounted_price() {
        return this.unitPrice - ((this.unitPrice*this.discount_rate)/100);
    }


}
