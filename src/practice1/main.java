package practice1;

import java.util.Scanner;

public class main {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        int choice;
        do{

            menu();
            System.out.println("Mời bạn nhập:");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    addProduct(scanner, productManager);
                    break;
                }
                case 2: {

                    editProduct(scanner, productManager);
                    break;
                }
                case 3: {
                    deleteProduct(scanner,productManager);
                    break;
                }
                case 4:

                     { productManager.displayProduct();break;
                    }
                case 5:
                {
                    findProductInList(scanner,productManager);
                    break;
                }
                case 6:
                {
                    productManager.sortProduct();
                    System.out.println("sắp xếp");
                    break;
            }
                case 0:{
                    System.exit(0);}
                default:{
                    System.out.println("mời nhập lại");
                }
            }


        } while(choice!=0);
    }

    private static void findProductInList(Scanner scanner,ProductManager productManager) {
        System.out.println("nhập tên sản phẩm");
        String name=scanner.nextLine();
        int index = findIndexFromName(productManager, name);
        if(index!=-1)
        {
            System.out.println("đã tìm thấy"+ productManager.findProduct(index).toString());
        }
        else
        {
            System.out.println("ko tìm thấy");
        }
    }

    private static int findIndexFromName(ProductManager productManager, String name) {
        int index=-1;
        for(int i = 0; i< productManager.getProducts().size(); i++)
        {
            if(name.equals(productManager.getProducts().get(i).getIdProduct()))
            {
                index=i;
            }
            break;
        }
        return index;
    }

    private static void deleteProduct(Scanner scanner,ProductManager productManager) {
        System.out.println("nhập id sản phẩm muốn xóa:");
        String idProduct= scanner.nextLine();
        int index=findIndexFromId(idProduct, productManager);
        if(index!=-1)
        {
            productManager.remove(index);

        }
        else
        {
            System.out.println("ko thấy id sản phẩm");
        }
    }

    private static int findIndexFromId(String idProduct,ProductManager productManager)
    {

        int index=-1;
        for(int i=0;i<productManager.getProducts().size();i++)
        {
            if(idProduct.equals(productManager.getProducts().get(i).getIdProduct()))
            {
                index=i;
                break;
            }
        }
        return index;
    }
    public static void editProduct(Scanner scanner,ProductManager productManager)
    {
        System.out.println("nhập id muốn sửa");
        String idProduct=scanner.nextLine();
        int index=findIndexFromId(idProduct,productManager);
        if(index!=-1)
        {
            Product product=initProduct(scanner);
            productManager.editProduct(index,product);

        }
        else
        {
            System.out.println("Không tìm thấy id");
        }
    }
    public static void addProduct(Scanner scanner,ProductManager productManager)
    {
        Product product=initProduct(scanner);
        productManager.addProduct(product);
        System.out.println("Đã thêm thành công");
    }
    public static Product initProduct(Scanner scanner)
    {
        scanner.nextLine();
        System.out.println("Tên sản phẩm");
        String name=scanner.nextLine();
        System.out.println("Id sản phẩm");
        String id= scanner.nextLine();
        System.out.println("Giá sản phẩm");
        int price= scanner.nextInt();
        return new Product(name,id,price);
    }
    private static void menu() {
        System.out.println("--------------------");
        System.out.println("MENU");
        System.out.println("1: Thêm sản phẩm");
        System.out.println("2: Sửa sản phẩm");
        System.out.println("3: Xóa sản phẩm");
        System.out.println("4: Hiển thị danh sách sản phẩm");
        System.out.println("5: Tìm kiếm sản phẩm");
        System.out.println("6: Sắp sếp sản phẩm");
        System.out.println("0: Thoát");
        System.out.println("--------------------");
    }
}
