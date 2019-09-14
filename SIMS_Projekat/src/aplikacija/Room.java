package aplikacija;

/***********************************************************************
 * Module:  Room.java
 * Author:  Nadja
 * Purpose: Defines the Class Room
 ***********************************************************************/

import java.util.*;

/** @pdOid 96ffc906-d9e7-4545-9396-d838c5343b47 */
public class Room {
   /** @pdRoleInfo migr=no name=Sensor assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Sensor> sensor;
   /** @pdRoleInfo migr=no name=Appliances assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Appliances> appliances;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Sensor> getSensor() {
      if (sensor == null)
         sensor = new java.util.HashSet<Sensor>();
      return sensor;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSensor() {
      if (sensor == null)
         sensor = new java.util.HashSet<Sensor>();
      return sensor.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSensor */
   public void setSensor(java.util.Collection<Sensor> newSensor) {
      removeAllSensor();
      for (java.util.Iterator iter = newSensor.iterator(); iter.hasNext();)
         addSensor((Sensor)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSensor */
   public void addSensor(Sensor newSensor) {
      if (newSensor == null)
         return;
      if (this.sensor == null)
         this.sensor = new java.util.HashSet<Sensor>();
      if (!this.sensor.contains(newSensor))
         this.sensor.add(newSensor);
   }
   
   /** @pdGenerated default remove
     * @param oldSensor */
   public void removeSensor(Sensor oldSensor) {
      if (oldSensor == null)
         return;
      if (this.sensor != null)
         if (this.sensor.contains(oldSensor))
            this.sensor.remove(oldSensor);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSensor() {
      if (sensor != null)
         sensor.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Appliances> getAppliances() {
      if (appliances == null)
         appliances = new java.util.HashSet<Appliances>();
      return appliances;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAppliances() {
      if (appliances == null)
         appliances = new java.util.HashSet<Appliances>();
      return appliances.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAppliances */
   public void setAppliances(java.util.Collection<Appliances> newAppliances) {
      removeAllAppliances();
      for (java.util.Iterator iter = newAppliances.iterator(); iter.hasNext();)
         addAppliances((Appliances)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAppliances */
   public void addAppliances(Appliances newAppliances) {
      if (newAppliances == null)
         return;
      if (this.appliances == null)
         this.appliances = new java.util.HashSet<Appliances>();
      if (!this.appliances.contains(newAppliances))
         this.appliances.add(newAppliances);
   }
   
   /** @pdGenerated default remove
     * @param oldAppliances */
   public void removeAppliances(Appliances oldAppliances) {
      if (oldAppliances == null)
         return;
      if (this.appliances != null)
         if (this.appliances.contains(oldAppliances))
            this.appliances.remove(oldAppliances);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAppliances() {
      if (appliances != null)
         appliances.clear();
   }

}