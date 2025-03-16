class StandardShippingCalculator implements ShippingCostCalculator {

  @Override
  public void visit(Chair chair) {
      double cost = 10.0; // Flat rate for chairs
      System.out.println("Shipping cost for Chair: $" + cost);
  }

  @Override
  public void visit(Table table) {
      double cost = table.getWeight() * 0.5 + table.getSurfaceArea() * 1.0;
      System.out.println("Shipping cost for Table: $" + cost);
  }

  @Override
  public void visit(Sofa sofa) {
      double cost = sofa.getWeight() * 0.7 + sofa.getVolume() * 2.0 + sofa.getDistance() * 0.1;
      System.out.println("Shipping cost for Sofa: $" + cost);
  }
}
