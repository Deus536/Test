public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("мороженое", 10, 1, 1.5);
        System.out.println(basket.getTotalPrice());
        System.out.println(basket.getTotalWeight());
//        System.out.println(basket.contains("мороженое"));
        basket.add("чупик", 2);
        System.out.println(basket.getTotalPrice());
//        System.out.println(basket.getTotalWeight());
//        basket.add("кола",50, 3);
//        System.out.println(basket.getTotalPrice());
//        System.out.println(basket.getTotalWeight());
//        basket.add("вес", 4,55, 4.7);
//        System.out.println(basket.getTotalPrice());
//        System.out.println(basket.getTotalWeight());


        Basket basket1 = new Basket();
        basket1.add("232", 2,1);
        System.out.println(basket1.getTotalPrice());
        System.out.println(basket1.getTotalWeight());
        System.out.println(basket1.getAllTotalCountBaskets());
        System.out.println(basket1.toSting());
    }
}