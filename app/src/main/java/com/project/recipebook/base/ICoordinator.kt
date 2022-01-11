package com.project.recipebook.base

interface ICoordinator {

    fun showRecipeList(recipeType: String? = null,value: Int)

    fun shopRecipeDetails(id: Int)

    fun showRecipeCategoryList()
}