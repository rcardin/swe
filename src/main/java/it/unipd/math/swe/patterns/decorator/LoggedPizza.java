package it.unipd.math.swe.patterns.decorator;

import java.util.List;
import java.util.logging.Logger;

public class LoggedPizza extends ToppedPizza {
  
  private final static Logger logger = Logger.getLogger("LoggedPizza");
  
  protected LoggedPizza(Pizza toDecorate) {
    super(toDecorate);
  }
  
  @Override
  protected List<String> addIngredients(List<String> ingredients) {
    logger.info(ingredients.toString());
    return ingredients;
  }
}
