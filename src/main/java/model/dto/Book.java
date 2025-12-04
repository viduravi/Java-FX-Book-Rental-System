package model.dto;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String title;
    private String category;
    private String author;
    private String quantity;
}
