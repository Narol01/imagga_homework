package ait.imagga2.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.List;


@Getter
@ToString
public class ColorsDto {
    private List<BackFrontImageColorsDto> background_colors;
    private List<BackFrontImageColorsDto> foreground_colors;
    private List<BackFrontImageColorsDto> image_colors;

}
