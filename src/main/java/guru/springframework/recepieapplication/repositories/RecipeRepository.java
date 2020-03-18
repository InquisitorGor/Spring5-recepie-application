package guru.springframework.recepieapplication.repositories;

import guru.springframework.recepieapplication.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
