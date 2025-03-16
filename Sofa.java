
class Sofa implements FurnitureItem {
  private double weight;
  private double volume;
  private double distance;

  public Sofa(double weight, double volume, double distance) {
      this.weight = weight;
      this.volume = volume;
      this.distance = distance;
  }

  public double getWeight() {
      return weight;
  }

  public double getVolume() {
      return volume;
  }

  public double getDistance() {
      return distance;
  }

  @Override
  public void accept(ShippingCostCalculator visitor) {
      visitor.visit(this);
  }
}