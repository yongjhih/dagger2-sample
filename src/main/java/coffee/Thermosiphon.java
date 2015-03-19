package coffee;

import javax.inject.Inject;

class Thermosiphon implements Pump {
  private final Heater heater;

  @Inject
  Thermosiphon(Heater heater) {
    this.heater = heater;
  }

  @Override public boolean pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
      return true;
    }
    return false;
  }
}
