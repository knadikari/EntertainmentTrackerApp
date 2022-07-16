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
package com.knadikari.movierating.ratingdata.controller;

import com.knadikari.movierating.ratingdata.model.Rating;
import com.knadikari.movierating.ratingdata.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author IFS RnD
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingDataController {

//   @GetMapping("/{movieId}")
//   public Rating getRatingData(@PathVariable("movieId") String movieId) {
//      return (new Rating(movieId, 9));
//   }

   @GetMapping("/{userId}")
   public UserRating getUserRating(@PathVariable("userId") String userId) {
      return (new UserRating(Arrays.asList(
              new Rating("1", 5),
              new Rating("2", 6)
      )));
   }
}
