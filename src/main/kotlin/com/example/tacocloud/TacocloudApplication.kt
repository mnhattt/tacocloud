package com.example.tacocloud

import com.example.tacocloud.Ingredient.Type
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans

@SpringBootApplication
class TacocloudApplication

fun main(args: Array<String>) {
    runApplication<TacocloudApplication>(*args) {
        this.addInitializers(beans)
    }
}

val beans = beans {
    bean {
        CommandLineRunner {
            val repo = ref<IngredientRepo>()
            repo.save(Ingredient("FLTO", "Flour Tortilla", Type.WRAP))
            repo.save(Ingredient("COTO", "Corn Tortilla", Type.WRAP))
            repo.save(Ingredient("GRBF", "Ground Beef", Type.PROTEIN))
            repo.save(Ingredient("CARN", "Carnitas", Type.PROTEIN))
            repo.save(Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES))
            repo.save(Ingredient("LETC", "Lettuce", Type.VEGGIES))
            repo.save(Ingredient("CHED", "Cheddar", Type.CHEESE))
            repo.save(Ingredient("JACK", "Monterrey Jack", Type.CHEESE))
            repo.save(Ingredient("SLSA", "Salsa", Type.SAUCE))
            repo.save(Ingredient("SRCR", "Sour Cream", Type.SAUCE))
        }
    }
}
