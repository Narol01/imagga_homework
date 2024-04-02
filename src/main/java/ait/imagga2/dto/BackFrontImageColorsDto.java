package ait.imagga2.dto;
import lombok.Getter;
import lombok.ToString;


@Getter
public class BackFrontImageColorsDto {
    private String closest_palette_color;
    private String closest_palette_color_parent;
    private double percent;

    @Override
    public String toString() {
        return  closest_palette_color + "\t\t" + closest_palette_color_parent + "\t\t" + percent;
    }
}
