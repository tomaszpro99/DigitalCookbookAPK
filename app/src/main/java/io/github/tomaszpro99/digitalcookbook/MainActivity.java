package io.github.tomaszpro99.digitalcookbook;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import io.github.tomaszpro99.digitalcookbook.R;
import io.github.tomaszpro99.digitalcookbook.Recipe;
import io.github.tomaszpro99.digitalcookbook.RecipeAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView recipeListView = findViewById(R.id.recipeListView);
        RecipeAdapter recipeAdapter = new RecipeAdapter(this, generateSampleData());
        recipeListView.setAdapter((ListAdapter) recipeAdapter);
    }

    // Metoda generująca przykładowe dane przepisów
    private List<Recipe> generateSampleData() {
        List<Recipe> recipes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Recipe recipe = new Recipe("Tytuł przepisu " + i, "Autor " + i, i * 10);
            recipes.add(recipe);
        }
        return recipes;
    }
}
