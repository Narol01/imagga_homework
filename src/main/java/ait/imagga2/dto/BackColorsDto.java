package ait.imagga2.dto;
import lombok.Getter;
import lombok.ToString;

@Getter
public class BackColorsDto {
    private String closest_palette_color;
    private String closest_palette_color_parent;
    private double percent;

    @Override
    public String toString() {
        return  "closest_palette_color='" + closest_palette_color + '\'' +
                ", closest_palette_color_parent='" + closest_palette_color_parent + '\'' +
                ", percent=" + percent ;
    }
}
