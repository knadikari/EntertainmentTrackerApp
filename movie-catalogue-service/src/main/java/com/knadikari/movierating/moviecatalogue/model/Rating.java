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
package com.knadikari.movierating.moviecatalogue.model;

/**
 * @author IFS RnD
 */

public class Rating {

   private String movieId;
   private int rating;

   public Rating() {
   }

   public Rating(String movieId, int rating) {
      this.movieId = movieId;
      this.rating = rating;
   }

   public String getMovieId() {
      return movieId;
   }

   public void setMovieId(String movieId) {
      this.movieId = movieId;
   }

   public void setRating(int rating) {
      this.rating = rating;
   }

   public int getRating() {
      return rating;
   }
}
