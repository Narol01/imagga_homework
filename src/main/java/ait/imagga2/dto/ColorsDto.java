package ait.imagga2.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.List;


@Getter
@ToString
public class ColorsDto {
    private List<BackColorsDto> background_colors;
    private List<ForegroundColor> foreground_colors;
    private List<ImageColor> image_colors;

}
