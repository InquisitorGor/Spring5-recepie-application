package guru.springframework.recepieapplication.services;

import guru.springframework.recepieapplication.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
