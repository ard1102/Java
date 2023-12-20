/**

 * The Measuring class is used to measure the time taken for a piece of code to complete its execution.

 */

public class Measuring {

  

 private static long sTime =-1;

 private static long eTime=-1;

  

 /**

  * Starts the timer and returns the current time in milliseconds.

  * @return The start time in milliseconds.

  */

 public static long startTime() {

  sTime = System.currentTimeMillis();

  return sTime;

 }

  

 /**

  * Stops the timer and returns the current time in milliseconds.

  * @return The end time in milliseconds.

  */

 public static long endTime() {

  eTime = System.currentTimeMillis();

  return eTime;

 }

  

 /**

  * Calculates and returns the elapsed time in seconds.

  * If print is true, it also prints the time in minutes and seconds if the elapsed time is greater than 59 seconds.

  * @param print Whether to print the time or not.

  * @return The elapsed time in seconds.

  */

 public static int getTime(boolean print) {

  if(eTime == -1) eTime=System.currentTimeMillis();

  int time = (int) ((eTime - sTime) / 1000);

  if(print)

  {

   if(time > 59)

   {

    time= getTimeMin(true);

   }else{

    time= getTimeSec(true);

   }

  }

  

  return time;

 }

  

 /**

  * Calculates and returns the elapsed time in seconds.

  * If print is true, it also prints the time in seconds.

  * @param print Whether to print the time or not.

  * @return The elapsed time in seconds.

  */

 public static int getTimeSec(boolean print) {

  int sec = (int) ((eTime - sTime) / 1000);

  if(print )System.out.println(sec+" seconds");

  

  return sec;

  

 }

  

 /**

  * Calculates and returns the elapsed time in minutes.

  * If print is true, it also prints the time in minutes and seconds.

  * @param print Whether to print the time or not.

  * @return The elapsed time in minutes.

  */

 public static int getTimeMin(boolean print) {

  int sec = (int) ((eTime - sTime) / 1000);

  int min = (int) (sec/60);

  int remsec=(int) (sec%60);

  

  if (print)  

  System.out.println(min+" min "+remsec+" sec");

  

  return min;

  

 }

  

 /**

  * Calculates and returns the remaining seconds of the elapsed time.

  * If print is true, it also prints the time in minutes and seconds.

  * @param print Whether to print the time or not.

  * @return The remaining seconds of the elapsed time.

  */

 public static int getTimeRsec(boolean print) {

  int sec = (int) ((eTime - sTime) / 1000);

  int min = (int) (sec/60);

  int remsec=(int) (sec%60);

  if (print)System.out.println(min+" min "+remsec+" sec");

  

  return remsec;

  

 }

  

 /**

  * A test method to measure the execution time of a piece of code.

  */

 public static void test() {

  startTime();

  try {

   //Thread.sleep(10000);

   Thread.sleep(61*1000);

  } catch (InterruptedException e) {

   // TODO Auto-generated catch block

   e.printStackTrace();

  }

  endTime();

  getTime(true);

 }

  

 /**

  * The main method to run the test multiple times.

  * @param args The command line arguments.

  */

 public static void main(String[] args) {

  for (int index = 0; index < 2; index++) {

   System.out.print("test " + index + ": ");

   test();

  }

 }

  

}