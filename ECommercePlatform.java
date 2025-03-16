public class ECommercePlatform {
  public static void main(String[] args) {
      FurnitureItem chair = new Chair(15);
      FurnitureItem table = new Table(30, 10);
      FurnitureItem sofa = new Sofa(50, 20, 100);

      ShippingCostCalculator calculator = new StandardShippingCalculator();

      chair.accept(calculator);
      table.accept(calculator);
      sofa.accept(calculator);
  }
}