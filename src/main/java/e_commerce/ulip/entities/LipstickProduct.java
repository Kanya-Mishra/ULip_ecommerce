package e_commerce.ulip.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "lipstickproduct")
public class LipstickProduct {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "brand")
        private String brand;

        @Column(name = "color")
        private String color;

        @Column(name = "price")
        private Double price;

        @Column(name = "description")
        private String description;

        @Column(name = "image_url")
        private String image_url;

        @Column(name = "category_id")
        private Long category_id;

        // Constructors, Getters, and Setters


        public LipstickProduct () {}

        public LipstickProduct(String name, String brand, String color, Double price, String description, String image_url, Long category_id) {
            this.name = name;
            this.brand = brand;
            this.color = color;
            this.price = price;
            this.description = description;
            this.image_url = image_url;
            this.category_id = category_id;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public Long getCategory_id() {
            return category_id;
        }

        public void setCategory_id(Long category_id) {
            this.category_id = category_id;
        }
}
