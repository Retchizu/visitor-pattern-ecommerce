class Table implements FurnitureItem {
  private double weight;
  private double surfaceArea;

  public Table(double weight, double surfaceArea) {
      this.weight = weight;
      this.surfaceArea = surfaceArea;
  }

  public double getWeight() {
      return weight;
  }

  public double getSurfaceArea() {
      return surfaceArea;
  }

  @Override
  public void accept(ShippingCostCalculator visitor) {
      visitor.visit(this);
  }
}
