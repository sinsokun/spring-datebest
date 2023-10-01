package co.istad.sb4webmvc.Model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Product {
        private Integer id;
        private String name;
        private String slug;
        private Double price;
        private Boolean inStock;
        private Supplier supplier;
        private List<Category> categories;
    }

