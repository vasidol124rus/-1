// Реализуйте класс Товар,-> String name, double cost + getter/setter
// содержащий данные о товаре,
// и ТорговыйАвтомат, содержащий -> ArrayList<Product> + initProducts + getProduct
// в себе методы initProducts (List <Product>)
// сохраняющий в себе список исходных продуктов
// и getProduct(String name)
// Сделать класс Товар абстрактным, 
// создать нескольких наследников (к примеру: БутылкаВоды), 
// сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то
//  одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат

import java.util.List;

public class MainStart {
    public static void main(String[] args) {
        
        Product prod1 = new BotеleOfWather("Вода", 10.0);
        Product prod2 = new BotеleOfWather("Пиво", 3.0);
        Product prod3 = new BotеleOfWather("Вода", 7.50);
        Product prod4 = new BotеleOfWather("ГАЗИРОВКА", 96.75);
        Product prod5 = new BotеleOfWather("лИмонад", 127.60);

        ProductMashineWother prodAuto = new ProductMashineWother();

        prodAuto.initProducts(List.of(prod1, prod2, prod3, prod4, prod5));
        
 
        System.out.println(prodAuto.geProduct("Пиво"));

    }
    
}
