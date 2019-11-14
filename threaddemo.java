import java.util.*;
class newtherad 
{
  thread t;
  int newthread();
 {
  t = newthread (this.childthread);
  System.out.println("t");  
  t.start();
 
public void run()
{
 try
  {
 for (int x=5;x>0;x--)
{ System.out.println("child :" + x);
   thread.sleep(500);}
  }
}
 catch(InterruptedException exception)
{
 {System.out.println("waken up sleeping child");}
 {System.out.println("child thread exitng"); }
}
}.
0
class threaddemo
{
public static void main(String args[])
{
 new newthread();
 try     
 {
  for (int y=5;y>0;y--) 
{System.out.println("parent:"+y); 
thread.sleep(1000);
}
}
 catch(InterruptedException exception)
{
{System.out.println("main thread woken up"); }
{System.out.println("main thread exiting"); }
}
}
}

