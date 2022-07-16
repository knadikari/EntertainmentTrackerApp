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
package com.knadikari.movierating.movieinfo.model;

/**
 * @author IFS RnD
 */
public class Movie {

   private String movieId;
   private String name;

   public Movie(String movieId, String name) {
      this.movieId = movieId;
      this.name = name;
   }

   public void setMovieId(String movieId) {
      this.movieId = movieId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getMovieId() {
      return movieId;
   }

   public String getName() {
      return name;
   }
}
