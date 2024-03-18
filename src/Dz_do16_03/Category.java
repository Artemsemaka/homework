package Dz_do16_03;

public class Category {
    private final String Category;

    public Category(String category) {
        Category = category;
    }
    public String getCategory() {
        return Category;
    }
    @Override
    public String toString() {
        return  Category + '\'';
    }
}


