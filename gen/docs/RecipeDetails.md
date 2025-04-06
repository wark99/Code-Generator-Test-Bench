

# RecipeDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  |
|**instructions** | **List&lt;String&gt;** |  |  |
|**ingredients** | [**List&lt;RecipeDetailsIngredientsInner&gt;**](RecipeDetailsIngredientsInner.md) |  |  |
|**images** | **List&lt;URI&gt;** |  |  |
|**cookTime** | **BigDecimal** |  |  |
|**servingSize** | **Integer** |  |  |
|**allergens** | **List&lt;String&gt;** |  |  |
|**cuisine** | [**CuisineSummary**](CuisineSummary.md) |  |  [optional] |
|**dish** | [**DishSummary**](DishSummary.md) |  |  |
|**selfBookmarked** | **Boolean** |  |  [optional] |
|**avgRating** | **Float** |  |  [optional] |
|**ratingsCount** | **Integer** |  |  |
|**selfRating** | **Integer** | The current user&#39;s rating for this recipe, if any. |  [optional] |
|**author** | [**UserSummary**](UserSummary.md) |  |  |



