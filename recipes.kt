// СУЩНОСТЬ: Ingredient (Ингредиент)
class Ingredient(
    val id: Int,
    val name: String,
    var quantity: Float,
    // Публичное неизменяемое свойство: единица измерения (например, "г", "шт")
    val unit: String,
)

// СУЩНОСТЬ: RecipeCategory (Категория рецепта)
class RecipeCategory(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String? = null,
)

// СУЩНОСТЬ: Recipe (Рецепт)
class Recipe(
    val id: Int,
    val title: String,
    val imageUrl: String,
    var cookingTimeMinutes: Int,
    val servings: Int = 1,
    var instructions: String? = null,
    var isFavorite: Boolean = false,
    val ingredients: List<Ingredient>,
    val categoryId: Long? = null,
)

fun main() {}
