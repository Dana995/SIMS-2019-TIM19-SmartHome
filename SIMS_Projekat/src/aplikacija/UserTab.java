package aplikacija;

/***********************************************************************
 * Module:  UserTab.java
 * Author:  Nadja
 * Purpose: Defines the Class UserTab
 ***********************************************************************/

import java.util.*;

/** @pdOid fc1e4b70-ceae-4c33-a595-254861dcead6 */
public class UserTab extends Tab {
   /** @pdRoleInfo migr=no name=User assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<User> user;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<User> getUser() {
      if (user == null)
         user = new java.util.HashSet<User>();
      return user;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUser() {
      if (user == null)
         user = new java.util.HashSet<User>();
      return user.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUser */
   public void setUser(java.util.Collection<User> newUser) {
      removeAllUser();
      for (java.util.Iterator iter = newUser.iterator(); iter.hasNext();)
         addUser((User)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUser */
   public void addUser(User newUser) {
      if (newUser == null)
         return;
      if (this.user == null)
         this.user = new java.util.HashSet<User>();
      if (!this.user.contains(newUser))
         this.user.add(newUser);
   }
   
   /** @pdGenerated default remove
     * @param oldUser */
   public void removeUser(User oldUser) {
      if (oldUser == null)
         return;
      if (this.user != null)
         if (this.user.contains(oldUser))
            this.user.remove(oldUser);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUser() {
      if (user != null)
         user.clear();
   }

}