import java.util.Scanner;

public class OnlineShop {
    int choice;

    public static void main(String[] args) {
        OnlineShop O1 = new OnlineShop();
        // OnlineShop.b b12 = new OnlineShop.b(20, 30);
        // b12.a = 20;
        ShopPerson Sh1[];
        Sh1 = new ShopPerson[4];
        Sh1[0] = new ShopPerson();
        System.out.println("Please Enter the customer Information");
        customer Cus = new customer();
        Cus.CusInformationAccept();
        System.out.println();
        Cus.CusInformationDisplay();
        System.out.println();
        System.out.println("Hello warmely welcome " + Cus.CusName + " sir");
        System.out.println();
        System.out.println("These are the Latest Apple iPhone Mobile list");
        System.out.println();
        product P5 = new product();
        P5.ProductList();
        P5.viewProdList();
        System.out.println("Enter the choice for which you visit");
        Scanner Sc = new Scanner(System.in);
        ShoppingCart S1 = new ShoppingCart();
        O1.choice = Sc.nextInt();
        S1.cart(O1.choice);
        PaymentOption p1 = new PaymentOption();
        p1.paymentOp();
        Sh1[1] = new ShopPerson("Thanks for shopping");
        Sh1[2] = new ShopPerson("Do visit Again", " Regards From Suraj Salunkhe", "Owner Of SS Apple Store");

    }
}

class customer {
    int CusId;
    String CusName;
    long CusMobNo;

    // String CusAdd;
    void CusInformationAccept() {
        Scanner input = new Scanner(System.in);
        CusId = input.nextInt();
        input.nextLine();
        CusName = input.nextLine();
        CusMobNo = input.nextLong();
        // CusAdd = input.next();
    }

    void CusInformationDisplay() {
        // customer C1 = new customer();
        System.out.println("Customer Id is " + CusId);
        System.out.println("Customer Name is " + CusName);
        System.out.println("Customer Mobile No is " + CusMobNo);
        // System.out.println("Customer Addresss is " + CusAdd);
    }
}

class ShoppingCart {
    void cart(int m) {
        OnlineShop ol = new OnlineShop();
        ol.choice = m;
        switch (ol.choice) {
            case 1: {
                System.out.println("Your selected for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[0] + " Product Name = " + product.Prodname[0]
                        + " Product price = " + product.ProdPrice[0]);
                break;
            }
            case 2: {
                System.out.println("Your selected for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[1] + " Product Name = " + product.Prodname[1]
                        + " Product price = " + product.ProdPrice[1]);
                break;
            }
            case 3: {
                System.out.println("Your selected  for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[2] + " Product Name = " + product.Prodname[2]
                        + " Product price = " + product.ProdPrice[2]);
                break;
            }
            case 4: {
                System.out.println("Your selected for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[3] + " Product Name = " + product.Prodname[3]
                        + " Product price = " + product.ProdPrice[3]);
                break;
            }
            case 5: {
                System.out.println("Your selected for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[4] + " Product Name = " + product.Prodname[4]
                        + " Product price = " + product.ProdPrice[4]);
                break;
            }
            case 6: {
                System.out.println("Your selected for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[5] + " Product Name = " + product.Prodname[5]
                        + " Product price = " + product.ProdPrice[5]);
                break;
            }
            case 7: {
                System.out.println("Your selected product for purchase is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[6] + " Product Name = " + product.Prodname[6]
                        + " Product price = " + product.ProdPrice[6]);
                break;
            }
            case 8: {
                System.out.println("Your selected for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[7] + " Product Name = " + product.Prodname[7]
                        + " Product price = " + product.ProdPrice[7]);
                break;
            }
            case 9: {
                System.out.println("Your selected for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[8] + " Product Name = " + product.Prodname[8]
                        + " Product price = " + product.ProdPrice[8]);
                break;
            }
            case 10: {
                System.out.println("Your selected for purchase product is ");
                // pd.viewProdList();
                System.out.println("Product ID = " + product.prodId[9] + " Product Name =  " + product.Prodname[9]
                        + " Product price = " + product.ProdPrice[9]);
                break;
            }
            default:
                System.out.println("You have Entered a wrong Option");

        }
    }
}

class PaymentOption {
    int select;

    void paymentOp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select The Option for Payment completion");
        System.out.println("1. Credit card");
        System.out.println("2. Internet banking/UPI");
        System.out.println("3. Cash");
        select = input.nextInt();

        switch (select) {
            case 1: {
                System.out.println("Payment for the purachase is done by the Credit Card");
            }
            case 2: {
                System.out.println("Payment for the purachase is done by the Internet Banking / UPI");
            }
            case 3: {
                System.out.println("Payment for the purachase is done by the Cash");
            }
            default:
                System.out.println("You have Entered a wrong Option");
        }

    }

}

class product {
    static int prodId[] = new int[10];
    static String Prodname[] = new String[10];
    static Double ProdPrice[] = new Double[10];

    static void ProductList() {
        // product P1 = new product();
        for (int i = 0; i < prodId.length; i++) {
            prodId[i] = i + 1;
        }

        Prodname[0] = "Apple iPhone 11 64 GB";
        Prodname[1] = "Apple iPhone 11 128 GB";
        Prodname[2] = "Apple iPhone 11 256 GB";
        Prodname[3] = "Apple iPhone 12 64 GB";
        Prodname[4] = "Apple iPhone 12 128 GB";
        Prodname[5] = "Apple iPhone 12 MiNi 64 GB";
        Prodname[6] = "Apple iPhone 12 MiNi 128 GB";
        Prodname[7] = "Apple iPhone 12 Pro 128 GB";
        Prodname[8] = "Apple iPhone 13 128 GB";
        Prodname[9] = "Apple iPhone 13 256 GB";

        ProdPrice[0] = 51000.0;
        ProdPrice[1] = 56000.0;
        ProdPrice[2] = 72000.0;
        ProdPrice[3] = 76000.0;
        ProdPrice[4] = 84000.0;
        ProdPrice[5] = 69000.0;
        ProdPrice[6] = 78000.0;
        ProdPrice[7] = 120000.0;
        ProdPrice[8] = 130000.0;
        ProdPrice[9] = 140000.0;

        // for (int i = 0; i < 10; i++) {
        // System.out.println(prodId[i] + " . " + Prodname[i] + " Just For Rs " +
        // ProdPrice[i]);
        // }

    }

    void viewProdList() {

        for (int i = 0; i < 10; i++) {
            System.out.println(prodId[i] + " . " + Prodname[i] + " Just For Rs " + ProdPrice[i]);
        }
    }

}

class ShopPerson {

    ShopPerson() {
        System.out.println("Welcome To Apple Store");
    }

    ShopPerson(String s) {
        System.out.println(s);
    }

    ShopPerson(String s1, String s2, String s3) {
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}