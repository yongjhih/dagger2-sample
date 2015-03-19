package coffee;

import dagger.Lazy;
import javax.inject.Inject;

class CoffeeMaker {
  private final Lazy<Heater> heater; // Create a possibly costly heater only when we use it.
  private final Pump pump;

  @Inject CoffeeMaker(Lazy<Heater> heater, Pump pump) {
    this.heater = heater;
    this.pump = pump;
  }

  public void on() {
    if (!heater.get().isHot()) heater.get().on();
  }

  public void brew() {
    if (pump.pump()) System.out.println(" [_]P coffee! [_]P ");
  }

  public void off() {
      if (heater.get().isHot()) heater.get().off();
  }
}
