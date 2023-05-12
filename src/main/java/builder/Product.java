package builder;

public class Product {
    private String part1;
    private String part2;
    private String part3;

    private Product(Builder builder) {
        this.part1 = builder.part1;
        this.part2 = builder.part2;
        this.part3 = builder.part3;
    }

    public static class Builder {
        private String part1;
        private String part2;
        private String part3;

        public Builder() {
        }

        public Builder part1(String part1) {
            this.part1 = part1;
            return this;
        }

        public Builder part2(String part2) {
            this.part2 = part2;
            return this;
        }

        public Builder part3(String part3) {
            this.part3 = part3;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                '}';
    }
}


class ProductWithoutBuilder{
    private String part1;
    private String part2;
    private String part3;

    public ProductWithoutBuilder(String part1, String part2, String part3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }

}




class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .part1("part1")
                .part2("part2")
                .part3("part3")
                .build();

        System.out.println(product);
    }
}
