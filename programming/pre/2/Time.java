class Time {
  public static void main(String[] args){
  
  double hourStarted = 8;
  double minuteStarted = 5;
  double secondStarted = 30;


  double hour = 10;
  double minute = 19;
  double second = 15;

  double init_sec_since_midnight = (hourStarted * 3600) + (minuteStarted * 60) + secondStarted;

  double sec_since_midnight = (hour * 3600) + (minute * 60) + second;
  double sec_left_in_day = 86400 - sec_since_midnight;

  double percent_of_day_passed = (sec_since_midnight / 86400) * 100;

  double exercise_time_elapsed = sec_since_midnight - init_sec_since_midnight;

  String time_of_exercise = ""+exercise_time_elapsed ;

  System.out.println("Number of seconds since midnight: " + sec_since_midnight);

  System.out.println("Number of seconds remaining in the day: " + sec_left_in_day);

  System.out.printf("Percentage of day that has passed: %.2f ", percent_of_day_passed);

  System.out.println();
  System.out.println("Time elapsed since starting this exercise: " + time_of_exercise + " seconds");

  
}


}