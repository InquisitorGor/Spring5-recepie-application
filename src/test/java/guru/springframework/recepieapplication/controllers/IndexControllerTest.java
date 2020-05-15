package guru.springframework.recepieapplication.controllers;

import guru.springframework.recepieapplication.domain.Recipe;
import guru.springframework.recepieapplication.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    IndexController indexController;

    @Mock
    RecipeService recipeService;
    @Mock
    Model model;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {

        String viewName = indexController.getIndexPage(model);

        assertEquals(viewName, "index");
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute("recipes", anySet());

    }
}