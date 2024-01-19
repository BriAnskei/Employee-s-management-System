// New Code for Data manipulation.


class ArrayManipulation {
    private int[] numbers;

    public ArrayManipulation(int[] numbers) {
        this.numbers = numbers;
    }

    public void printArray() {
        System.out.print("Array Element: ");
        for (int i : numbers) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public int findSum() {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

        //Double the value of each elements in the Array
    public void doubleArray() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        printArray();
    }

    public int findMax() {
        int max = numbers[0];
        for (int i : numbers) {
            if (max < i) {
                max = i;
            }
        }
        return max;

    }

    public void reverseArray() {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
        printArray();

    }

}
}



//Some code to use to future Excercise or project.
//This is example is from the Shopping Management Systsem. It has a methods that Addproduct(to the cart/Inventory), removeProduct based on the name, Display all the product Details that are in the cart/Inventory, Calaculate the total cost of all product that are in the cart/Inventory based on there quantity and price,Search for a product based on the name and display its detail and update product.


class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantityinStock;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantityinStock) {
        this.quantityinStock = quantityinStock;
    }

    public int getId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantityinStock;
    }

    @Override
    public String toString() {
        return "{[Name: " + productName + "] \n" + "ID: " + productId + "\n" + "Price: " + price + "\nQuantity: "
                + quantityinStock + '}' + "\n";
    }

}

class Inventory {
    private ArrayList<Product> Cart = new ArrayList<>();
   

    public void addProduct(int productId, String productName, double price, int quantityinStock) {
        if (price <= 0 || quantityinStock <= 0) {
            System.out.println("Input price and quantity");
            return;
        }

        Product product = new Product(productId, productName);
        product.setQuantity(quantityinStock);
        product.setPrice(price);
        Cart.add(product);
    }

    public void removeProduct(String name) {
        Iterator<Product> it = Cart.iterator();
        if (!it.hasNext()) {
            System.out.println("There is no product in the Cart");
            return;
        }

        while (it.hasNext()) {
            Product product = it.next();
            if (product.getProductName().equals(name)) {
                it.remove();
                System.out.println("product " + name + " Succesfully removed in the Cart");
                return;
            }

        }
        System.out.println("Product: " + name + " is not in the Cart");
        return;

    }

    public void displayAllproducts() {
        if (Cart.isEmpty()) {
            System.out.println("There is no Product's in the Cart");
            return;
        } else {
            System.out.println("Cart Item's");
            for (Product product : Cart) {
                System.out.println(product);
            }
            return;
        }
    }

    
    public double calculateCost() {
        double totalPrice = 0;
        for (Product product : Cart) {
            totalPrice += product.getPrice() * product.getquantity();
        }
        return totalPrice;

    }

    public void searchProduct(String name) {
        for (Product product : Cart) {
            if (product.getProductName().equals(name)) {
                System.out.println("Product Details");
                System.out.println(product);
                return;
            }
        }
        System.out.println(name + " is not in the Inventory");
    }
    

    public void updateProduct(String name, int quantity, double price) {
        for (Product product : Cart) {
            if (product.getProductName().equals(name)) {
                product.setQuantity(quantity);
                product.setPrice(price);
                System.out.println("Item Succesfully updated");
                return;
            } else {
                System.out.println(name.toUpperCase() + " is not in the Inventore");
            }
        }

    }

}



