package ait.imagga2;

import ait.imagga2.dto.ResponseDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class ImmagaAppl {
    public static void main(String[] args) {
        RestTemplate restTemplate=new RestTemplate();
        HttpHeaders headers =new HttpHeaders();
        headers.add("Authorization", "Basic YWNjXzAyYzNlZjUwMjk4ODUzMTpjMWI1NTRmNjA4YTE4Y2E4Y2UxNzQ2M2U3NjJkNjVlOQ==");
UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.imagga.com/v2/colors")
        .queryParam("image_url","https://i.pinimg.com/236x/03/56/cf/0356cf47a5c70513da5d72627525b8f0.jpg");
        URI url = builder.build().toUri();
        RequestEntity<String> requestEntity=new RequestEntity<>(headers, HttpMethod.GET,url);
        ResponseEntity<ResponseDto> response=restTemplate.exchange(requestEntity,ResponseDto.class);
        response.getBody().getResult().getColors().getBackground_colors().forEach(System.out::println);
        response.getBody().getResult().getColors().getImage_colors().forEach(System.out::println);
        response.getBody().getResult().getColors().getForeground_colors().forEach(System.out::println);
    }
}
