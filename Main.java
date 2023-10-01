// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        object_orient_1 product1 = new object_orient_1("EUR", 165863, "SEDAN SPORT", "ALFA ROMEO GIULIA", 57862.54, "MILAN", 10, 52493); //Creation of Instance,Example or Reference


        object_orient_1 product2 = new object_orient_1("EUR", 165863, "SEDAN SPORT", "ALFA ROMEO GIULIA", 57862.54, "MILAN", 10, 52493); //Creation of Instance,Example or Reference
        product2.setId(250580);
        product2.setCurrency("EUR");
        product2.setDescription("SPORT SEDAN");
        product2.setProduct_id_type("BOLOGNA");
        product2.setName("MASERATI QUATTROPORTE");
        product2.setUnitPrice(97865);
        product2.setDiscount_rate(10);
        System.out.println(product2.getDiscounted_price());

        object_orient_1 product3 = new object_orient_1("EUR", 416870, "SUV", "VOLVO XC60", 38642.54, "STOCKHOLM",  20, 31874 ); //Creation of Instance,Example or Reference




        object_orient_1[] products = {product1, product2, product3};


        for(object_orient_1 product: products) {

            System.out.println(product.name);
            System.out.println(product.description);
            System.out.println(product.unitPrice);
            System.out.println(product.currency);
            System.out.println(product.id);
        }



        object1_project_manager productManager = new object1_project_manager();
        productManager.add2Cart(product1);
        productManager.add2Cart(product2);
        productManager.add2Cart(product3);


        Category category1 = new Category() ;
        category1.setCAT_id(31);
        category1.setCAT_name("VEHICLES");

        Category category2 = new Category() ;
        category2.setCAT_id(69);
        category2.setCAT_name("CARS");

        System.out.println(category1.getCAT_id());
        System.out.println(category1.getCAT_name());





    }
}