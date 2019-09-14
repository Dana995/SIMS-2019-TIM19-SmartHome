package aplikacija;

import java.util.*;

import forme.LoginScreen;

/** @pdOid 7987bc84-e361-447e-b411-7d340ee00ab8 */
public abstract class Application {
   /** @pdRoleInfo migr=no name=MenuBar assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<MenuBar> menuBar;
   /** @pdRoleInfo migr=no name=MainWindow assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<MainWindow> mainWindow;
   /** @pdRoleInfo migr=no name=LoginScreen assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<LoginScreen> loginScreen;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<MenuBar> getMenuBar() {
      if (menuBar == null)
         menuBar = new java.util.HashSet<MenuBar>();
      return menuBar;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMenuBar() {
      if (menuBar == null)
         menuBar = new java.util.HashSet<MenuBar>();
      return menuBar.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMenuBar */
   public void setMenuBar(java.util.Collection<MenuBar> newMenuBar) {
      removeAllMenuBar();
      for (java.util.Iterator iter = newMenuBar.iterator(); iter.hasNext();)
         addMenuBar((MenuBar)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMenuBar */
   public void addMenuBar(MenuBar newMenuBar) {
      if (newMenuBar == null)
         return;
      if (this.menuBar == null)
         this.menuBar = new java.util.HashSet<MenuBar>();
      if (!this.menuBar.contains(newMenuBar))
         this.menuBar.add(newMenuBar);
   }
   
   /** @pdGenerated default remove
     * @param oldMenuBar */
   public void removeMenuBar(MenuBar oldMenuBar) {
      if (oldMenuBar == null)
         return;
      if (this.menuBar != null)
         if (this.menuBar.contains(oldMenuBar))
            this.menuBar.remove(oldMenuBar);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMenuBar() {
      if (menuBar != null)
         menuBar.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<MainWindow> getMainWindow() {
      if (mainWindow == null)
         mainWindow = new java.util.HashSet<MainWindow>();
      return mainWindow;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMainWindow() {
      if (mainWindow == null)
         mainWindow = new java.util.HashSet<MainWindow>();
      return mainWindow.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMainWindow */
   public void setMainWindow(java.util.Collection<MainWindow> newMainWindow) {
      removeAllMainWindow();
      for (java.util.Iterator iter = newMainWindow.iterator(); iter.hasNext();)
         addMainWindow((MainWindow)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMainWindow */
   public void addMainWindow(MainWindow newMainWindow) {
      if (newMainWindow == null)
         return;
      if (this.mainWindow == null)
         this.mainWindow = new java.util.HashSet<MainWindow>();
      if (!this.mainWindow.contains(newMainWindow))
         this.mainWindow.add(newMainWindow);
   }
   
   /** @pdGenerated default remove
     * @param oldMainWindow */
   public void removeMainWindow(MainWindow oldMainWindow) {
      if (oldMainWindow == null)
         return;
      if (this.mainWindow != null)
         if (this.mainWindow.contains(oldMainWindow))
            this.mainWindow.remove(oldMainWindow);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMainWindow() {
      if (mainWindow != null)
         mainWindow.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<LoginScreen> getLoginScreen() {
      if (loginScreen == null)
         loginScreen = new java.util.HashSet<LoginScreen>();
      return loginScreen;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLoginScreen() {
      if (loginScreen == null)
         loginScreen = new java.util.HashSet<LoginScreen>();
      return loginScreen.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLoginScreen */
   public void setLoginScreen(java.util.Collection<LoginScreen> newLoginScreen) {
      removeAllLoginScreen();
      for (java.util.Iterator iter = newLoginScreen.iterator(); iter.hasNext();)
         addLoginScreen((LoginScreen)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLoginScreen */
   public void addLoginScreen(LoginScreen newLoginScreen) {
      if (newLoginScreen == null)
         return;
      if (this.loginScreen == null)
         this.loginScreen = new java.util.HashSet<LoginScreen>();
      if (!this.loginScreen.contains(newLoginScreen))
         this.loginScreen.add(newLoginScreen);
   }
   
   /** @pdGenerated default remove
     * @param oldLoginScreen */
   public void removeLoginScreen(LoginScreen oldLoginScreen) {
      if (oldLoginScreen == null)
         return;
      if (this.loginScreen != null)
         if (this.loginScreen.contains(oldLoginScreen))
            this.loginScreen.remove(oldLoginScreen);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLoginScreen() {
      if (loginScreen != null)
         loginScreen.clear();
   }

}