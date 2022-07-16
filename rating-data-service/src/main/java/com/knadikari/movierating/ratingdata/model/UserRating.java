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
package com.knadikari.movierating.ratingdata.model;

import java.util.List;

public class UserRating {

   private List<Rating> userRating;
   
   public UserRating(List<Rating> userRating) {
      this.userRating = userRating;
   }

   public List<Rating> getUserRating() {
      return userRating;
   }

   public void setUserRating(List<Rating> userRating) {
      this.userRating = userRating;
   }
}
