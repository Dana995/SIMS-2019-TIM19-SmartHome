package aplikacija;

/***********************************************************************
 * Module:  Floor.java
 * Author:  Nadja
 * Purpose: Defines the Class Floor
 ***********************************************************************/

import java.util.*;

/** @pdOid ca9fefab-17a3-4802-9b53-b69bc2b5d3da */
public class Floor {
   /** @pdRoleInfo migr=no name=Room assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Room> room;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Room> getRoom() {
      if (room == null)
         room = new java.util.HashSet<Room>();
      return room;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRoom() {
      if (room == null)
         room = new java.util.HashSet<Room>();
      return room.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRoom */
   public void setRoom(java.util.Collection<Room> newRoom) {
      removeAllRoom();
      for (java.util.Iterator iter = newRoom.iterator(); iter.hasNext();)
         addRoom((Room)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRoom */
   public void addRoom(Room newRoom) {
      if (newRoom == null)
         return;
      if (this.room == null)
         this.room = new java.util.HashSet<Room>();
      if (!this.room.contains(newRoom))
         this.room.add(newRoom);
   }
   
   /** @pdGenerated default remove
     * @param oldRoom */
   public void removeRoom(Room oldRoom) {
      if (oldRoom == null)
         return;
      if (this.room != null)
         if (this.room.contains(oldRoom))
            this.room.remove(oldRoom);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRoom() {
      if (room != null)
         room.clear();
   }

}