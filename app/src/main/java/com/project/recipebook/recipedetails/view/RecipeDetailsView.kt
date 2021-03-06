package com.project.recipebook.recipedetails.view

import android.content.Context
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.project.recipebook.R
import com.project.recipebook.base.model.Ingredient
import com.project.recipebook.base.model.Recipe
import com.project.recipebook.base.model.RecipeDetails
import kotlinx.android.synthetic.main.fragment_recipe_details.view.*
import kotlinx.android.synthetic.main.item_recipedetails_ingredient.view.*

class RecipeDetailsView(context: Context): ConstraintLayout(context) {

    private val view = View.inflate(context, R.layout.item_recipedetails_ingredient, this)

    fun bind(ingredient: Ingredient) {
        view.ingredientTxt.text = ingredient.aisle
        print(ingredient)
//        Glide.with(itemView).load(recipe.image).into(itemView.recipeImg)
    }
}