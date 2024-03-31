package ait.imagga2.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.List;


@Getter
@ToString
public class ColorsDto {
    private List<BackColorsDto> background_colors;
    private List<BackColorsDto> foreground_colors;
    private List<BackColorsDto> image_colors;

}
