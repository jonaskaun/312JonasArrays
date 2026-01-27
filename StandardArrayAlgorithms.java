/*
 * Activity 3.1.4
 */
public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    
    int sum = 0;
    for (int i = 0; i < goals.length; i++)
      //record each goal to a single sum int
      sum += goals[i];
    System.out.println("All goals: " + sum);
    // print average goals per game, no rounding
    double averageGoals = (sum)/((1.0)*(goals.length)); 
    System.out.println("Average goals: "+ averageGoals);


    // finding the max value
    int max = 0;
    for(int goal: goals){
      if (goal>max){
        max = goal;
      }
    }
    System.out.println("The max goal amount was: "+max);
  }

  

  
}