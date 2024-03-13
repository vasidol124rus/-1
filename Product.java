// Реализуйте класс Товар,-> String name, double cost + getter/setter
// содержащий данные о товаре,
// и ТорговыйАвтомат, содержащий -> ArrayList<Product> + initProducts + getProduct
// в себе методы initProducts (List <Product>)
// сохраняющий в себе список исходных продуктов
// и getProduct(String name)


public abstract class Product {
    protected String name;
    protected double cost;

    public Product(String name, double cost){
        this.name = name;
        this.cost = cost;

    }
    public Product(){

    }

    public String getName(){
        return name;
    }

    public double getCost(){
        return cost;
    }
    @Override
    public String toString(){
        return String.format("Товар: %s, Цена : %.2f", name, cost); 

    }



    
}
