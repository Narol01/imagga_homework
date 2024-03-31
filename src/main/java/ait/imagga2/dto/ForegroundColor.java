package ait.imagga2.dto;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ForegroundColor {
    private String closest_palette_color;
    private String closest_palette_color_parent;
    private double percent;
}
