package it.unipd.math.swe.patterns.builder;

import java.util.Objects;

/**
 * The Builder accumulates information to create a product. When the creation
 * method is called, it can check whether all the precondition needed to build
 * an Happy Meal are met.
 *
 * It exposes a fluent API.
 *
 * @see <a href="https://zeroturnaround.com/rebellabs/a-fluent-api-or-not-a-fluent-api-that-is-the-question/">
 *     A Fluent API or not a fluent API? That is the Question!</a>
 */
public class HappyMealBuilder {
    private String drink;
    /**
     * The fruit is not mandatory to build an Happy Meal (my gosh!)
     */
    private String fruit = null;
    private String toy;
    private String burger;
    private String cake;

    public HappyMealBuilder withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public HappyMealBuilder withFruit(String fruit) {
        this.fruit = fruit;
        return this;
    }

    public HappyMealBuilder withToy(String toy) {
        this.toy = toy;
        return this;
    }

    public HappyMealBuilder withBurger(String burger) {
        this.burger = burger;
        return this;
    }

    public HappyMealBuilder withCake(String cake) {
        this.cake = cake;
        return this;
    }

    public HappyMeal build() {
        Objects.nonNull(drink);
        Objects.nonNull(toy);
        Objects.nonNull(burger);
        Objects.nonNull(cake);
        return new HappyMeal(drink,
                             fruit,
                             toy,
                             burger,
                             cake);
    }
}