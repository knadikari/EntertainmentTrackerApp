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

public class Catalogueitem {

   private String name;
   private String desc;

   public Catalogueitem(String name, String desc, int rating) {
      this.name = name;
      this.desc = desc;
      this.rating = rating;
   }

   private int rating;

   public void setName(String name) {
      this.name = name;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public void setRating(int rating) {
      this.rating = rating;
   }

   public String getName() {
      return name;
   }

   public String getDesc() {
      return desc;
   }

   public int getRating() {
      return rating;
   }
}
