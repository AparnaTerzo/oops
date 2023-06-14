// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Product {
        String productName;
        int productQuantity;
        String productDetails;

        public Product(String productName, int productQuantity, String productDetails) {
            this.productName = productName;
            this.productQuantity = productQuantity;
            this.productDetails = productDetails;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setProductQuantity(int productQuantity) {
            this.productQuantity = productQuantity;
        }

        public void setProductDetails(String productDetails) {
            this.productDetails = productDetails;
        }

        public String getProductName() {
            return productName;
        }

        public int getProductQuantity() {
            return productQuantity;
        }

        public String getProductDetails() {
            return productDetails;
        }

        public String getDetails(){
            return ("The product name is " +this.getProductName()+ "\nThe quantity available are " +this.getProductQuantity()+ "\nDescription about product is "+this.getProductDetails());
        }
//
    }