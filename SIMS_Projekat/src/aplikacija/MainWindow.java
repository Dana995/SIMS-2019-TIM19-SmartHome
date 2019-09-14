package aplikacija;



import java.util.*;

/** @pdOid 350861e1-0aef-4322-9e7f-6c1f8d6cf8d3 */
public class MainWindow {
   /** @pdRoleInfo migr=no name=Tab assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Tab> tab;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Tab> getTab() {
      if (tab == null)
         tab = new java.util.HashSet<Tab>();
      return tab;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTab() {
      if (tab == null)
         tab = new java.util.HashSet<Tab>();
      return tab.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTab */
   public void setTab(java.util.Collection<Tab> newTab) {
      removeAllTab();
      for (java.util.Iterator iter = newTab.iterator(); iter.hasNext();)
         addTab((Tab)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTab */
   public void addTab(Tab newTab) {
      if (newTab == null)
         return;
      if (this.tab == null)
         this.tab = new java.util.HashSet<Tab>();
      if (!this.tab.contains(newTab))
         this.tab.add(newTab);
   }
   
   /** @pdGenerated default remove
     * @param oldTab */
   public void removeTab(Tab oldTab) {
      if (oldTab == null)
         return;
      if (this.tab != null)
         if (this.tab.contains(oldTab))
            this.tab.remove(oldTab);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTab() {
      if (tab != null)
         tab.clear();
   }

}