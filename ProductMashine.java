// Реализуйте класс Товар,-> String name, double cost + getter/setter
// содержащий данные о товаре,
// и ТорговыйАвтомат, содержащий -> ArrayList<Product> + initProducts + getProduct
// в себе методы initProducts (List <Product>)
// сохраняющий в себе список исходных продуктов
// и getProduct(String name)
// import java.util.ArrayList;
import java.util.List;

public interface ProductMashine {
    
    public void initProducts(List<Product> listProd);
    public Product geProduct(String name);
       


    
// // } ProductMashine {
     
//     List<Product> listProduct = new ArrayList<Product>();

//     public void initProducts(List<Product> listProd){
//         this.listProduct = listProd;

//     }
//     public Product geProduct(String name){
//         for (Product prod : listProduct) {
//             if (prod.getName().equals(name));
//                 return prod;

//         }
//         return null;
       
//     }
//     public List<Product> getList(){
//         return listProduct;
//     }
}
