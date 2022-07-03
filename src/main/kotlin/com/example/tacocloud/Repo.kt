package com.example.tacocloud

import org.springframework.data.repository.CrudRepository

interface OrderRepo : CrudRepository<TacoOrder, Long> {}

interface TacoRepo : CrudRepository<Taco, Long> {}

interface IngredientRepo : CrudRepository<Ingredient, Long> {}