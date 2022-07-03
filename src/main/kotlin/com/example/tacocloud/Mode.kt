package com.example.tacocloud

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "TACO_ORDER")
class TacoOrder {
    @Id
    @GeneratedValue
    var id: Long? = null

    var info: String? = null

    @OneToMany
    var tacos: MutableList<Taco> = mutableListOf()

    fun addTaco(taco: Taco) {
        tacos.add(taco)
    }
}

@Entity
@Table(name = "TACO")
class Taco {
    @Id
    @GeneratedValue
    var id: Long? = null

    var name: String? = null

    @ManyToMany
    var ingredients: MutableList<Ingredient> = mutableListOf()

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }
}

@Entity
@Table(name = "TACO_INGREDIENTS")
class Ingredient(@Id val id: String, val name: String, val type: Type) {
    enum class Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}

