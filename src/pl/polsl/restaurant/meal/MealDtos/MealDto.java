package pl.polsl.restaurant.meal.MealDtos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pl.polsl.restaurant.customer.Customer;
import pl.polsl.restaurant.include.Include;
import pl.polsl.restaurant.ingredient.IngredientDtos.IngredientDto;
import pl.polsl.restaurant.meal.DietType;
import pl.polsl.restaurant.meal.Meal;
import pl.polsl.restaurant.meal.Spiciness;

public class MealDto {
	private int id;
	private String name;
	private Spiciness spiciness;
	private DietType dietType;
	private Set<Include> includes = new HashSet<Include>();
	
	public MealDto(){};
	public MealDto(int id, String name, Spiciness spiciness, DietType dietType, Set<Include> includes){
		this.id = id;
		this.name = name;
		this.spiciness = spiciness;
		this.dietType = dietType;
		this.includes = includes;
	};
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Spiciness getSpiciness() {
		return spiciness;
	}
	public DietType getDietType() {
		return dietType;
	}
	public Set<Include> getIncludes() {
		return includes;
	}
}
