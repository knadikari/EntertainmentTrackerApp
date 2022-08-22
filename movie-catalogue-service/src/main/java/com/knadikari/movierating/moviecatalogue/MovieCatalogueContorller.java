/*
 *                 IFS Research & Development
 *
 *  This program is protected by copyright law and by international
 *  conventions. All licensing, renting, lending or copying (including
 *  for private use), and all other use of the program, which is not
 *  expressively permitted by IFS Research & Development (IFS), is a
 *  violation of the rights of IFS. Such violations will be reported to the
 *  appropriate authorities.
 *
 *  VIOLATIONS OF ANY COPYRIGHT IS PUNISHABLE BY LAW AND CAN LEAD
 *  TO UP TO TWO YEARS OF IMPRISONMENT AND LIABILITY TO PAY DAMAGES.
 */
package com.knadikari.movierating.moviecatalogue;

import com.knadikari.movierating.moviecatalogue.model.Catalogueitem;
import com.knadikari.movierating.moviecatalogue.model.Movie;
import com.knadikari.movierating.moviecatalogue.model.Rating;
import com.knadikari.movierating.moviecatalogue.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author IFS RnD
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogueContorller {

   @Autowired
   private RestTemplate restTemplate;

   @Autowired
   WebClient.Builder webClientBuilder;

   @GetMapping("/{userId}")
   public List<Catalogueitem> getCatalogue(@PathVariable("userId") String userId) {

      UserRating ratings = webClientBuilder.build()
              .get()
              .uri("http://rating-data-service/ratingsdata/" + userId)
              .retrieve()
              .bodyToMono(UserRating.class)
              .block();

      return ratings.getUserRating().stream().map(rating -> {
//         Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
         Movie movie = webClientBuilder.build()
                 .get()
                 .uri("http://movie-info-service/movies/" + rating.getMovieId())
                 .retrieve()
                 .bodyToMono(Movie.class)
                 .block();
         return new Catalogueitem(movie.getName(), "Transformers", rating.getRating());
      }).collect(Collectors.toList());
   }
}
